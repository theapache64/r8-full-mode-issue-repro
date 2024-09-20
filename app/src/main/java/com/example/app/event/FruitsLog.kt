package com.example.app.event

import com.example.app.Fruit
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow

// TODO: Write test : https://hotstar.atlassian.net/browse/CORE-4093
/**
 * Do not use this class directly.
 * Use [FruitsSource] interface to collect fruits and [FruitsSink] to fire fruits
 */
class FruitsLog  : FruitsSource, FruitsSink {

    // To store all fruits happened
    private val fruitsHistory = mutableListOf<FruitHistory>()

    // To observe future fruits
    private val fruits = MutableSharedFlow<Fruit>(
        replay = 0,
        extraBufferCapacity = 1
    )

    override suspend fun emit(fruit: Fruit) {
        // emit event
        fruits.emit(fruit)
        // then add it to history, so that it can be used in [hasFruitsOccurredAfter]
        fruitsHistory.add(
            FruitHistory(
                timestamp = System.currentTimeMillis(),
                fruit = fruit
            )
        )
    }

    override fun hasFruitsCameAfter(
        fruits: List<Fruit>,
        timestamp: Long
    ): Boolean {
        val index = fruitsHistory.binarySearch { history ->
            if (history.timestamp > timestamp) 1 else -1
        }
        // binarySearch return value = -insertionPoint -1, if the value is not found
        val startIndex = if (index >= 0) index else -index - 1
        return fruitsHistory
            .subList(startIndex, fruitsHistory.size)
            .any { history ->
                // checking if given fruits contains any of the pastFruits
                fruits.contains(history.fruit)
            }
    }

    override fun fruits(): Flow<Fruit?> {
        return fruits
    }
}

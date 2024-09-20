package com.example.app.event

import androidx.compose.runtime.Immutable
import com.example.app.Fruit
import kotlinx.coroutines.flow.Flow

interface FruitsSink {
    suspend fun emit(fruit: Fruit)
}

interface FruitsSource {
    fun hasFruitsCameAfter(fruits: List<Fruit>, timestamp: Long): Boolean
    fun fruits(): Flow<Fruit?>
}

@Immutable
data class FruitHistory(
    val timestamp: Long,
    val fruit: Fruit
)
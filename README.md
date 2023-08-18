# r8-full-mode-issue-repro

**Reproducible Issue with R8's `fullMode` in Kotlin Android Project**

![image](https://github.com/theapache64/r8-full-mode-issue-repro/assets/9678279/c76a5662-98cc-4351-bc69-51485c9c4124)

## Description

This project showcases a reproducible issue related to R8's `fullMode` in a Kotlin Android project. When utilizing R8's `fullMode`, classes are organized in an unexpected manner, resulting in the display of a variable set as `Fruit.Cherry` being shown as `Fruit.Fig`.

## Prerequisites

To replicate the issue, ensure you have the following prerequisites set up:

1. Android Studio installed on your system.
2. Basic familiarity with Kotlin and Android development concepts.

## Steps to Reproduce

1. Clone the repository:

```bash
git clone git@github.com:theapache64/r8-full-mode-issue-repro.git
cd git@github.com:theapache64/r8-full-mode-issue-repro.git
```

2. Open the project in Android Studio.

3. Create a release build using the "Build" menu or the Gradle task panel.

4. Run the app on an emulator or physical device.

5. Observe the app's behavior. The program should assign a value to `Fruit.Cherry`, but it is displayed as `Fruit.Fig`.

## Expected Behavior

The app should correctly display `Fruit.Cherry`

## Issue Details

The problem appears to be connected to the `fullMode` configuration in R8. This setting results in unexpected class organization, resulting unpredictable code.

package com.example.getfitorgethit

object StepCounter {
    private var totalSteps = 0f

    fun getSteps():Float {
        return totalSteps
    }

    fun setSteps(steps:Float) {
        totalSteps = steps
    }
}
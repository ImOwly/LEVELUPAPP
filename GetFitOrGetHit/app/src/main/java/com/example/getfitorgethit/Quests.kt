package com.example.getfitorgethit

import kotlin.random.Random

object Quests {
    private var quests: Array<String> = arrayOf("Walk for 1km","Walk for 5km","Walk for 10km","Do 10 sit-ups", "Do 10 push-ups")
    private var kmInSteps: IntArray = intArrayOf(1515,7575,15150)
    private val damageNumbers: IntArray = intArrayOf(150,300,600,150,150)
    private var questOneIndex = -1
    private var questTwoIndex = -1
    private var questThreeIndex = -1
    private var canRefreshQuests = true
    private var questOneIsComplete = false
    private var questTwoIsComplete = false
    private var questThreeIsComplete = false
    private var initialSteps = 0.0f;

    fun generateQuests() {
        if (canRefreshQuests) {
            questOneIndex = Random.nextInt(0, 4)
            questTwoIndex = Random.nextInt(0, 4)
            questThreeIndex = Random.nextInt(0, 4)
            initialSteps = StepCounter.getSteps();
            canRefreshQuests = false
        }
    }

    fun questAutoComplete(index:Int):Boolean {
        if (index > 3 || index < 0) {
            return false
        }
        if (index == 1 && questOneIndex < 3 && questOneIndex >= 0) {
            return false
        }
        if (index == 2 && questTwoIndex < 3 && questTwoIndex >= 0) {
            return false
        }
        if (index == 3 && questThreeIndex < 3 && questThreeIndex >= 0) {
            return false
        }
        return true
    }

    fun getQuestOneName():String {
        return quests.get(questOneIndex)
    }

    fun getQuestTwoName():String {
        return quests.get(questTwoIndex)
    }

    fun getQuestThreeName():String {
        return quests.get(questThreeIndex)
    }

    fun getQuestOneDamage():Int {
        questOneIsComplete = true
        return damageNumbers.get(questOneIndex)
    }

    fun getQuestTwoDamage():Int {
        questTwoIsComplete = true
        return damageNumbers.get(questTwoIndex)
    }

    fun getQuestThreeDamage():Int {
        questThreeIsComplete = true
        return damageNumbers.get(questThreeIndex)
    }

    fun questOneIsComplete():Boolean {
        return questOneIsComplete
    }

    fun questTwoIsComplete():Boolean {
        return questTwoIsComplete
    }

    fun questThreeIsComplete():Boolean {
        return questThreeIsComplete
    }

    fun questOneProgress():Boolean {
        if (questOneIndex < 3 && questOneIndex >= 0) {
            return StepCounter.getSteps() - initialSteps >= kmInSteps.get(questOneIndex)
        }
        return false
    }

    fun questTwoProgress():Boolean {
        if (questTwoIndex < 3 && questTwoIndex >= 0) {
            return StepCounter.getSteps() - initialSteps >= kmInSteps.get(questTwoIndex)
        }
        return false
    }

    fun questThreeProgress():Boolean {
        if (questThreeIndex < 3 && questThreeIndex >= 0) {
            return StepCounter.getSteps() - initialSteps >= kmInSteps.get(questThreeIndex)
        }
        return false
    }
}
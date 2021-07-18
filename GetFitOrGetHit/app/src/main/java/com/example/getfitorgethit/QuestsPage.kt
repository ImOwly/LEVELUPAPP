package com.example.getfitorgethit
import android.media.MediaPlayer
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.getfitorgethit.R
import kotlin.random.Random

class QuestsPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quests_page)

        //creates the back button quest activity that goes back to main screen
        var backbuttonquest = findViewById<Button>(R.id.bbquests)
        backbuttonquest.setOnClickListener {
            val ibquests = Intent(this, MainActivity::class.java)
            startActivity(ibquests)
        }

        var currhealth=0
        var damagetaken=0

        //finds the quest tab
        var firstquest = findViewById<TextView>(R.id.quest1)
        var secondquest = findViewById<TextView>(R.id.quest2)
        var thirdquest = findViewById<TextView>(R.id.quest3)

        //generates a random values so quests are spawned randomly
        Quests.generateQuests()
        firstquest.text = Quests.getQuestOneName()
        secondquest.text = Quests.getQuestTwoName()
        thirdquest.text = Quests.getQuestThreeName()

        //initalizes the complete button on quests
        var completebt1 = findViewById<Button>(R.id.complete1)
        completebt1.setOnClickListener {
            //checks if quest is complete
            if(Quests.questAutoComplete(1) || Quests.questOneProgress()){
                completebt1.text = "Complete"
            }
            //if complete, take the damage and decrease boss health
            if(completebt1.text == "Complete" && !Quests.questOneIsComplete()){
                //Get amount of damage done
                damagetaken=Quests.getQuestOneDamage()
                //calculate boss new health
                currhealth=Boss.getbosshealth()
                currhealth=currhealth-damagetaken
                Boss.setcurrbosshealth(currhealth)
            }
        }
        //initial check if they are the quests that dont revolve around walking
        if(Quests.questAutoComplete(1)){
            completebt1.text = "Complete"
        }

        var completebt2 = findViewById<Button>(R.id.complete2)
        completebt2.setOnClickListener {
            if(Quests.questAutoComplete(2) || Quests.questTwoProgress()){
                completebt2.text = "Complete"
            }
            if(completebt2.text == "Complete" && !Quests.questTwoIsComplete()){
                damagetaken=Quests.getQuestTwoDamage()
                currhealth=Boss.getbosshealth()
                currhealth=currhealth-damagetaken
                Boss.setcurrbosshealth(currhealth)
            }
        }
        if(Quests.questAutoComplete(2)){
            completebt2.text = "Complete"
        }

        var completebt3 = findViewById<Button>(R.id.complete3)
        completebt3.setOnClickListener {
            if(Quests.questAutoComplete(3) || Quests.questThreeProgress()){
                completebt3.text = "Complete"
            }
            if(completebt3.text == "Complete" && !Quests.questThreeIsComplete()){
                damagetaken=Quests.getQuestThreeDamage()
                currhealth=Boss.getbosshealth()
                currhealth=currhealth-damagetaken
                Boss.setcurrbosshealth(currhealth)
            }
        }
        if(Quests.questAutoComplete(3)) {
            completebt3.text = "Complete"
        }
    }
}
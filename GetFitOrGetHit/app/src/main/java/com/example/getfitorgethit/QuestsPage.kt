package com.example.getfitorgethit

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

        //initializes array of quests as well as reward values
        var quests: Array<String> = arrayOf("Walk for 1km","Walk for 5km","Walk for 10km","Do 10 sit-ups", "Do 10 push-ups")
        val damagenumbers: IntArray = intArrayOf(150,300,600,150,150)

        //finds the quest tab
        var firstquest = findViewById<TextView>(R.id.quest1)
        var secondquest = findViewById<TextView>(R.id.quest2)
        var thirdquest = findViewById<TextView>(R.id.quest3)

        //generates a random values so quests are spawned randomly
        val randomval1 = Random.nextInt(0,4)
        firstquest.text = quests.get(randomval1)
        val randomval2 = Random.nextInt(0,4)
        secondquest.text = quests.get(randomval2)
        val randomval3 = Random.nextInt(0,4)
        thirdquest.text = quests.get(randomval3)

        //initalizes the complete button on quests
        var completebt1 = findViewById<Button>(R.id.complete1)
        completebt1.setOnClickListener {
            //checks if it is complete
            if(randomval1 > 2){
                completebt1.text = "Complete"
            }
            //if it is complete take the damamge and decrease boss health
            if(completebt1.text == "Complete"){
                damagetaken=damagenumbers.get(randomval1)
                currhealth=Boss.getbosshealth()
                currhealth=currhealth-damagetaken
                Boss.setcurrbosshealth(currhealth)
            }
        }
        //initial check if they are the quests that dont revolve around walking
        if(randomval1 > 2){
            completebt1.text = "Complete"
        }

        var completebt2 = findViewById<Button>(R.id.complete2)
        completebt2.setOnClickListener {
            if(randomval2 > 2){
                completebt2.text = "Complete"
            }
            if(completebt2.text == "Complete"){
                damagetaken=damagenumbers.get(randomval2)
                currhealth=Boss.getbosshealth()
                currhealth=currhealth-damagetaken
                Boss.setcurrbosshealth(currhealth)

            }
        }
        if(randomval2 > 2){
            completebt2.text = "Complete"
        }
        var completebt3 = findViewById<Button>(R.id.complete3)
        completebt3.setOnClickListener {
            if(randomval3 > 2){
                completebt3.text = "Complete"
            }
            if(completebt3.text == "Complete"){
                damagetaken=damagenumbers.get(randomval2)
                currhealth=Boss.getbosshealth()
                currhealth=currhealth-damagetaken
                Boss.setcurrbosshealth(currhealth)
            }
        }
        if(randomval3 > 2){
            completebt3.text = "Complete"
        }


        
    }
}
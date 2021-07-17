package com.example.getfitorgethit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.getfitorgethit.R
import kotlin.random.Random

class QuestsPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quests_page)

        var backbuttonquest = findViewById<Button>(R.id.bbquests)
        backbuttonquest.setOnClickListener {
            val ibquests = Intent(this, MainActivity::class.java)
            startActivity(ibquests)
        }

        val numofcompletequests=0
        var quests: Array<String> = arrayOf("Walk for 1km","Walk for 5km","Walk for 10km","Do 10 sit-ups", "Do 10 push-ups")
        var firstquest = findViewById<TextView>(R.id.quest1)
        var secondquest = findViewById<TextView>(R.id.quest2)
        var thirdquest = findViewById<TextView>(R.id.quest3)
        val randomval1 = Random.nextInt(0,4)
        firstquest.text = quests.get(randomval1)
        val randomval2 = Random.nextInt(0,4)
        secondquest.text = quests.get(randomval2)
        val randomval3 = Random.nextInt(0,4)
        thirdquest.text = quests.get(randomval3)

        var completebt1 = findViewById<Button>(R.id.complete1)
        completebt1.setOnClickListener {
            if(randomval1 > 2){
                completebt1.visibility = View.VISIBLE
            }
            //val intentcbt1 = Intent(this, QuestsPage::class.java)
        }

        var completebt2 = findViewById<Button>(R.id.complete2)
        completebt2.setOnClickListener {
            if(randomval2 > 2){
                val complete2Button = Button(this)
                complete2Button.text= "Complete"
                Button complete2 = new Button(this);
                complete2.setText("Complete");
                completebt2.visibility = View.VISIBLE
            }
            //val intentcbt2 = Intent(this, QuestsPage::class.java)
        }
        var completebt3 = findViewById<Button>(R.id.complete3)
        completebt3.setOnClickListener {
            if(randomval3 > 2){
                completebt3.visibility = View.VISIBLE
            }
            //val intentcbt3 = Intent(this, QuestsPage::class.java)
        }



    }
}
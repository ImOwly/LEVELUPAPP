package com.example.getfitorgethit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.getfitorgethit.R

class QuestsPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quests_page)

        var backbuttonquest = findViewById<Button>(R.id.bbquests)
        backbuttonquest.setOnClickListener {
            val ibquests = Intent(this, MainActivity::class.java)
            startActivity(ibquests)
        }
    }
}
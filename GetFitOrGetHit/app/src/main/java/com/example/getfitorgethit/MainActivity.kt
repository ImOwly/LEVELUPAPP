package com.example.getfitorgethit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var statsbutton = findViewById<Button>(R.id.statspagebutton)
        statsbutton.setOnClickListener {
            val intentstats = Intent(this, StatsPage::class.java)
            startActivity(intentstats)
        }

        var questsbutton = findViewById<Button>(R.id.questpagebutton)
        questsbutton.setOnClickListener {
            val intentquests = Intent(this, QuestsPage::class.java)
            startActivity(intentquests)
        }

        var shopbutton = findViewById<Button>(R.id.shoppagebutton)
        shopbutton.setOnClickListener {
            val intentshop = Intent(this, ShopPage::class.java)
            startActivity(intentshop)
        }

        var settingsbutton = findViewById<Button>(R.id.settingspagebutton)
        settingsbutton.setOnClickListener {
            val intentsettings = Intent(this, SettingsPage::class.java)
            startActivity(intentsettings)
        }
    }
}
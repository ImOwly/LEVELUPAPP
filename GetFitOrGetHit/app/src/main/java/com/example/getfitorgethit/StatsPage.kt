package com.example.getfitorgethit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class StatsPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stats_page)


        var backbuttonstats = findViewById<Button>(R.id.bbstats)
        backbuttonstats.setOnClickListener {
            val ibstats = Intent(this, MainActivity::class.java)
            startActivity(ibstats)
        }
    }
}
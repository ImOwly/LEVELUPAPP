package com.example.getfitorgethit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SettingsPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings_page)

        var backbuttonsettings = findViewById<Button>(R.id.bbsettings)
        backbuttonsettings.setOnClickListener {
            val ibsettings = Intent(this, MainActivity::class.java)
            startActivity(ibsettings)
        }
    }
}
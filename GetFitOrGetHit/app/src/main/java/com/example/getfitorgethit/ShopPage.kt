package com.example.getfitorgethit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ShopPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop_page)

        var backbuttonshop = findViewById<Button>(R.id.bbshop)
        backbuttonshop.setOnClickListener {
            val ibshop = Intent(this, MainActivity::class.java)
            startActivity(ibshop)
        }
    }
}
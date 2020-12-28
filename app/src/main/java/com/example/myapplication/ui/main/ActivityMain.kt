package com.example.myapplication.ui.main

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat
import com.example.myapplication.R

class ActivityMain : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "MainActivity"
        val imageView: ImageView = findViewById(R.id.image_activity_1)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this@ActivityMain, MainActivityWithFragment::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this@ActivityMain, imageView, ViewCompat.getTransitionName(imageView)!!
            )
            startActivity(intent, options.toBundle())
        }
    }
}
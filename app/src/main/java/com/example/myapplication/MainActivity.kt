package com.example.myapplication

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat


class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Activity 1"
        val imageView: ImageView = findViewById(R.id.image_activity_1)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, Activity2::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this@MainActivity, imageView, ViewCompat.getTransitionName(imageView)!!
            )
            startActivity(intent, options.toBundle())
        }
    }
}
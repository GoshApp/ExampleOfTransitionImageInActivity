package com.example.myapplication.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat
import com.example.myapplication.R

class MainActivityWithFragment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        title = "MainActivityWithFragment"
        val imageView: ImageView = findViewById(R.id.image_activity_1)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this@MainActivityWithFragment, ActivityMain::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this@MainActivityWithFragment, imageView, ViewCompat.getTransitionName(imageView)!!
            )
            startActivity(intent, options.toBundle())
        }
    }
}
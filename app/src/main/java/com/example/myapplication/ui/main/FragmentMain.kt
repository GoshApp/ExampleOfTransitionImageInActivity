package com.example.myapplication.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment
import com.example.myapplication.R


class FragmentMain : Fragment() {

    companion object {
        fun newInstance() = FragmentMain()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewFragment: View = inflater.inflate(R.layout.main_fragment, container, false)

        val imageView: ImageView = viewFragment.findViewById(R.id.imageView)
        val button: Button = viewFragment.findViewById(R.id.button)

        button.setOnClickListener {
            val intent = Intent(activity, ActivityMain::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                activity!!, imageView, ViewCompat.getTransitionName(imageView)!!
            )
            startActivity(intent, options.toBundle())
        }
        return viewFragment
    }
}
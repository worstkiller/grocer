package com.vikas.grocer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vikas.grocer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private lateinit var mainActivityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivityMainBinding = ActivityMainBinding.bind(window.decorView.rootView)
    }

}
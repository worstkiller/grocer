package com.vikas.grocer

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.vikas.grocer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private lateinit var mainActivityBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivityBinding = ActivityMainBinding.bind(getParentView())
        loadToolbarIcons()
        setClickListeners()
    }

    private fun loadToolbarIcons() {
        mainActivityBinding.toolbar.ivFrontIcon.setImageResource(R.drawable.ic_filter_navigation)
        mainActivityBinding.toolbar.ivBackIcon.setImageResource(R.drawable.ic_shopping_bag)
    }

    private fun getParentView(): View {
        return window.decorView.rootView.findViewById(R.id.clMainViewParent)
    }

    private fun setClickListeners() {
        mainActivityBinding.toolbar.ivBackIcon.setOnClickListener {
            //handle the back icon click on the toolbar
            Toast.makeText(this, "Click on cart", Toast.LENGTH_SHORT).show()
        }

        mainActivityBinding.toolbar.ivFrontIcon.setOnClickListener {
            //handle the front icon click on the toolbar
            Toast.makeText(this, "Click on filter", Toast.LENGTH_SHORT).show()
        }
    }

}
package com.kenruizinoue.fragmenttemplate01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
                // add fragment inside fragmentContainer
                .add(R.id.fragmentContainer, OneFragment(), "OneFragment").commit()
    }
}
package com.example.mockcode

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity2.*

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)
        init()
    }

    private fun init() {
        button2.setOnClickListener {
            startActivity(Intent(this, Activity3::class.java))
        }
    }


}
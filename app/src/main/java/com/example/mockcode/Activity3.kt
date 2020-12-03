package com.example.mockcode

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity3.*

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity3)
        init()
    }

    private fun init() {
        button3.setOnClickListener {
            startActivity(Intent(this, ActivityWithFragment::class.java))
        }
    }


}
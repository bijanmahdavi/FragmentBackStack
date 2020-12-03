package com.example.mockcode

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        button1.setOnClickListener {
            startActivity(Intent(this, Activity2::class.java))
        }
    }

    @Override
    override fun onBackPressed() {
        println("Can't leave that easily ;)")
    }

}
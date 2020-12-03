package com.example.mockcode

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity3.button3

class ActivityWithFragment : AppCompatActivity() {
    private val manager: FragmentManager = supportFragmentManager
    private var fragIndex = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_with_fragment)
        init()
    }

    private fun init() {
        button3.setOnClickListener {
            when(fragIndex) {
                0 -> replaceFragment(Fragment1(), "one")
                1 -> replaceFragment(Fragment2(), "two")
                2 -> replaceFragment(Fragment3(), "three")
                else -> println("End of the ride!!")
            }

        }
    }

    private fun replaceFragment(fragment: Fragment, string: String) {
        if(fragIndex < 3) {
            manager.beginTransaction().replace(R.id.frame_container, fragment).addToBackStack(string).commit()
            fragIndex++
        }
    }

    @Override
    override fun onBackPressed() {
        fragIndex--
        super.onBackPressed()
    }




}
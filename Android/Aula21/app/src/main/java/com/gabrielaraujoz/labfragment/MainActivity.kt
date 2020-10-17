package com.gabrielaraujoz.labfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        btnFragmentFirst.setOnClickListener {
            changeFragment(firstFragment)
        }

        btnFragmentSecond.setOnClickListener {
            changeFragment(secondFragment)
        }




    }

    val manager = supportFragmentManager

    fun changeFragment(fragment: Fragment) {
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.fragmentView, fragment)
        transaction.commit()
    }

}


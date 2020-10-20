package com.gabrielaraujoz.labfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var manager: FragmentManager

    fun changeFragment(fragment: Fragment) {
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.fragmentView, fragment)
        transaction.commit()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        manager = supportFragmentManager

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        btnFragmentFirst.setOnClickListener {
            changeFragment(firstFragment)
        }

        btnFragmentSecond.setOnClickListener {
            changeFragment(secondFragment)
        }




    }


}


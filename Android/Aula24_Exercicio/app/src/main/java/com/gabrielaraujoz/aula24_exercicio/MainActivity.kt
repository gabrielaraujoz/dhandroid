package com.gabrielaraujoz.aula24_exercicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        tabLayout.setupWithViewPager(viewPager)

        val fragments = listOf(
            LoginFragment(), SignupFragment()
        )

        val titulos = listOf (
            getString(R.string.login), getString(R.string.signup)
        )

        viewPager.adapter = ViewPagerAdapter(fragments, titulos, supportFragmentManager)
    }
}
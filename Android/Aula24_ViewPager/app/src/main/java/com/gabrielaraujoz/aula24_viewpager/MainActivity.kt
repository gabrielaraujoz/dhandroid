package com.gabrielaraujoz.aula24_viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //declarando a ViewPager e a TabLayout (obtendo do XML
        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)


        // Faz com que a tab use a viewPager
        tabLayout.setupWithViewPager(viewPager)


        // define quais fragments e quais os nomes deles
        val fragments = listOf(
            MeuFragment(), MeuFragment(), MeuFragment()
        )

        val titulos = listOf (
            getString(R.string.home), getString(R.string.biblioteca), getString(R.string.favoritos)
        )


        //Passa as informações para o Adapter
        viewPager.adapter = ViewPagerAdapter(fragments, titulos, supportFragmentManager)


        //Adiciona ícones nas tabs
        tabLayout.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24)
        tabLayout.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_library_books_24)
        tabLayout.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_star_24)

        //Adiciona badge na tab de position 1
        tabLayout.getTabAt(1)!!.orCreateBadge.apply {
            number = 100
            maxCharacterCount = 3
            isVisible = true
        }


        //remove a badge da tab de position 1 quando clicar nela
        tabLayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener {
            override fun onTabSelected(selected: TabLayout.Tab?) {
                if (selected!!.position == 1) {
                    tabLayout.getTabAt(1)!!.badge?.isVisible = false
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }


        })
    }
}
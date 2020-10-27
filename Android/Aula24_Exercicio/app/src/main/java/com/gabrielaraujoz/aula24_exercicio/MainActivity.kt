package com.gabrielaraujoz.aula24_exercicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import org.w3c.dom.Text

const val LOG_IN_FRAGMENT = 0
const val SIGN_UP_FRAGMENT = 1

class MainActivity : AppCompatActivity(), IMudarTab {

    private val tab by lazy { findViewById<TabLayout>(R.id.tabLayout)}

    private lateinit var loginFragment: LoginFragment

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

    override fun mudarTab(posicao: Int) {
        var novaPosicao = if (posicao == LOG_IN_FRAGMENT) {
            SIGN_UP_FRAGMENT
        } else {
            LOG_IN_FRAGMENT
        }

        val tabNova = tab.getTabAt(novaPosicao)
        tabNova?.select()
    }

    override fun usernameAlterado(username: String) {
        loginFragment.usernameAlterado(username)
    }
}
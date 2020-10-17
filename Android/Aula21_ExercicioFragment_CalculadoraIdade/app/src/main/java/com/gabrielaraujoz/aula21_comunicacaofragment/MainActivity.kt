package com.gabrielaraujoz.aula21_comunicacaofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.fragment_show.*
import java.time.Year
import java.util.*

class MainActivity : AppCompatActivity(), changeShowFrag {

    var inputFrag = InputFragment()
    var showFrag = ShowFragment()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = supportFragmentManager


        val transaction = manager.beginTransaction()
        transaction.replace(R.id.container1, inputFrag)
        transaction.commit()

        val transaction2 = manager.beginTransaction()
        transaction2.replace(R.id.container2, showFrag)
        transaction2.commit()

    }

    override fun changeShow(name: String, year: Int) {
        super.changeShow(name, year)
        var now = Calendar.getInstance().get(Calendar.YEAR).toInt()
        var actualAge = now - year
        if (actualAge < 0) {
            showFrag.showResult.text = "$name, você ainda não nasceu"
        } else if (actualAge == 0 ) {
            showFrag.showResult.text = "$name, você tem menos de 1 ano."

        } else if (actualAge == 1) {
            showFrag.showResult.text = "$name, você tem $actualAge ano."
        } else {
            showFrag.showResult.text = "$name, você tem $actualAge anos."
        }
    }



}
package com.example.newfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var fragment1 = findViewById<Button>(R.id.fragment1)
//        var fragment2 = findViewById<Button>(R.id.fragment2)
        val navigation=findViewById<BottomNavigationView>(R.id.bottomNav)

        navigation.setOnItemSelectedListener {
        when(it.itemId){
            R.id.profile1 -> onclickfrgment(BlankFragment1())
            R.id.profile2 -> onclickfrgment(BlankFragment2())
            R.id.profile3 -> onclickfrgment(BlankFragment3())
        }



    true
        }





    }
    fun onclickfrgment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fragmentshow,fragment).commit()

    }
}
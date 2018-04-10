package com.connectinnov.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

     val foodList = arrayListOf<String>("Pizza", "AluPakode", "Chaat", "Pani Puri")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideFoodBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.size)

            selectedFoodTxt.text = foodList[randomFood]
        }

        addFoodBtn.setOnClickListener {

            foodList.add(addFoodTxt.text.toString())
            addFoodTxt.text.clear()
        }
    }

}

package com.example.tripcoust

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_calculate.setOnClickListener {
            val distance = edit_distance.text.toString().toFloat()
            val price = edit_price.text.toString().toFloat()
            val autonomy = edit_autonomy.text.toString().toFloat()

            val totalCoust = (distance* price) / autonomy

            text_coust.text = "R$ $totalCoust"
        }

    }


}
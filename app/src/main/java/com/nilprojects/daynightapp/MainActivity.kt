package com.nilprojects.daynightapp

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        day_night_switch.setListener {
            isNight ->
            if(isNight)
            {
                Toast.makeText(this,"Good Night",Toast.LENGTH_SHORT).show()
                layout.setBackgroundColor(Color.parseColor("#34495e"))
                layout.setBackgroundResource(R.drawable.dark)

            }
            else
            {
                Toast.makeText(this,"Good Morning",Toast.LENGTH_SHORT).show()
                layout.setBackgroundColor(Color.parseColor("#349Bdb"))
                layout.setBackgroundResource(R.drawable.day)
            }
        }
    }
}

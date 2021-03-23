package com.example.traningdb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
      
        val name = intent.getStringExtra("Name")
        val count = intent.getIntExtra("Age",0)
        ahahah.text= name
        textView4.text = count.toString()

    }
}
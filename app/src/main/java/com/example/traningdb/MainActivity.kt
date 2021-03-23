package com.example.traningdb

import android.util.Log
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.LinearLayout
import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.database.sqlite.SQLiteOpenHelper
import android.view.View
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import kotlinx.android.synthetic.main.activity_main.*
import java.time.temporal.WeekFields


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val context = this
        var db = DataBaseHandler(context)
        var user = User("Pavel",10)
        db.insertData(user)
        val test = db.readData()
        print(123)
        val i =0
        db.deleteData()
        button.text = test.size.toString()
        for (i in test)
        {
            Toast.makeText(this,i.name.toString(),Toast.LENGTH_SHORT).show()
        }
        button.setOnClickListener()
        {
            if(editTextTextPersonName.length()< 1)
            {
                textView3.text = "Имя Введено Неправильно!"
            }
            else if (editTextTextPersonName2.length() < 1)
            {
                textView2.text = "Возаст Введено Неправильно!"
            }
            else
            {
                val name = editTextTextPersonName.text.toString()
                val age = editTextTextPersonName2.text.toString().toInt()
                var user = User(name,age)
                db.insertData(user)
                val t = Intent(this, second::class.java)
                t.putExtra("Name", name);
                t.putExtra("Age", age);
                startActivity(t)

            }

        }
    }



}
package com.example.multiline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.Zmien).setOnClickListener {
            findViewById<EditText>(R.id.multiText).setText("Marcin \n Kołacz")
            //findViewById<EditText>(R.id.multiText).setText( R.string.Napis)
        }
    }



}
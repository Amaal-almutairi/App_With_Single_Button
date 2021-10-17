package com.example.appwithsinglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var name : EditText
    lateinit var button: Button
    lateinit var textv:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.et1)
        button = findViewById(R.id.b1)
        textv = findViewById(R.id.textv)

        button.setOnClickListener {
            var info = name.text.toString()
            textv.text = info
            name.text.clear()
            name.clearFocus()

        }
    }
}
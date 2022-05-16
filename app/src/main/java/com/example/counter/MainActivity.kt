package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var mButton: Button
    private lateinit var mNumberField: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        mNumberField = findViewById(R.id.textView)
        mNumberField.text = viewModel.number.toString()
        mButton = findViewById(R.id.add_button)

        mButton.setOnClickListener{
            viewModel.add()
            mNumberField.text = viewModel.number.toString()
        }
    }
}
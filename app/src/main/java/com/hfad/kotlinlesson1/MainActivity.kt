package com.hfad.kotlinlesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.text_view)
        val textViewEquals: TextView = findViewById(R.id.text_data_class)
        val textViewCopy: TextView = findViewById(R.id.text_copy)

        val button: Button = findViewById(R.id.btn)
        button.setOnClickListener {
            textView.text = "Привет Котлинист!!!))"
        }
        val dataClass = DataClassSome("Ivan", "Ivanov")
        val dataClass2 = DataClassSome("Ivan", "Ivanov")
        val isEquals = dataClass == dataClass2

        textViewEquals.text = isEquals.toString()


        Singlton
        if (dataClass == dataClass2) {

            textViewCopy.text = dataClass.name
        } else {
            textViewCopy.text = "не равны"
        }


    }
}

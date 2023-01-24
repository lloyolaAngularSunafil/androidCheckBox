package com.example.checkboxradiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            var respuesta=""

            if (checkBox1.isChecked)
                respuesta=respuesta+"CB1"
            if (checkBox2.isChecked)
                respuesta=respuesta+"CB2"
            if (radioButton1.isChecked)
                respuesta=respuesta+"RB1"
            if (radioButton2.isChecked)
                respuesta=respuesta+"RB2"

            Toast.makeText(applicationContext,respuesta, Toast.LENGTH_LONG).show()

        }
    }
}
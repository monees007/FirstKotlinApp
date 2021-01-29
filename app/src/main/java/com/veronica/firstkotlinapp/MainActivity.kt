package com.veronica.firstkotlinapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val asher : TextView = findViewById<TextView>(R.id.textView)
        var count : Int = 0
        var can : String = "Press Next Button First !"
        val EXTRA_COUNT = "com.veronica.firstkotlinapp.COUNT"
        var myToast : Toast

        val nextButton : Button = findViewById<Button>(R.id.next_button)
            nextButton.setOnClickListener{
                count += 1
                can = count.toString()
                asher.text = can
        }

        val toastButton : Button = findViewById<Button>(R.id.toast_button)
            toastButton.setOnClickListener{
                myToast =  Toast.makeText(this, can, Toast.LENGTH_SHORT)
                myToast.show()
        }

        val randomButton : Button = findViewById(R.id.random_button)
            randomButton.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra(EXTRA_COUNT,can)
                }
                startActivity(intent)
            }
    }
}



package com.veronica.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val can = intent.getStringExtra("EXTRA_COUNT")
        var titlev : String = "Here is a random number between 0 and $can!"
        var titleb : TextView = findViewById<TextView>(R.id.titleb)
            titleb.setText(titlev)
        var contentb : TextView = findViewById(R.id.contentb)
        val random = java.util.Random()
        var randomNumber = 0
        var count : Int = can.toInt()
        if (count > 0) {
            randomNumber = random.nextInt(count + 1)
            contentb.setText("$randomNumber")
        }
    }
}



package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        var nameInput = findViewById<TextView>(R.id.nameInput)
        var nextBtn = findViewById<Button>(R.id.nextBtn)

        nextBtn.setOnClickListener{
            if (nameInput.text.toString().isEmpty()){
                Toast.makeText(this, "Enter Your Name", Toast.LENGTH_LONG).show()
            }else{
                var intent = Intent(this, QuestuinsActivity::class.java)
                startActivity(intent)
                finish()
            }
        }


    }
}
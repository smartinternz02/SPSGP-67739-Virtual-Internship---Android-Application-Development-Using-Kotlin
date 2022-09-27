package com.example.msgshareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b1 : Button = findViewById(R.id.btnShowToast)
        b1.setOnClickListener{
            Toast.makeText(this,"Hello",Toast.LENGTH_SHORT).show()
        }
        val b2 :Button = findViewById(R.id.btnSendMessageToNextActivity)
        b2.setOnClickListener{
            val userMessage :EditText = findViewById(R.id.etUserMessage)
            val message:String=userMessage.text.toString()
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
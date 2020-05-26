package com.example.androidcoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var login:Button
    lateinit var register:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login = findViewById(R.id.btnLogin)
        register = findViewById(R.id.btnRegister)
        login.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        })
        register.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        })
    }
}

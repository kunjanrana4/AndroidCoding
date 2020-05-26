package com.example.androidcoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.edtPassword
import kotlinx.android.synthetic.main.activity_login.edtUsername
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val register = findViewById<Button>(R.id.btnRegister)
        register.setOnClickListener(View.OnClickListener {
            intent = Intent(this,LoginActivity::class.java)
            intent.putExtra("USERNAME",edtUsername.text.toString())
            intent.putExtra("PASSWORD",edtPassword.text.toString())
            intent.putExtra("FIRST",edtFirstName.text.toString())
            intent.putExtra("LAST",edtLastName.text.toString())
            startActivity(intent)
        })
    }
}

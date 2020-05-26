package com.example.androidcoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_register.edtPassword
import kotlinx.android.synthetic.main.activity_register.edtUsername

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val bundle:Bundle?= intent.extras
        val username = bundle?.get("USERNAME").toString()
        val password = bundle?.get("PASSWORD").toString()
        val firstname = bundle?.get("FIRST").toString()
        val lastname = bundle?.get("LAST").toString()
        Toast.makeText(this,username+""+password,Toast.LENGTH_LONG).show()
        edtUsername.setText(username)
        edtPassword.setText(password)

        Login.setOnClickListener{
            if(username.isEmpty())
            {
                Toast.makeText(this,"First you need to register.", Toast.LENGTH_LONG).show()
            }
            else
            {
                intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("USERNAME",username)
                intent.putExtra("PASSWORD",password)
                intent.putExtra("FIRST",firstname)
                intent.putExtra("LAST",lastname.toString())
                startActivity(intent)
            }
        }
    }
}

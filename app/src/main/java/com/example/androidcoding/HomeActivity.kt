package com.example.androidcoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.ArrayAdapter as ArrayAdapter1

class HomeActivity : AppCompatActivity() {

    lateinit var username:String
    lateinit var password:String
    lateinit var firstname:String
    lateinit var lastname:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val bundle:Bundle?= intent.extras
        username = bundle?.get("USERNAME").toString()
        password = bundle?.get("PASSWORD").toString()
        firstname = bundle?.get("FIRST").toString()
        lastname = bundle?.get("LAST").toString()
        val listViewInfo = findViewById<ListView>(R.id.listInfo)
        val infoAdapter = android.widget.ArrayAdapter(this,android.R.layout.simple_list_item_1,getInfo())
        listViewInfo.adapter = infoAdapter
        listViewInfo.setOnItemClickListener{parent, view, position, id ->  
            loadFragment()
        }
    }
    private fun loadFragment()
    {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val display = Display()
        fragmentTransaction.add(R.id.fragment_container,display)
        fragmentTransaction.commit()
    }
    fun getInfo():ArrayList<String>
    {
        val info : ArrayList<String> = ArrayList()
        info.add(username)
        info.add(firstname)
        info.add(lastname)
        return info
    }
}

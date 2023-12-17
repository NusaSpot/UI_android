package com.dicoding.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.myapplication.R
import com.dicoding.myapplication.RegisterActivity


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val tv_register: TextView = findViewById(R.id.tv_register)
        val reset_page : TextView = findViewById(R.id.reset_page)
        val otp : TextView = findViewById(R.id.cirLoginButton)

        tv_register.setOnClickListener {
            val intent = Intent(this, RiwayatActivity::class.java)
            startActivity(intent)
        }
        reset_page.setOnClickListener {
            val intent = Intent(this, AhliGiziActivity::class.java)
            startActivity(intent)
        }
        otp.setOnClickListener {
            val intent = Intent(this,HealthyActivity::class.java)
            startActivity(intent)
        }
    }

}

package com.example.casocopaamerica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.E

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val Email: EditText = findViewById(R.id.etEmail)
        val Password: EditText = findViewById(R.id.etPassword)
        val BtnSignIn: Button = findViewById(R.id.btnSignIn)

        BtnSignIn.setOnClickListener {
            val email: String = Email.text.toString()
            val password: String = Password.text.toString()

            if (email == "admin@americancup.com" && password == "admin123"){
                val intent = Intent(this, Menu::class.java)
                startActivity(intent)
            }
            Toast.makeText(this, "Credenciales Invalidas", Toast.LENGTH_SHORT).show()
        }

    }
}
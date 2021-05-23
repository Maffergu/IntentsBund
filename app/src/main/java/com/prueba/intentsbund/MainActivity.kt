package com.prueba.intentsbund

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOpen.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("valor", "Hola mundo")
            intent.putExtra("valor2", "Prueba")
            startActivity(intent)

        }

        btnOpen2.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)

        }

        btnOpen3.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)

        }

        btnOpen4.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)

        }
    }
}
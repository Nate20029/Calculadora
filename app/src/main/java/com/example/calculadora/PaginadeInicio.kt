package com.example.calculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PaginadeInicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paginade_inicio)

        val paginadeInicio: Button= findViewById(R.id.paginainicio)

        paginadeInicio.setOnClickListener(){
            val intent: Intent = Intent(this,MainActivity ::class.java)
            startActivity(intent)
            finish()
        }
    }
}
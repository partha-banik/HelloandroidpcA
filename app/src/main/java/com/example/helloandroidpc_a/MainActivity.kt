package com.example.helloandroidpc_a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ClickFunction() {
        Toast.makeText( this,"Thank you for clicking me", Toast.LENGTH_SHORT).show()
    }

    fun ClickFunction(view: View) {}
}
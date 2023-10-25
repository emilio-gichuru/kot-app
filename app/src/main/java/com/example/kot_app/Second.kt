package com.example.kot_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text


class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)



        var firstName = intent.getStringExtra("firstName");
        var lastName = intent.getStringExtra("lastName");

        var name = " my first name is:  ${firstName} and my last name is :  ${lastName} ";

        var nameText = findViewById<TextView>(R.id.name);

        nameText.setText(name);

    }
}
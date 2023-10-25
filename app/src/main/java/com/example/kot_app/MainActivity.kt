package com.example.kot_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var navigateButton = findViewById<Button>(R.id.second)

        var lastName = findViewById<EditText>(R.id.lastName);

        var firstName = findViewById<EditText>(R.id.firstName);


        navigateButton.setOnClickListener {
            Toast.makeText(
                this,
                "Hello ${firstName.text.toString()} ${lastName.text.toString()}",
                Toast.LENGTH_LONG
            ).show();
            var intent = Intent(this, Second::class.java);
            intent.putExtra("firstName", firstName.text.toString());
            intent.putExtra("lastName", lastName.text.toString());
            startActivity(intent);
        }
    }
}

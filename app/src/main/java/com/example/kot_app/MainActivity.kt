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
            if (firstName.text.toString().isEmpty() ) {
                firstName.setError("Please enter your first name");

            } else if(lastName.text.toString().isEmpty()){
                lastName.setError("Please enter your last name");
            }
            else {
                var intent = Intent(this, Second::class.java);
                intent.putExtra("firstName", firstName.text.toString());
                intent.putExtra("lastName", lastName.text.toString());
                startActivity(intent);
            }
        }
    }
}

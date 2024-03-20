package com.leynnnnnn.helloandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        // Displays ui to the user
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.emailTextField), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    public void signIn(View v) {
        EditText email = findViewById(R.id.userEmail);
        EditText password = findViewById(R.id.userPassword);
        if(email.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
            Toast.makeText(this, "Welcome.", Toast.LENGTH_SHORT).show();
        }
        else {Toast.makeText(this, "Incorrect log in details.", Toast.LENGTH_SHORT).show();}

        Intent i = new Intent(this, Onboarding1.class);
        startActivity(i);
    }



}
package com.leynnnnnn.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    // Data to be displayed into list
    String[] mobileTypes = {
            "Galaxy Notes", "Mate 20 pro", "Note 9 Plus", "Note 10 plus", "IPhone X"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        // Displays ui to the user
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listTest);
        // Array Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                mobileTypes
        );
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "I will buy " + adapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });

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

    public void google(View v) {
        Intent googleIntent = new Intent(Intent.ACTION_VIEW);
        googleIntent.setData(Uri.parse("https://google.com"));
        startActivity(googleIntent);
    }



}
package com.leynnnnnn.helloandroid;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CustomListView extends AppCompatActivity {
    String[] title = {
            "Onboarding 1", "Onboarding 2", "Onboarding 3"
    };
    String[] description = {
        "This is a test only", "This one as well", "Of course this one too"
    };

    Integer[] imgs = {
          R.drawable.onboarding1,
          R.drawable.onboarding2,
          R.drawable.onboarding3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom_list_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
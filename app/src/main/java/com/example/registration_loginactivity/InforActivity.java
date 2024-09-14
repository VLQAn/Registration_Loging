package com.example.registration_loginactivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InforActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_infor);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textViewUsername = findViewById(R.id.txtvUsername);
        TextView textViewPassword = findViewById(R.id.txtvPassword);

        String receivedTextUsername = getIntent().getStringExtra("inputUsername");
        String receivedTextPassword = getIntent().getStringExtra("inputPassword");

        textViewUsername.setText("Email/ Username: " + receivedTextUsername);
        textViewPassword.setText("Password: " + receivedTextPassword);
    }
}
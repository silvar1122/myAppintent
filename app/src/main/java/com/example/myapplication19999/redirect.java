package com.example.myapplication19999;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class redirect extends AppCompatActivity {
    TextView salutation;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.redirect_layout);

        salutation=findViewById(R.id.salutation);
        String theUsername=getIntent().getStringExtra("keyusername");

        salutation.setText("Welcome "+theUsername);




    }
}

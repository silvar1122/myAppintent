package com.example.myapplication19999;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText username;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        submit=(Button)findViewById(R.id.submit);
        username=(EditText) findViewById(R.id.Username);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name=username.getText().toString();
                Intent i=new Intent(MainActivity.this,redirect.class);
                i.putExtra("keyusername",name);
                startActivity(i);
            }
        });
    }
}
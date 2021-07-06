package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Home extends AppCompatActivity {

    Button previousButton;
    EditText editTextName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        previousButton=findViewById(R.id.previousButton);
        editTextName=findViewById(R.id.editTextName);
        Bundle b=getIntent().getExtras();
        String name=b.getString("name");
        String email=b.getString("email");
        editTextName.setText(name);
        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(Home.this,MainActivity.class);
//                startActivity(intent);
                //read from intent


                finish();
            }
        });

    }
}
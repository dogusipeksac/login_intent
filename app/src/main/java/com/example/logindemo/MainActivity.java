package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mail;
    EditText password;
    Button loginButton;
    TextView loginControllText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mail=findViewById(R.id.editTextMail);
        password=findViewById(R.id.editTextPasword);
        loginButton=findViewById(R.id.loginButton);
        loginControllText=findViewById(R.id.loginControl);
        String email="admin";
        String epassword="1998";
        String name="dogus ipeksaç";
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.equals(mail.getText().toString())
                        &&epassword.equals(password.getText().toString())){
                    loginControllText.setText("Correct");
                    Intent intent=new Intent(MainActivity.this,Home.class);
                    intent.putExtra("name",name);
                    intent.putExtra("email",email);
                    startActivity(intent);
                }
                else{
                    loginControllText.setText("Incorrect");
                }
            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this,"onStart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRestart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this,"onPause",Toast.LENGTH_LONG).show();
    }
}
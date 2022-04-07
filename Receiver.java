package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Receiver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);

        TextView show_id = findViewById(R.id.id);
        TextView show_name = findViewById(R.id.name);
        TextView show_father_name = findViewById(R.id.father_name);
        @SuppressLint("WrongViewCast") TextView show_gender = findViewById(R.id.gender);
        TextView show_address = findViewById(R.id.address);
        TextView show_email = findViewById(R.id.email);
        TextView show_password = findViewById(R.id.password);
        TextView show_dob = findViewById(R.id.dob);
        Button back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(back);
            }
        });

        Intent data = getIntent();
        String id = data.getStringExtra("id");
        String name = data.getStringExtra("name");
        String father_name = data.getStringExtra("father_name");
        String gender = data.getStringExtra("gender");
        String address = data.getStringExtra("address");
        String email = data.getStringExtra("email");
        String password = data.getStringExtra("password");
        String dob = data.getStringExtra("dob");

        show_id.setText("Id is "+id);
        show_name.setText("Name is "+name);
        show_father_name.setText("Father's Name is "+father_name);
        show_gender.setText("Gender is "+gender);
        show_address.setText("Address is "+address);
        show_email.setText("Email is "+email);
        show_password.setText("Password is "+password);
        show_dob.setText("Date of Birth is "+dob);
    }
}
package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText id_number = (EditText) findViewById(R.id.id_number);
        EditText name = (EditText) findViewById(R.id.name);
        EditText father_name = findViewById(R.id.father_name);
        RadioGroup gender = findViewById(R.id.gender);
        EditText address = findViewById(R.id.address);
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);
        EditText dob = findViewById(R.id.dob);
        Button submit_btn = (Button) findViewById(R.id.button_submit);

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = gender.getCheckedRadioButtonId();
                RadioButton radioButton = (RadioButton) findViewById(selectedId);

                Intent details = new Intent(getApplicationContext(), Receiver.class);
                details.putExtra("id", id_number.getText().toString());
                details.putExtra("name", name.getText().toString());
                details.putExtra("father_name", father_name.getText().toString());
                details.putExtra("gender", radioButton.getText().toString());
                details.putExtra("address", address.getText().toString());
                details.putExtra("email", email.getText().toString());
                details.putExtra("password", password.getText().toString());
                details.putExtra("dob", dob.getText().toString());
                startActivity(details);
            }
        });
    }
}
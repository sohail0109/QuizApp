package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText firstname, lastname, email, uniname, city, state;
    Spinner course;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstname = findViewById(R.id.firstname);
        lastname = findViewById(R.id.lastname);
        email = findViewById(R.id.email);
        uniname = findViewById(R.id.uniname);
        city = findViewById(R.id.city);
        state = findViewById(R.id.state);
        Spinner sp = findViewById(R.id.sp);


    }

    public void Submit(View view) {
        String fn = firstname.getText().toString();
        String ln = lastname.getText().toString();
        String em = email.getText().toString();
        String un = uniname.getText().toString();
        String ci = city.getText().toString();
        String st = state.getText().toString();
        String co = course.getSelectedItem().toString();
        Toast.makeText(this,co,Toast.LENGTH_LONG).show();

    }
}

package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

class Instructions extends AppCompatActivity {
    TextView text;
    CheckBox yes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
        text=findViewById(R.id.text);
        yes=findViewById(R.id.yes);

        StringBuilder sb=new StringBuilder();
        if (yes.isChecked()){
            sb.append("yes,I accept to all the instructions");
        }

    }






    public void Next(View view) {

    }
}
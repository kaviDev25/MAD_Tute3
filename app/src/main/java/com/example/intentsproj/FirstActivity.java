package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button button;
    int etn1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

            button = findViewById(R.id.okbtn);
            button.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view) {
                    Context context = getApplicationContext();
                    CharSequence message = "sending values to calculate";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, message, duration);
                    toast.show();
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);

                    Intent i = new Intent(FirstActivity.this,SecondActivity.class);
                    i.putExtra("")
                    startActivity(i);
                }
            });
        }
}
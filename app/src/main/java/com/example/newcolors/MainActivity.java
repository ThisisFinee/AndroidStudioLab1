package com.example.newcolors;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.util.Consumer;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Called onCreate()", Toast.LENGTH_LONG).show();

    }

    public void ButtonClick(View view) throws IOException {
        EditText EdText =  findViewById(R.id.textInputEditText);
        String ColorText = EdText.getText().toString();
        if (ColorText.matches("^[a-zA-Z]+$")) {
            ColorText = ColorText.toLowerCase();
            Consumer <String> Colore = str -> view.setBackgroundColor(Color.parseColor(str));
            Colore.accept(ColorText);
        }
        else {Toast.makeText(getApplicationContext(), "Enter color name", Toast.LENGTH_LONG).show();
        }
    }

    public void FondButtonClick(View view){
        EditText EdText =  findViewById(R.id.textInputEditText);
        ConstraintLayout layout = findViewById(R.id.layout);
        String ColorText = EdText.getText().toString();

        if (ColorText.matches("^[a-zA-Z]+$")) {
            ColorText = ColorText.toLowerCase();
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("color", ColorText);
            startActivity(intent);
//            Consumer <String> Colore = str -> layout.setBackgroundColor(Color.parseColor(str));
//            Colore.accept(ColorText);
        }
        else {
            Toast.makeText(getApplicationContext(), "Enter color name", Toast.LENGTH_LONG).show();
        }
    }

    protected void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(), "Called onResume()", Toast.LENGTH_LONG).show();
    }

    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(), "Called onPause()", Toast.LENGTH_LONG).show();
    }

    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "Called onDestroy()", Toast.LENGTH_LONG).show();
    }

    protected void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(), "Called onStop()", Toast.LENGTH_LONG).show();
    }

    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(), "Called onStart()", Toast.LENGTH_LONG).show();
    }
}
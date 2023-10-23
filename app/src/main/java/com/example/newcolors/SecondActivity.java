package com.example.newcolors;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.util.Consumer;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.view.View;
import java.util.Objects;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle arguments = getIntent().getExtras();
        ConstraintLayout layout = findViewById(R.id.layout);
    if (arguments!=null){
        String color = arguments.getString("color");
        Consumer<String> Colore = str -> {layout.setBackgroundColor(Color.parseColor(str));};
        Colore.accept(color);
    }}

    public void OnClickRestart(View view) {
        finish();
    }
}
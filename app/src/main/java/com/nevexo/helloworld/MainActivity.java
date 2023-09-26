package com.nevexo.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextName);

    }

    public void onBtnClick(View view) {
        TextView textViewHello = findViewById(R.id.textViewHello);
        String text = editText.getText().toString();
        textViewHello.setText("Hello " + text);
    }

}
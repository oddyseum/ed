package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage (View view){

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        startActivity(intent);
        EditText editText= findViewById(R.id.editText);
        MainActivity.message = editText.getText().toString();
        Intent.putExtra()
        System.out.println("Ejecutando SendMessage editText.getText().toString()=" +
                editText.getText().toString());
    }
}

package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Secondpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
    }

    public void onClick(View view){
        EditText name = (EditText) findViewById(R.id.namefield);
        String name1 = name.getText().toString();
        EditText address = (EditText) findViewById(R.id.namefield2);
        String address1 = address.getText().toString();
        if(name1!=null && address1!=null){
            Toast.makeText(this, "Your Order Is Placed :)"+name1, Toast.LENGTH_SHORT).show();
        }

    }
    public void Coffee(View view){
        Intent intent1 = new Intent(Secondpage.this , Coffee.class);
        startActivity(intent1);
    }

    public void Tea(View view){
        Intent intent2 = new Intent(Secondpage.this , Tea.class);
        startActivity(intent2);
    }

    public void Pizza(View view){
        Intent intent3 = new Intent(Secondpage.this , Pizza.class);
        startActivity(intent3);
    }

    public void Burger(View view){
        Intent intent4 = new Intent(Secondpage.this , Burger.class);
        startActivity(intent4);
    }
}
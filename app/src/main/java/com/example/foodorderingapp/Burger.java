package com.example.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class Burger extends AppCompatActivity {
String orderBurger="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger);
        CheckBox bigBoomBurger = (CheckBox) findViewById(R.id.checkBox);
        boolean l1 = bigBoomBurger.isChecked();
        if(l1==true){
            orderBurger += "BIG BOOM Burger ";
        }
        CheckBox bossBurger = (CheckBox) findViewById(R.id.checkBox1);
        boolean l2 = bossBurger.isChecked();
        if(l2 == true){
            orderBurger += "BOSS Burger ";
        }
        CheckBox chilliBilliBurger = (CheckBox) findViewById(R.id.checkBox2);
        boolean l3 = chilliBilliBurger.isChecked();
        if(l3 == true){
            orderBurger += "CHILLI BILLI Burger ";
        }
        CheckBox bigBBBurger = (CheckBox) findViewById(R.id.checkBox3);
        boolean l4 = bigBBBurger.isChecked();
        if(l4==true){
            orderBurger += "BIG BB Burger ";
        }



    }

}
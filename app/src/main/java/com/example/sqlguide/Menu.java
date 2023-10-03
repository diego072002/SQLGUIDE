package com.example.sqlguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


    }

    public void leccion1(View view){
        Intent d=new Intent(this, Leccion1.class);
        startActivity(d);}

    public void leccion2(View view){
        Intent d=new Intent(this, Leccion2.class);
        startActivity(d);}
}

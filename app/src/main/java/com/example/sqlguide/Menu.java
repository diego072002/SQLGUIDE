package com.example.sqlguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Menu extends AppCompatActivity {
    public Button btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21;
    private TextView ni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btn2=(Button) findViewById(R.id.BtnNivel2);
        btn3=(Button) findViewById(R.id.BtnNivel3);
        btn4=(Button) findViewById(R.id.BtnNivel4);
        btn5=(Button) findViewById(R.id.BtnNivel5);
        btn6=(Button) findViewById(R.id.BtnNivel6);
        btn7=(Button) findViewById(R.id.BtnNivel7);
        btn8=(Button) findViewById(R.id.BtnNivel8);
        btn9=(Button) findViewById(R.id.BtnNivel9);
        btn10=(Button) findViewById(R.id.BtnNivel10);
        btn11=(Button) findViewById(R.id.BtnNivel11);
        btn12=(Button) findViewById(R.id.BtnNivel12);


        ni=(TextView)findViewById(R.id.textView3);

        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
          cargar();



    }

    private void cargar() {
        SharedPreferences preferencia=getSharedPreferences("apuntador", Context.MODE_PRIVATE);
        String nivel=preferencia.getString("nivel","1");
        ni.setText("Bienvenido\nNivel "+nivel);


        if (nivel.equals("2")){
            btn2.setEnabled(true);
        } else if (nivel.equals("3")) {
            btn2.setEnabled(true);
            btn3.setEnabled(true);
        } else if (nivel.equals(("4"))) {
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);

        } else if (nivel.equals("5")) {
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
        } else if (nivel.equals("6")) {
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
        } else if (nivel.equals("7")) {
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
        } else if (nivel.equals("8")) {
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
        } else if (nivel.equals("9")) {
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
        }else if (nivel.equals("10")) {
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            btn10.setEnabled(true);
        }else if (nivel.equals("11")) {
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            btn10.setEnabled(true);
            btn11.setEnabled(true);

        }else if (nivel.equals("12")) {
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            btn10.setEnabled(true);
            btn11.setEnabled(true);
            btn12.setEnabled(true);
        }


    }

    public void leccion1(View view){
        Intent d=new Intent(this, Leccion1.class);
        startActivity(d);
    }

    public void leccion2(View view){
        Intent d=new Intent(this, Leccion2.class);
        startActivity(d);
    }
    public void leccion3(View view){
        Intent d=new Intent(this, Leccion3.class);
        startActivity(d);
    }
    public void leccion4(View view){
        Intent d=new Intent(this, Leccion4.class);
        startActivity(d);
    }
    public void leccion5(View view){
        Intent d=new Intent(this, Leccion5.class);
        startActivity(d);
    }
    public void leccion6(View view){
        Intent d=new Intent(this, Leccion6.class);
        startActivity(d);
    }
    public void leccion7(View view){
        Intent d=new Intent(this, Leccion7.class);
        startActivity(d);
    }
    public void leccion8(View view){
        Intent d=new Intent(this, Leccion8.class);
        startActivity(d);
    }
    public void leccion9(View view){
        Intent d=new Intent(this, Leccion9.class);
        startActivity(d);
    }
    public void leccion10(View view){
        Intent d=new Intent(this, Leccion10.class);
        startActivity(d);
    }
}

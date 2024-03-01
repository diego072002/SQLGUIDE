package com.example.sqlguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.Toast;

public class Leccion9 extends AppCompatActivity {
    private EditText res;
    private TableRow tab1,tab2;

    private Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leccion9);
        tab1=(TableRow) findViewById(R.id.Tabla3);
        tab2=(TableRow) findViewById(R.id.Tabla4);


        res=(EditText) findViewById(R.id.EditLeccion1);
        bt1=(Button) findViewById(R.id.BtnLeccion1);
    }

    public void mostrar(View view){

        String v1 = res.getText().toString().toLowerCase();
        String validacion = "select distinct especie from friends_of_pickles where altura_cm > 50;";

        if (v1.equals(validacion)){
            tab1.setVisibility(View.VISIBLE);
            tab2.setVisibility(View.VISIBLE);
            bt1.setVisibility(View.VISIBLE);

            Toast.makeText(this, "¡Felicitaciones!, ¡Eso es correcto!", Toast.LENGTH_SHORT).show();
            guardar();

        }else{
            Toast.makeText(this, "La consulta que has introducido no ha devuelto los resultados adecuados. Por favor, inténtalo de nuevo.", Toast.LENGTH_LONG).show();
        }



    }

    public void regresar(View view){
        guardar();
        Intent d=new Intent(this, Menu.class);
        startActivity(d);
    }

    private void guardar() {
        SharedPreferences preferencia=getSharedPreferences("apuntador", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferencia.edit();
        editor.putString("nivel","10");
        editor.commit();
    }
}
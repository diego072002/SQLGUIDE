package com.example.sqlguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.security.PrivateKey;

public class Leccion1 extends AppCompatActivity {


    private EditText res;
    private TableRow tab1,tab2,tab3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leccion1);

        tab1=(TableRow) findViewById(R.id.Tabla1);
        tab2=(TableRow) findViewById(R.id.Tabla2);
        tab3=(TableRow) findViewById(R.id.Tabla3);
        res=(EditText) findViewById(R.id.EditLeccion1);
    }

    public void mostrar(View view){

        String v1 = res.getText().toString().toLowerCase();
        String validacion = "select * from family_members;";

        if (v1.equals(validacion)){
            tab1.setVisibility(View.VISIBLE);
            tab2.setVisibility(View.VISIBLE);
            tab3.setVisibility(View.VISIBLE);
            Toast.makeText(this, "¡Felicitaciones!, ¡Eso es correcto!", Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(this, "La consulta que has introducido no ha devuelto los resultados adecuados. Por favor, inténtalo de nuevo.", Toast.LENGTH_LONG).show();
        }



    }
}
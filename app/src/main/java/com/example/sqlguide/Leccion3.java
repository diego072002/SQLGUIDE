package com.example.sqlguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.Toast;

public class Leccion3 extends AppCompatActivity {
    private EditText res;
    private TableRow tab3;

    private Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leccion3);

        tab3=(TableRow) findViewById(R.id.Tabla3);
        res=(EditText) findViewById(R.id.EditLeccion1);
        bt1=(Button) findViewById(R.id.BtnLeccion1);
    }
    public void mostrar(View view){

        String v1 = res.getText().toString().toLowerCase();
        String validacion = "select * from family_members where especie='perro';";

        if (v1.equals(validacion)){

            tab3.setVisibility(View.VISIBLE);
            bt1.setVisibility(View.VISIBLE);

            Toast.makeText(this, "¡Felicitaciones!, ¡Eso es correcto!", Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(this, "La consulta que has introducido no ha devuelto los resultados adecuados. Por favor, inténtalo de nuevo.", Toast.LENGTH_LONG).show();
        }



    }
}
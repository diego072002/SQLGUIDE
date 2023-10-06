package com.example.sqlguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.Toast;

public class Leccion10 extends AppCompatActivity {
    private EditText res;
    private TableRow tab1,tab2,tab3,tab4,tab5,tab6,tab7;

    private Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leccion10);
        tab1=(TableRow) findViewById(R.id.Tabla1);
        tab2=(TableRow) findViewById(R.id.Tabla2);
        tab3=(TableRow) findViewById(R.id.Tabla3);
        tab4=(TableRow) findViewById(R.id.Tabla4);
        tab5=(TableRow) findViewById(R.id.Tabla5);
        tab6=(TableRow) findViewById(R.id.Tabla6);
        tab7=(TableRow) findViewById(R.id.Tabla7);


        res=(EditText) findViewById(R.id.EditLeccion1);
        bt1=(Button) findViewById(R.id.BtnLeccion1);
    }
    public void mostrar(View view){

        String v1 = res.getText().toString().toLowerCase();
        String validacion = "select * from friends_of_pickles order by altura_cm desc;";

        if (v1.equals(validacion)){
            tab1.setVisibility(View.VISIBLE);
            tab2.setVisibility(View.VISIBLE);
            tab3.setVisibility(View.VISIBLE);
            tab4.setVisibility(View.VISIBLE);
            tab5.setVisibility(View.VISIBLE);
            tab6.setVisibility(View.VISIBLE);
            tab7.setVisibility(View.VISIBLE);
            bt1.setVisibility(View.VISIBLE);

            Toast.makeText(this, "¡Felicitaciones!, ¡Eso es correcto!", Toast.LENGTH_SHORT).show();

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
    }
}
package yoa.pmdm.claudio.actividades3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import base_de_datos.baseDeDatos;

public class Resgistrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resgistrar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        baseDeDatos conexion= new baseDeDatos(this, "db",null,1);
    }
    public void registrar_alumno(View view) {
        Intent i = new Intent(this, Registrar_alumnos.class);
        startActivity(i);
    }

    public void registrar_profesor(View view) {
        Intent i = new Intent(this, Registrar_profesores.class);
        startActivity(i);
    }
}

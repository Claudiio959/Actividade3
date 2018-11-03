package yoa.pmdm.claudio.actividades3;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import base_de_datos.baseDeDatos;

import static base_de_datos.profesor.CAMPO_CICLO;
import static base_de_datos.profesor.CAMPO_CURSO;
import static base_de_datos.profesor.CAMPO_DESPACHO;
import static base_de_datos.profesor.CAMPO_EDAD;
import static base_de_datos.profesor.CAMPO_NOMBRE;
import static base_de_datos.profesor.TABLA_PROFESOR;

public class Registrar_profesores extends AppCompatActivity {
    public EditText nombre;
    public EditText edad;
    public EditText ciclo;
    public EditText curso;
    public EditText despacho;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_profesores);
        nombre=(EditText)findViewById(R.id.profesor);
        edad=(EditText)findViewById(R.id.edad_profesor);
        ciclo=(EditText)findViewById(R.id.ciclo_profesor);
        curso=(EditText)findViewById(R.id.curso_profesor);
        despacho=(EditText)findViewById(R.id.despacho);
    }
    public void onClick(View view) {
        registrarProfesores();
    }

    private void registrarProfesores() {
        baseDeDatos conexion= new baseDeDatos(this, "db",null,1);
        SQLiteDatabase db=conexion.getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put(CAMPO_NOMBRE, nombre.getText().toString());
        values.put(CAMPO_EDAD, edad.getText().toString());
        values.put(CAMPO_CICLO,ciclo.getText().toString());
        values.put(CAMPO_CURSO, curso.getText().toString());
        values.put(CAMPO_DESPACHO, despacho.getText().toString());

        Long resultado=db.insert(TABLA_PROFESOR, CAMPO_CICLO, values );
        Toast.makeText(getApplicationContext(),"Registro:"+resultado,Toast.LENGTH_LONG).show();
        db.close();
    }
}

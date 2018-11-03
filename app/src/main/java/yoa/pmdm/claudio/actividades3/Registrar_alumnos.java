package yoa.pmdm.claudio.actividades3;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import base_de_datos.baseDeDatos;

import static base_de_datos.alumno.CAMPO_CICLO;
import static base_de_datos.alumno.CAMPO_CURSO;
import static base_de_datos.alumno.CAMPO_EDAD;
import static base_de_datos.alumno.CAMPO_NOMBRE;
import static base_de_datos.alumno.TABLA_ALUMNO;

public class Registrar_alumnos extends AppCompatActivity {
    public EditText nombre;
    public EditText edad;
    public EditText ciclo;
    public EditText curso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_alumnos);
        nombre=(EditText)findViewById(R.id.nombre_alumno);
        edad=(EditText)findViewById(R.id.edad_alumno);
        ciclo=(EditText)findViewById(R.id.ciclo);
        curso=(EditText)findViewById(R.id.curso);
    }
    private void registrarAlumnos() {
        baseDeDatos conexion= new baseDeDatos(this, "db",null,1);
        SQLiteDatabase db=conexion.getWritableDatabase();

        ContentValues values= new ContentValues();
        values.put(CAMPO_NOMBRE, nombre.getText().toString());
        values.put(CAMPO_EDAD, edad.getText().toString());
        values.put(CAMPO_CICLO,ciclo.getText().toString());
        values.put(CAMPO_CURSO, curso.getText().toString());

        Long resultado=db.insert(TABLA_ALUMNO, CAMPO_NOMBRE, values );
        Toast.makeText(getApplicationContext(),"Registro:"+resultado,Toast.LENGTH_LONG).show();
        db.close();

    }
}

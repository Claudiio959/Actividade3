package base_de_datos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static base_de_datos.alumno.crear_tabla_alumno;
import static base_de_datos.profesor.crear_tabla_profesor;


public class baseDeDatos extends SQLiteOpenHelper{

    public baseDeDatos(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(crear_tabla_alumno);
        db.execSQL(crear_tabla_profesor);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS ALUMNOS");
        db.execSQL("DROP TABLE IF EXISTS PROFESORES");
        onCreate(db);

    }

}

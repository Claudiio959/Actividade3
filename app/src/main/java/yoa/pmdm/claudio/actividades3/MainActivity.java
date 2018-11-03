package yoa.pmdm.claudio.actividades3;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String PREFS = "Mis preferencias";
    private EditText nombre;
    private EditText user;
    private EditText fecha;
    private RadioButton hombre;
    private RadioButton mujer;
    private Button mostrar;
    private Button guardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context context = this;
        final SharedPreferences sharething = getSharedPreferences("alamcena", context.MODE_PRIVATE);

        nombre=(EditText) findViewById(R.id.nombre);
        user=(EditText) findViewById(R.id.user);
        fecha=(EditText)findViewById(R.id.fecha);
        hombre=(RadioButton)findViewById(R.id.hombre);
        mujer=(RadioButton)findViewById(R.id.mujer);
        mostrar = (Button)findViewById(R.id.button);
        guardar =(Button)findViewById(R.id.button2);

        Button mostrar= (Button)findViewById(R.id.button);
        mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharething = getSharedPreferences(PREFS, Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor=  sharething.edit();
                String nombre= sharething.getString("nombre","No hay nombre");
                String user= sharething.getString("user","No hay usuario");
                String fecha= sharething.getString("fecha","No hay fecha");
                Boolean homnre=sharething.getBoolean("hombre",false);
                Boolean mujer=sharething.getBoolean("mujer",false);
                Toast.makeText(getApplicationContext(), "Su Nombre es: "+nombre+",Usuario elegido: "+user+",Fecha de nacimiento: "+fecha+", Sexo: "+hombre+mujer ,Toast.LENGTH_LONG).show();


            }
        });

        Button guardar=(Button)findViewById(R.id.button2);
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sharething = getSharedPreferences(PREFS, Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharething.edit();
                editor.putString("nombreReal", nombre.getText().toString());
                editor.putString("nombreUsuario", user.getText().toString());
                editor.putString("fecha", fecha.getText().toString());
            }
        });
}
    public void registrar(View view) {

        Intent i = new Intent(this, Resgistrar.class);
        startActivity(i);
    }
}

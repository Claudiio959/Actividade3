package base_de_datos;

public class alumno {

    private static  String nombre;
    private int edad;
    private String ciclo;
    private String curso;
    public static final String TABLA_ALUMNO="ALUMNOS";
    public static final String CAMPO_NOMBRE="nombre";
    public static final String CAMPO_EDAD="edad";
    public static final String CAMPO_CICLO="ciclo";
    public static final String CAMPO_CURSO="curso";

    public final  static String crear_tabla_alumno="CREATE TABLE "+TABLA_ALUMNO+"( "+CAMPO_NOMBRE+" ID, "+CAMPO_EDAD+" INT, "+CAMPO_CICLO+" TEXT,  "+CAMPO_CURSO+" TEXT)";
    public alumno() {
        this.nombre = nombre;
        this.edad = edad;
        this.ciclo = ciclo;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public static void setnombre(String nombre) {
        alumno.nombre = nombre;
    }
}

package base_de_datos;

public class profesor {
   private String nombre;
   private int edad;
   private String ciclo;
   private String curso;
   private String despacho;
   public static final String TABLA_PROFESOR="PROFESORES";
   public static final String CAMPO_NOMBRE="nombre";
   public static final String CAMPO_EDAD="edad";
   public static final String CAMPO_CICLO="ciclo";
   public static final String CAMPO_CURSO="curso";
   public static final String CAMPO_DESPACHO="despacho";
   public final  static String crear_tabla_profesor="CREATE TABLE "+TABLA_PROFESOR+"( "+CAMPO_NOMBRE+" ID, "+CAMPO_EDAD+" INT, "+CAMPO_CICLO+" TEXT,  "+CAMPO_CURSO+" TEXT, "+CAMPO_DESPACHO+ "TEXT)";

    public profesor(String nombre, int edad, String ciclo, String curso, String despacho) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciclo = ciclo;
        this.curso = curso;
        this.despacho = despacho;
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

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }
}

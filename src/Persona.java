public class Persona {

    private int edad;
    private int dni;
    private String nombre;

    public Persona(int edad, int dni, String nombre) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  nombre +"{" +
                "edad=" + edad +
                ", dni=" + dni + '\'' +
                '}';
    }
}

public class Profesionista {
    private String nombre;
    private String profesion;
    private int edad;
    private int tiempodeservicio;

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

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getTiempodeservicio() {
        return tiempodeservicio;
    }

    public void setTiempodeservicio(int tiempodeservicio) {
        this.tiempodeservicio = tiempodeservicio;
    }
    @Override
    public String toString(){
        return "Profesionista{ "+
                "Nombre: '" +nombre+'\''+
                        ", Edad: " +edad+'\''+
                        ", Profesion: '" +profesion+'\''+
                        ", Tiempo de servicio: " +tiempodeservicio+'\''+
                        '}';
    }
}

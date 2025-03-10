public class HerenciaProfesionista extends Persona{
    String profesion;
    @Override
    public String toString(){
        return "HerenciaProfesionista{" +
                "Nombre: '" +nombre+'\''+
                "Edad: '" +edad+'\''+
                "Altura: '" +altura+'\''+
                "Peso: '" +peso+'\''+
                "Genero: '" +genero+'\''+
                "Profesion: '" +profesion+'\''+
                '}';
    }

    public static void main(String[] args) {
        HerenciaProfesionista prof1 = new HerenciaProfesionista();
        prof1.edad= 22;
        prof1.profesion= "Ing. Sistemas";
        prof1.nombre= "Danna Pamela";
        System.out.println(prof1);
    }
}

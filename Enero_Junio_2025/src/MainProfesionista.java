public class MainProfesionista {
    public static void main(String[] args) {

        Profesionista Prf1 = new Profesionista();
        Prf1.setNombre("Danna Pamela");
        Prf1.setEdad(21);
        Prf1.setProfesion("Ing. Sistemas Computacionales");
        Prf1.setTiempodeservicio(6);
        System.out.println(Prf1);

        Profesionista Prf2 = new Profesionista();
        Prf2.setNombre("Jorge");
        Prf2.setEdad(20);
        Prf2.setProfesion("Ing. Sistemas Computacionales");
        Prf2.setTiempodeservicio(8);
        System.out.println(Prf2);
    }
}

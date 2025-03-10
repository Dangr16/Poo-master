public class Mainpersona {
    public static void main(String[] args) {

        Persona p1= new Persona(); //Instaciamiento.

        //Se configura el objeto dandole valores a sus atributos!.
        p1.nombre= "Jorge.";
        p1.genero= "Masculino.";
        p1.altura= 1.74;
        p1.peso= 80;
        p1.edad= 20;

        System.out.println(p1.obtenerDatos());

        Persona p2= new Persona();
        p2.nombre= "Julio";
        p2.genero= "Masculino";
        p2.altura= 1.69;
        p2.peso= 50;
        p2.edad= 18;

        System.out.println(p2.obtenerDatos());

        System.out.println(p1.calcular_imc());
        System.out.println(p2.calcular_imc());
    }
}

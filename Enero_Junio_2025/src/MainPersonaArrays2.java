import java.util.ArrayList;

public class MainPersonaArrays2 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        String frase = " Happy Valentines Day!<3";
        lista.add(frase);

        frase=" Que reciban muchos apapachos";
        lista.add(frase);
        frase=" Hoy será un dia maravilloso.. para otros";


        System.out.println(frase);
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));

        if(lista.contains(frase))
            System.out.println("Tristemente así será!");
        else
            System.out.println("Eres afortunado.");

        System.out.println(lista.size());
    }
}

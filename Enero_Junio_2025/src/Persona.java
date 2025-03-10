public class Persona {
    String nombre;
    int edad;
    double altura;
    double peso;
    String genero;

    double calcular_imc(){
        return peso/(altura*altura);
    }
    String obtenerDatos(){
        String cad="";
        cad=cad+"Persona{Nombre: " +nombre+"; ";
        cad=cad+"Edad: " +edad+";";
        cad=cad+"Altura: " +altura+";";
        cad=cad+"Peso: " +peso+";";
        cad=cad+"Genero: " +genero+";";
        return cad;
    }

}

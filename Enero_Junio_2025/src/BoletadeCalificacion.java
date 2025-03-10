public class BoletadeCalificacion {

    String nombre;
    int matricula;
    int Calfpoo;
    int Calfcalculo;
    int Calfalgebra;
    int Calfprobabilidad;
    int Calfquimica;
    int Calfcontabilidad;
    int Calfextrac;

    String obtenerDatos(){
        String cad="";
        cad=cad+"Boleta de calificaciones: {nombre: " +nombre+";";
        cad=cad+"Matricula del alumno: " +matricula+";";
        cad=cad+"POO: " +Calfpoo+";";
        cad=cad+"Calculo: " +Calfcalculo+";";
        cad=cad+"Probabilidad: " +Calfprobabilidad+";";
        cad=cad+"Quimica: " +Calfquimica+";";
        cad=cad+"Contabilidad: " +Calfcontabilidad+";";
        cad=cad+"Extracurricular: " +Calfextrac+";";

        return cad;
    }
}

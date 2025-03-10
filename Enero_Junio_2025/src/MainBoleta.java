public class MainBoleta {
    public static void main(String[] args) {

        BoletadeCalificacion BC1= new BoletadeCalificacion();
        BC1.nombre="Danna";
        BC1.matricula=24020354;
        BC1.Calfpoo=10;
        BC1.Calfcalculo=10;
        BC1.Calfalgebra=10;
        BC1.Calfprobabilidad=10;
        BC1.Calfquimica=10;
        BC1.Calfcontabilidad=10;
        BC1.Calfextrac=10;
        System.out.println(BC1.obtenerDatos());

        BoletadeCalificacion BC2= new BoletadeCalificacion();
        BC2.nombre="Jorge";
        BC2.matricula=24020753;
        BC2.Calfpoo=10;
        BC2.Calfcalculo=9;
        BC2.Calfalgebra=9;
        BC2.Calfprobabilidad=8;
        BC2.Calfquimica=7;
        BC2.Calfcontabilidad=9;
        BC2.Calfextrac=8;
        System.out.println(BC2.obtenerDatos());

        BoletadeCalificacion BC3= new BoletadeCalificacion();
        BC3.nombre="Julio";
        BC3.matricula=24020656;
        BC3.Calfpoo=10;
        BC3.Calfcalculo=9;
        BC3.Calfalgebra=8;
        BC3.Calfprobabilidad=10;
        BC3.Calfquimica=7;
        BC3.Calfcontabilidad=10;
        BC3.Calfextrac=8;
        System.out.println(BC3.obtenerDatos());
    }
}

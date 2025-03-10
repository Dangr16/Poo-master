public class DemoConstructor {
    String attribute_1;
    double attribute_2;
    String attribute_3;

    public DemoConstructor(){
        System.out.println("My first constructor.");
        attribute_1 = "Attribute value 1";
    }

    public DemoConstructor(String value){
        attribute_1 = value;
    }

    public DemoConstructor(double value1, String value2){ //"double, string" lo recibe en este orden.
        attribute_2 = value1;
        attribute_1 = value2;
    }

    public DemoConstructor(double value1){   //Con "double" no puede tener 2 constructores con la misma huella.
        attribute_2 =value1;
    }

    public DemoConstructor(String value2, double value1){
        attribute_1= value1;
        attribute_2= value2;
    }

    public DemoConstructor(String value, String value2){
        attribute_3 =value;
        attribute_1 =value2;
    }
}

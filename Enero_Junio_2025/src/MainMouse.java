public class MainMouse {
    public static void main(String[] args) {
        Mouse mo1 = new Mouse("Razer");
        Mouse mo2 = new Mouse("Hp Omen", 800);
        Mouse mo3 = new Mouse(450,"Acer");
        Mouse mo4 = new Mouse(120);
        Mouse mo5 = new Mouse(750, "Red Dragon", 900);

        System.out.println(mo1);
        System.out.println(mo2);
        System.out.println(mo3);
        System.out.println(mo4);
        System.out.println(mo5);
    }

}

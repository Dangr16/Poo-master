public class MainTicket {
    public static void main(String[] args) {

        Ticket T1 = new Ticket();
        T1.setClient("Danna Pamela");
        T1.setNticket(3166);
        T1.setPrice(200);
        System.out.println(T1);

        Ticket T2 = new Ticket();
        T2.setClient("Jorge Eduardo");
        T2.setNticket(4128);
        T2.setPrice(200);
        System.out.println(T2);
    }
}

public class Ticket {
    private String Client;
    private int Nticket;
    private int Price;

    public String getClient() {
        return Client;
    }

    public void setClient(String client) {
        this.Client = client;
    }

    public int getNticket() {
        return Nticket;
    }

    public void setNticket(int nticket) {
        this.Nticket = nticket;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        this.Price = price;
    }
    @Override
    public String toString(){
        return "Ticket{ "+
                "Client: " +Client+'\''+
                ", Ticket number: " +Nticket+
                ", Price: $" +Price+
                '}';
    }
}

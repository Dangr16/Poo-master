public class Mouse {
    private String Brand;
    private int Price;
    private int Dpi;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        this.Price = price;
    }

    public int getDpi() {
        return Dpi;
    }

    public void setDpi(int dpi) {
        this.Dpi = dpi;
    }
     //Constructors
    public Mouse(String brand){
        this.Brand = brand;
    }
    public Mouse(String brand, int dpi){
        this.Brand = brand;
        this.Dpi = dpi;
    }

    public Mouse(int price, String brand){
        this.Price = price;
        this.Brand = brand;
    }
    public Mouse(int price, String brand, int dpi){
        this.Price = price;
        this.Brand = brand;
        this.Dpi = dpi;
    }

    public Mouse(int price){
        this.Price = price;
    }
    @Override
    public String toString(){
        return "Mouse{ "+
                "Brand: '" +Brand+'\''+
                ", Price: $" +Price+'\''+
                ", Dpi: " +Dpi+'\''+
                '}';
    }
}

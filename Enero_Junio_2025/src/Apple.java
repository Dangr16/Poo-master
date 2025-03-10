public class Apple {
    private String Size;
    private String Brand;
    private String Color;

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        this.Size = size;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }
    @Override
    public String toString(){
        return "Apple{" +
                "Color='" +Color+'\''+
                ", Size='" +Size+'\''+
                ", Brand='" +Brand+'\''+
                '}';
    }
}

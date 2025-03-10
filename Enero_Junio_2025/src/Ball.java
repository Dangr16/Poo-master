public class Ball{
    private String Type;
    private String Color;
    private String Brand;

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }
    @Override
    public String toString(){
        return "Ball{ "+
                "Color= '" +Color+'\''+
                ", Size= '" +Type+'\''+
                ", Brand= '" +Brand+'\''+
                '}';
    }
}

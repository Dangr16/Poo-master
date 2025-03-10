public class Pc {
        private String Motherb;
        private String Proce;
        private String Keyb;

    public String getMotherb() {
        return Motherb;
    }

    public void setMotherb(String motherb) {
        this.Motherb = motherb;
    }

    public String getKeyb() {
        return Keyb;
    }

    public void setKeyb(String keyb) {
        this.Keyb = keyb;
    }

    public String getProce() {
        return Proce;
    }

    public void setProce(String proce) {
        this.Proce = proce;
    }
    @Override
    public String toString(){
        return "Pc{ "+
                "Motherboard: '" +Motherb+'\''+
                ", Processor model: '" +Proce+'\''+
                ", Keyboard: '" +Keyb+'\''+
                '}';
    }

}

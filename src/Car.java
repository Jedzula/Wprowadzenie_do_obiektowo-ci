public class Car {

    private String brand;
    private String color;
    private int doorNumber;
    private boolean automaticTransmission;

    public Car(String brand, String color, int doorNumber, boolean automaticTransmission) {
       this.color=color;
       this.brand=brand;
       this.doorNumber=doorNumber;
       this.automaticTransmission=automaticTransmission;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public boolean isAutomaticTransmission() {
        return automaticTransmission;
    }
}

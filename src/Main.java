public class Main {
    public static void main(String[] args) {

        Car audi = new Car("Audi 80", "black", 5, true);

        System.out.println("Model: " + audi.getBrand() + " ,kolor: " + audi.getColor() + " ,liczba drzwi: " + audi.getDoorNumber() + " ,automat: " + audi.isAutomaticTransmission());
        audi.setBrand("BMW X6");
        audi.setColor("red");
        System.out.println("ZMIANA. Model: " + audi.getBrand() + " ,kolor: " + audi.getColor() + " ,liczba drzwi: " + audi.getDoorNumber() + " ,automat: " + audi.isAutomaticTransmission());
    }
}

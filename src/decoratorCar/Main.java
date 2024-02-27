package decoratorCar;

public class Main {
    public static void main(String[] args) {
        Car simpleCar = new SimpleCar();
        System.out.println(simpleCar.getSpeet());
        Car sportCar= new SportCar(simpleCar);
        System.out.println(sportCar.getSpeet());
    }
}

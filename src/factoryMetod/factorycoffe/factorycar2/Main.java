package factoryMetod.factorycoffe.factorycar2;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car toyota = carFactory.getCar(CarType.OFFROAD);
        System.out.println(toyota.go());
        System.out.println(toyota.stop());
    }
}

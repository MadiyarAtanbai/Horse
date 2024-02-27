package factoryMetod.factorycoffe.factoryCar;


public class Main {
    public static void main(String[] args) {
        CarDealership carDealership = new CarDealership();
        BMW car = carDealership.dealership(BmwType.BMW3F80);
        System.out.println(car.getEquipment());
        System.out.println(car.getVolume());
        System.out.println(car.getVCost());
    }
}
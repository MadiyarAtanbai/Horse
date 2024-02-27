package factoryMetod.factorycoffe.factorycar2;

public class CarFactory {
    public Car getCar(CarType carType){
        Car car =null;
        switch (carType){
            case STANDART :
                car = new Porsche();
                break;
            case SPORT:
                car = new Toyota();
                break;
            case OFFROAD:car = new Jeep();
        }
        return car;
    }
}

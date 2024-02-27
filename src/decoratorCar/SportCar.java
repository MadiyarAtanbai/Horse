package decoratorCar;

public class SportCar implements Car{
    Car car ;
    public SportCar(Car car ){
        this.car=car;
    }
    @Override
    public int getSpeet() {
        return this.car.getSpeet()+100;
    }
}

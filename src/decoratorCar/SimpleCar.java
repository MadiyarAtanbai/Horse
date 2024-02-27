package decoratorCar;

public class SimpleCar implements Car{
    private int speed = 100;

    @Override
    public int getSpeet() {
        return speed;
    }
}

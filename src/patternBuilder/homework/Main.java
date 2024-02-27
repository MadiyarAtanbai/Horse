package patternBuilder.homework;

public class Main {
    public static void main(String[] args) {

        Car Madicar = Car.builder().carMake("Toyota").horsepower(450).cost(50).volume(3.0).build();
        System.out.println(Madicar.getCarMake());
        System.out.println(Madicar.getHorsepower());
        System.out.println(Madicar.getCost());
        System.out.println(Madicar.getVolume());
    }
}
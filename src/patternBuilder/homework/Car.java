package patternBuilder.homework;

public class Car {
    private String carMake;
    private double volume;
    private int horsepower;
    private int cost ;

    private BodyType type;

    Car(ConcreateBuilder build) {
        this.carMake= build.CarMake;
        this.volume=
                build.Volume;
        this.cost=build.Cost;
        this.horsepower= build.Horsepower;
        if (build instanceof ConcreateBuilder){
            this.type = ((ConcreateBuilder) build).bodyType;
        }

    }


    public String getCarMake() {
        return carMake;
    }

    public double getVolume() {
        return volume;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getCost() {
        return cost;
    }

    public BodyType getType() {
        return type;
    }
    public static ConcreateBuilder builder(){
        return new ConcreateBuilder();
}

}
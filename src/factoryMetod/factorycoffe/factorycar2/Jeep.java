package factoryMetod.factorycoffe.factorycar2;

public class Jeep implements Car{
    @Override
    public String go() {
        return "i'am go 150km/h";
    }

    @Override
    public String stop() {


        return "stop";
    }
}

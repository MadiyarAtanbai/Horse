package factoryMetod.factorycoffe.factorycar2;

public class Toyota implements Car{
    @Override
    public String go() {

        return "I'm going 210km/h";
    }

    @Override
    public String stop() {

        return "stop";
    }
}

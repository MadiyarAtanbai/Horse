package factoryMetod.factorycoffe.factorycar2;

public class Porsche implements Car{
    @Override
    public String go() {
        return "I'm going 300km/h";
    }

    @Override
    public String stop() {

        return "stop";
    }
}

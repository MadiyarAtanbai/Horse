package factoryMetod.factorycoffe;

public class Americano extends Coffe{
    @Override
    public String getName() {
        return "Americano coffe";

    }

    @Override
    public int getSize() {
        return 500;
    }

    @Override
    public int getCos() {
        return 1300;
    }
}

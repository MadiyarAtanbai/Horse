package factoryMetod.factorycoffe;

public class Latte extends Coffe{
    @Override
    public String getName() {
        return "Latte coffe ";
    }

    @Override
    public int getSize() {
        return 1800;
    }

    @Override
    public int getCos() {
        return 500;
    }
}

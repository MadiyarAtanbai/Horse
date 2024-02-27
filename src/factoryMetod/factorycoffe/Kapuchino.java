package factoryMetod.factorycoffe;

public class Kapuchino extends Coffe{
    @Override
    public String getName() {
        return "Kapuchino coffe";

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

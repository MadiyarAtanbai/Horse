package factoryMetod.factorycoffe;

public class Expresso extends Coffe{
    @Override
    public String getName() {
        return "Expresso coffe";

    }

    @Override
    public int getSize() {
        return 1600;
    }

    @Override
    public int getCos() {
        return 800;
    }
}

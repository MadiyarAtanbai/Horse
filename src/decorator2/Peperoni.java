package decorator2;

public class Peperoni implements Pizza{

    @Override
    public String getName() {
        return "This Peperoni pizza ";
    }

    @Override
    public int getSize() {
        return 2100;
    }

    @Override
    public int Cost() {
        return 0;
    }
}

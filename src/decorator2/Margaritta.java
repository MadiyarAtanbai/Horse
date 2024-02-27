package decorator2;

public class Margaritta implements  Pizza{


    @Override
    public String getName() {
        return "This margaritta pizza";
    }

    @Override
    public int getSize() {
        return 2000;
    }

    @Override
    public int Cost() {
        return 0;
    }
}

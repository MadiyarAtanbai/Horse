package factoryMetod.factorycoffe;

public class OrderService  {
    public Coffe order(CoffeType coffeType){
        Coffe coffe =null;

        switch (coffeType){
            case AMERICANO : coffe =  new Americano();
            break;
            case KAPUCHINO:  coffe = new Kapuchino();
            break;
            case EXPRESSO:  coffe = new Expresso();
            break;
            case LATTE : coffe = new Latte();

        }
        return coffe;

    }
}

package decorator2;

public class HotDecoratorPizza implements Pizza{
    private Pizza pizza;

    public HotDecoratorPizza(Pizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public String getName() {
        return pizza.getName()+"asdasdas";
    }

    @Override
    public int getSize() {
        return 100;
    }

    @Override
    public int Cost() {
        return getSize() + 200;
    }
}

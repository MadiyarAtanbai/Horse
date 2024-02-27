package decorator2;

public class ChesseDecoratorPizza implements Pizza{
    Pizza pizza;

    public ChesseDecoratorPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getName() {
        return getName()+"with Pizza";
    }

    @Override
    public int getSize() {
        return 2100;
    }

    @Override
    public int Cost() {
        return getSize() + 200;
    }
}

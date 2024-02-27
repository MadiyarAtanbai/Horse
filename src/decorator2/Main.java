package decorator2;

public class Main {
    public static void main(String[] args) {
        Pizza margaritta = new Margaritta();
        margaritta = new HotDecoratorPizza(margaritta);
        System.out.println(margaritta.getName());
        System.out.println(margaritta.getSize());
        System.out.println(margaritta.Cost());
    }
}

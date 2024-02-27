package factoryMetod.factorycoffe;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        Coffe lattehjkl = orderService.order(CoffeType.LATTE);
        System.out.println(lattehjkl.getName());
        System.out.println(lattehjkl.getCos());
        System.out.println(lattehjkl.getSize());
    }
}

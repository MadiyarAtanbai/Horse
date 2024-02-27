package aaaaaa;

import aaaaaa.Cars.Card;
import aaaaaa.Cars.Kingston;
import decoratorCar.Car;

public class Main {
    public static void main(String[] args) {
        Card card1 = new Kingston();
        Adapter1 adapter1 = new Adapter1(card1);

    }
}

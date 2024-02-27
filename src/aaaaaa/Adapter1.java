package aaaaaa;

import aaaaaa.Cars.Card;
import aaaaaa.USB.Usb;

public class Adapter1 implements Usb {
    Card card;
    public Adapter1 (Card card ){
        this.card=card;

    }

    @Override
    public void reader() {
        card.carReader();






    }
}

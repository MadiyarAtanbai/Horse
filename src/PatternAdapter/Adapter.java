package PatternAdapter;

import PatternAdapter.usb.Usb;
import PatternAdapter.card.Card;

public class Adapter implements Usb{
    Card card ;

    public Adapter(Card card){
        this.card=card;
    }
    @Override
    public void readUsb() {
        card.reader();
    }




}

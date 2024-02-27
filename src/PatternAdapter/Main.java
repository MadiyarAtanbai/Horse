package PatternAdapter;
import PatternAdapter.usb.Transient;
import PatternAdapter.card.Card;

import PatternAdapter.card.KIngstonCard;

public class Main {
    public static void main(String[] args) {
        Card card1 = new KIngstonCard();
//Через адаптер
        Adapter adapter=new Adapter(card1);
        UsbPort usbPort=new UsbPort();
        usbPort.UsbPort(adapter);


        //Прямой
        Transient tr=new Transient();
        UsbPort usbPort2=new UsbPort();
        usbPort2.UsbPort(tr);

    }
}
package PatternAdapter.usb;

public class Transient implements Usb {
    @Override
    public void readUsb() {
        System.out.println("transient" );

    }
}

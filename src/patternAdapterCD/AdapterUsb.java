package patternAdapterCD;

import patternAdapterCD.usb.Toshiba;
import patternAdapterCD.usb.Usb;

public class AdapterUsb implements Usb {
    Usb usb;
    public AdapterUsb(Usb usb1){
        this.usb=usb1;
    }
    @Override
    public void readUsbs() {

    }
}

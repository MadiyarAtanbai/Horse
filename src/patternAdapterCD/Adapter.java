package patternAdapterCD;

import patternAdapterCD.usb.Usb;
import patternAdapterCD.cd.Cd;

public class Adapter implements Usb {
    Cd cd;

    public Adapter(Cd cd1){
        this.cd=cd1;
    }

        @Override
    public void readUsbs() {

    }
}

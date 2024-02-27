package patternAdapterCD;
import patternAdapterCD.cd.CdBrend;
import patternAdapterCD.usb.Toshiba;
import patternAdapterCD.usb.Usb;
import patternAdapterCD.cd.Cd;

public class Main {
    public static void main(String[] args) {
        Cd cd1 = new CdBrend();
        Adapter adapter = new Adapter(cd1);
        UsbPort usbPort = new UsbPort();
        usbPort.UsbPort(adapter);


    }

}

package PtternFasad;

public class Starter {
    Nasos nasos = new Nasos();
    Filter1 filter = new Filter1();
    Filter2 filter2 = new Filter2();
    Switch switch1 = new Switch();

    public void start (){
       nasos.nasos();
       filter.Filter();
       switch1.switchOn();
    }


    public void stop (){
        System.out.println("Starterw of...");
    }
}

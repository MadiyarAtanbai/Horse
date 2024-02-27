package home;

import Interface.Person;

public class Home {
    private String Door ;
    private String Window;
    private int CountRoom;
    private int Furniture;

    Person person = new Person("Madi");
    public Home(Person person1){
        this.person=person1;
    }



    public Home (String door , String window ){
        this.Door=door;
        this.Window=window;
    }
    public Home (int countRoom, int furniture){
        this.CountRoom=countRoom;
        this.Furniture=furniture;

    }

    public String getDoor() {
        return Door;
    }

    public String getWindow() {
        return Window;
    }

    public int getCountRoom() {
        return CountRoom;
    }

    public int getFurniture() {
        return Furniture;
    }
}

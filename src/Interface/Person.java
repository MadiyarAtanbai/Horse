package Interface;

import Polimarfizm.Animal;

public class Person implements Info {

    public String name ;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");

    }
    public void showInfo(){
        System.out.println("name is " + this.name);
    }
}

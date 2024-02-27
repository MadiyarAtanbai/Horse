package Interface;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("bob");
        outputiInfo(animal1);
        outputiInfo(person1);

    }
    public static void outputiInfo(Info info){
        info.showInfo();
    }
}

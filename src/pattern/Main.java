package pattern;

import javax.xml.crypto.dsig.SignedInfo;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
//        Singleton singleton1 = Singleton.getInstance();
//        System. out.println(singleton1.toString());
//        Singleton singleton2 = Singleton.getInstance();
//        System.out.println(singleton2.toString());

//        Connection connectionDb1 = ConnectionDb.getConnection();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.toString());
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.toString());

    }
}

//
//
////    Connection connectionDb0= ConnectionDb.getConnection();
////    Connection connectionDb1= ConnectionDb.getConnection();
////    Connection connectionDb2= ConnectionDb.getConnection();
////    Connection connectionDb3= ConnectionDb.getConnection();
////    Connection connectionDb4= ConnectionDb.getConnection();
////    Connection connectionDb5= ConnectionDb.getConnection();
////    Connection connectionDb6= ConnectionDb.getConnection();
////    Connection connectionDb7= ConnectionDb.getConnection();
////    Connection connectionDb8= ConnectionDb.getConnection();
//
//
//        Singleton singleton1 = Singleton.getInstance();
//        System.out.println(singleton1.toString());
//        Singleton singleton2 = Singleton.getInstance();
//        System.out.println(singleton2.toString());
//    }

//        Person originalPerson = new Person("Madi",21);
//
//        try {
//            Person clonedPerson = originalPerson.clone();
//            clonedPerson.setName("Alina");
//            clonedPerson.setAge(25);
//
//            Person clonedPerson2 = clonedPerson.clone();
//            clonedPerson2.setName("AAAAA");
////            clonedPerson2.setAge(32);
//
//            System.out.println("Original: "+ originalPerson.getName() +", " +  originalPerson.getAge() +", "+ " Old years");
//            System.out.println("Cloned: " + clonedPerson.getName() +", "+ clonedPerson.getAge()+", " + " Old years");
//            System.out.println("Cloned: " + clonedPerson2.getName() +", "+ clonedPerson2.getAge()+", " + " Old years");
//
//
//
//        }catch (Exception e){
//            e.printStackTrace();
//
//        }
//
//        }
//    }

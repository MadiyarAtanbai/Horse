package Исключения;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("asdadf");
//        мы пытаемся выполнить эту часть кода и надеемся что исключения не будут выброшены
        try {
            Scanner scanner = new Scanner(file);
//            Если все же они были выбрашены то обрабатываем их здесь
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
        System.out.println("после Catch можно писать ");

    }

}

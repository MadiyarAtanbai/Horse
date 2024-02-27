package методыString;

public class main {
    public static void main(String[] args) {
        String name = "Атанбай Мадияр Тагабайулы";
//        String[] fullname = name.split(" ");
//        System.out.println(fullname[1].concat(" ").concat(String.valueOf(fullname[0].charAt(0))).concat("."));
//        String[] fullname = name.split(" ");
//        System.out.println(fullname[1].concat("").concat(String.valueOf(fullname[0].charAt(0))).concat("."));
//        String[] fullname = name.split(" ");
//        System.out.println(fullname[1].concat(" ").concat(String.valueOf(fullname[0].charAt(0))).concat("."));
//        String[] fullname = name.split(" ");
//        System.out.println(fullname[1].concat(" ").concat(String.valueOf(fullname[0].charAt(0))).concat(" "));
//        String[] fullname = name.split(" ");
//        System.out.println(fullname[1].concat(" ").concat(String.valueOf(fullname[0].charAt(0))).concat(" "));
//        String[] fullname = name.split(" ");
//        System.out.println(fullname[1].concat(" ").concat(String.valueOf(fullname[0].charAt(0))).concat("."));
//        String[] fullname = name.split(" ");
//        System.out.println(fullname[1].concat(" ").concat(String.valueOf(fullname[0].charAt(0))).concat("."));
//        String[] fullname = name.split(" ");
//        System.out.println(fullname[1].concat(" ").concat(String.valueOf(fullname[0].charAt(0))).concat("."));
        String[] person = {"Мужчина", "Женшина"};
        for (int i = 0; i < person.length; i++) {
            if (person[i].equalsIgnoreCase("Мужчина")){
                System.out.println(person[i]+"  - Уважаемый");
            }
            if (person[i].equalsIgnoreCase("Женшина")){
                System.out.println(person[i]+"  - Уважаемая");
        }

        }

    }
}

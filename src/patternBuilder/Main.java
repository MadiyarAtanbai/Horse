package patternBuilder;

public class Main {
    public static void main(String[] args) {
        Apartment madiApartement = new Apartment.Builder().setAdress("Каитпас").setCost(50).setType(ApartmentType.PREMIUM).setCountFloor(15).build();
        System.out.println(madiApartement.getAdress());
        System.out.println(madiApartement.getCost());
        System.out.println(madiApartement.getCountFloor());
        System.out.println(madiApartement.getType());


    }
}

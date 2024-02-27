package patternBuilder;

public class Apartment {
    private String adress;
    private int cost;
    private int countFloor;

    private ApartmentType type;

    public String getAdress() {
        return adress;
    }

    public int getCost() {
        return cost;
    }

    public int getCountFloor() {
        return countFloor;
    }

    public ApartmentType getType() {
        return type;
    }

    public static class Builder{
        private String adress;
        private int cost;
        private int countFloor;

        private ApartmentType type;

        public Builder setAdress(String address){
            this.adress=address;
            return this;
        }
        public Builder setCost(int cost){
            this.cost=cost;
            return this;
        }
        public Builder setCountFloor(int countFloor){
            this.countFloor=countFloor;
            return this;
        }
        public Builder setType(ApartmentType type){
            this.type=type;
            return this;
        }
        public Apartment build (){
            Apartment apartment = new Apartment();
            apartment.adress=this.adress;
            apartment.cost=this.cost;
            apartment.countFloor=countFloor;
            apartment.type=this.type;
            return apartment;
        }

    }



}

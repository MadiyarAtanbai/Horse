package factoryMetod.factorycoffe.factoryCar;

public class CarDealership {
    public BMW dealership(BmwType bmwType){
        BMW bmw = null;

        switch (bmwType) {
            case BMW3F80: bmw = new Bmw3f80();
            break;
            case BMW4F82: bmw = new Bmw4f82();
            break;
            case BMW5F90: bmw = new Bmw4f82();
        }
        return bmw;
    }
}

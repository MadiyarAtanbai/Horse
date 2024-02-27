package factoryMetod.factorycoffe.factoryCar;

public class Bmw5f90 extends BMW{
    @Override
    public String getEquipment() {
        return "BMW M5 Competition";
    }

    @Override
    public double getVolume() {
        return 4.4;
    }

    @Override
    public int getVCost() {
        return 130000;
    }
}

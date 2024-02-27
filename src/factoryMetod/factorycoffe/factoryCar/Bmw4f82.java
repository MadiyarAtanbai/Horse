package factoryMetod.factorycoffe.factoryCar;

public class Bmw4f82 extends BMW{
    @Override
    public String getEquipment() {
        return "Bmw M4 Competition ";
    }

    @Override
    public double getVolume() {
        return 4.4;
    }

    @Override
    public int getVCost() {
        return 75000;
    }
}

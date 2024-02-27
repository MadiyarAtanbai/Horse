package factoryMetod.factorycoffe.factoryCar;

public class Bmw3f80 extends BMW{
    @Override
    public String getEquipment() {
        return "Bmw M3 Competition";
    }

    @Override
    public double getVolume() {
        return 3.0;
    }

    @Override
    public int getVCost() {
        return 70000;
    }
}

package patternBuilder.homework;

public abstract class Builder {
     String CarMake;
     double Volume;
     int Horsepower;
     int Cost ;


    public Builder carMake (String carMake){
        this.CarMake=carMake;
        return this;
    }
    public Builder volume(double volume){
        this.Volume=volume;
        return this;
    }
    public Builder horsepower(int horsepower){
        this.Horsepower=horsepower;
        return this;
    }
    public Builder cost (int cost){
        this.Cost=cost;
        return this;
    }
    public abstract Car build();
    }



package patternBuilder.homework;

public class ConcreateBuilder extends Builder{
    BodyType bodyType;

    public ConcreateBuilder bodyType(BodyType bodyType){
        this.bodyType=bodyType;
        return this;
    }
    @Override
    public Car build() {
        return new Car(this);
    }
}

public class Truck2DiselOpenUral extends Truck{
    public Truck2DiselOpenUral(){
        this.axis=2;
        this.enginetype="дизельный";
        this.bodytype="открытый";
        this.producer="Урал";
    }

    @Override
    public int getAxis(){
        return 2;
    }
    @Override
    public String getEngineType(){
        return "дизельный";
    }
    @Override
    public String getBodyType(){
        return "открытый";
    }
    @Override
    public String getProducer(){
        return "Урал";
    }
}
public class Truck3HybridOpenKamaz extends Truck{

    public Truck3HybridOpenKamaz() {
        this.axis=3;
        this.enginetype="гибридный";
        this.bodytype="открытый";
        this.producer="Камаз";
    }

    @Override
    public int getAxis(){
        return 3;
    }
    @Override
    public String getEngineType(){
        return "гибридный";
    }
    @Override
    public String getBodyType(){
        return "открытый";
    }
    @Override
    public String getProducer(){
        return "Камаз";
    }
}

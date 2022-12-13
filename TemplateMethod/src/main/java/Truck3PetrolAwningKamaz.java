public class Truck3PetrolAwningKamaz extends Truck{

    public Truck3PetrolAwningKamaz() {
        this.axis=3;
        this.enginetype="бензиновый";
        this.bodytype="тентованный";
        this.producer="Камаз";
    }

    @Override
    public int getAxis(){
        return 3;
    }
    @Override
    public String getEngineType(){
        return "бензиновый";
    }
    @Override
    public String getBodyType(){
        return "тентованный";
    }
    @Override
    public String getProducer(){
        return "Камаз";
    }
}

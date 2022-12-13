public class Truck1PetrolDumpFoton extends Truck{

    public Truck1PetrolDumpFoton(){
        this.axis=1;
        this.enginetype="бензиновый";
        this.bodytype="самосвал";
        this.producer="Foton";
    }

    @Override
    public int getAxis(){
        return 1;
    }
    @Override
    public String getEngineType(){
        return "бензиновый";
    }
    @Override
    public String getBodyType(){
        return "самосвал";
    }
    @Override
    public String getProducer(){
        return "Foton";
    }
}

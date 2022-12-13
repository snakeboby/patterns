abstract class Truck {
    int axis;//ось 1 2 3
    String enginetype;//типы двигателей
    String bodytype;//тип кузова самосвал, тентованный, открытый
    String producer;//изготовитель
    Boolean needDiscussion=false;//заказ нуждается в ручном согласовании
    String Tcolor="любой";//цвет

    public Truck (int axis,String etype, String btype,String prod){
        this.axis=axis;
        this.enginetype=etype;
        this.bodytype=btype;
        this.producer=prod;
    }

    protected Truck() {
    }

    public int getAxis(){ return this.axis;}
    public String getEngineType(){
        return this.enginetype;
    }
    public String getBodyType(){
        return this.bodytype;
    }
    public String getProducer(){
        return this.producer;
    }

    public Boolean getNeedDiscussion() { return needDiscussion;}
    public void setNeedDiscussion() {needDiscussion=true;}
    public String getTColor(){ return Tcolor;}
    public void setTColor(String newColor) {Tcolor=newColor;}
    public String toString(){
        String res="";
        if (axis==1)
            res=res+"Грузовик с 1 осью,двигателем типа";
        else
            res=res+"Грузовик с "+ Integer.toString(getAxis())+" осями,двигателем типа ";
        res=res+" "+getEngineType()+",с типом кузова "+getBodyType()+",производителя "+getProducer();
        res=res+",цвет - "+getTColor();
        if (this.getNeedDiscussion())
            res=res+"\n\n Заказ нуждаеся в согласовании! ";
        return res;
    }
}
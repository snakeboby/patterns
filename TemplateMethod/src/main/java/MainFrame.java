import java.util.Scanner;

public class MainFrame {

    private static Truck PickUpTruckModel(int axis, String engtype, String btype, String prod){
        if ((axis==1) && (engtype.equalsIgnoreCase("бензиновый") ) &&
                (btype.equalsIgnoreCase("самосвал")) &&
                (prod.equalsIgnoreCase("Foton")))
        {
            return new Truck1PetrolDumpFoton();
        }
        else{
            if ((axis==2) && (engtype.equalsIgnoreCase("дизельный") ) &&
                    (btype.equalsIgnoreCase("открытый")) &&
                    (prod.equalsIgnoreCase("Урал")))
            {
                return new Truck2DiselOpenUral();
            }
            else{
                if ((axis==3) && (engtype.equalsIgnoreCase("бензиновый") ) &&
                        (btype.equalsIgnoreCase("тентованный")) &&
                        (prod.equalsIgnoreCase("Камаз")))
                {
                    return new Truck3PetrolAwningKamaz();
                }
                else{
                    if((axis==3) && (engtype.equalsIgnoreCase("гибридный") ) &&
                            (btype.equalsIgnoreCase("открытый")) &&
                            (prod.equalsIgnoreCase("Камаз")))
                    {
                        return new Truck3HybridOpenKamaz();
                    }
                }
            }
        }
        Truck tmp=new Truck2DiselOpenUral();
        tmp.setNeedDiscussion();
        return tmp;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String name = "Конструктор грузовика:";
        System.out.print("Введите количество осей (1,2 или 3):");
        int axis=in.nextInt();
        System.out.print("Введите тип двигателя (бензиновый, дизельный, гибридный): ");
        String engtype=in.next();
        System.out.print("Введите тип кузова (самосвал, тентованный, открытый): ");
        String btype=in.next();
        System.out.print("Введите производителя (Например: Foton, Урал, Камаз):  ");
        String prod=in.next();
        Truck truckChoise= PickUpTruckModel(axis,engtype,  btype,prod);
        System.out.print("Выбрать цвет?(да/нет)  ");
        if (in.next().equalsIgnoreCase("да")){
            System.out.print("Укажите цвет:  ");
            String color=in.next();
            truckChoise.setTColor(color);
        }
        System.out.print("--------------------- \n Результат:");
        System.out.print(truckChoise.toString());
    }
}


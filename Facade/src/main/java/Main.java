public class Main {
    public static void main(String[] args) {
        WeldingFacade facade = new WeldingFacade();

        System.out.println(facade.weld("Samovar", "Black").getFullName());
        System.out.println(facade.weld("Coffee machine", "Latte").getFullName());
    }
}

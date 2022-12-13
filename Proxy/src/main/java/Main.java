public class Main {
    public static void main(String[] args) {
        DBRepository postgres = new PostgresRepository();
        DBRepository proxy = new PostgresProxy(postgres);

        proxy.read();
    }
}

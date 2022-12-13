public class PostgresRepository implements DBRepository {
    @Override
    public void read() {
        System.out.println("Read form db");
    }

    @Override
    public void beginTransaction() {
        System.out.println("Begin transaction");
    }

    @Override
    public void endTransaction() {
        System.out.println("End transaction");
    }
}

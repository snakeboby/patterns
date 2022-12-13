public class PostgresProxy implements DBRepository {

    private final DBRepository repository;

    public PostgresProxy(DBRepository repository) {
        this.repository = repository;
    }

    @Override
    public void read() {
        repository.beginTransaction();
        repository.read();
        repository.endTransaction();
    }

    @Override
    public void beginTransaction() {
        repository.beginTransaction();
    }

    @Override
    public void endTransaction() {
        repository.endTransaction();
    }
}

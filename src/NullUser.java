public class NullUser extends User {

    public NullUser(int id, String name) {
        super(id, name);
    }

    @Override
    public int getId() {
        return -1;
    }

    @Override
    public String getName() {
        return "NA";
    }
}

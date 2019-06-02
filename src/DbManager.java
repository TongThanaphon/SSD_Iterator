import java.util.ArrayList;
import java.util.List;

public class DbManager {

    private List<User> users = new ArrayList<>();

    private static DbManager instance = new DbManager();

    public static DbManager getInstance(){
        return instance;
    }

    private DbManager(){
        users.add(new User(1, "Alice"));
        users.add(new User(2, "Bob"));
    }

    public User findUser(int id){
        for(User u : users){
            if(u.getId() == id){
                return u;
            }
        }
        return User.nullUser();
    }

}

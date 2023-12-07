import java.util.HashSet;
import java.util.Set;

public class UserHashSet {
    static  Set<User> users = new HashSet<>();
    public static void main(String[] args) {
        insertuser();
        deleteuser();
        displayuser();
        //searchuser();
    }
    static User obj1=(new User(1, "john_doe", "password123", "john@example.com", "John", "Doe", "athlete"));
    static User obj2=(new User(2, "jane_smith", "pass456", "jane@example.com", "Jane", "Smith", "coach")); 
    static User obj3=(new User(3, "admin_user", "adminPass", "admin@example.com", "Admin", "User", "administrator"));       
    public static void insertuser()
    {
    users.add(obj1);
    users.add(obj2);
    users.add(obj3);
    }

    public static void displayuser()
    {
        for (User i : users) {
            System.out.println("User ID: " + i.getUser_id());
            System.out.println("Username: " + i.getUsername());
            System.out.println("Email: " + i.getEmail());
            System.out.println("First Name: " + i.getFirst_name());
            System.out.println("Last Name: " + i.getLast_name());
            System.out.println("User Type: " + i.getUser_type());
            System.out.println();
        }
    }
    public static void deleteuser()
        {
            users.remove(obj1);
        }
}


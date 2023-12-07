import java.util.ArrayList;

public class UserMain {
    static  ArrayList<User> users = new ArrayList<>();
    public static void main(String[] args) {
        insertuser();
        //displayuser();
        //deleteuser();
        updateuser();
        displayuser();
        //searchuser();
    }

    public static void insertuser()
    {
        users.add(new User(1, "john_doe", "password123", "john@example.com", "John", "Doe", "athlete"));
        users.add(new User(2, "jane_smith", "pass456", "jane@example.com", "Jane", "Smith", "coach")); 
        users.add(new User(3, "admin_user", "adminPass", "admin@example.com", "Admin", "User", "administrator"));       
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
            users.remove(0);
            users.removeIf(user -> user.getUser_id() == 3);

    }
    public static void updateuser()
    {

            users.set(2,new User(3, "Joshika", "adminPass", "Josh@example.com", "Josh", "Dorairaj", "Athlete"));
            // for (User i : users) {
            //     if (i.getUser_id() == 3) {
            //         i.setFirst_name("UpdatedName");
            //         i.setEmail("updated@example.com");
            //     } 
            // }
    }
    public static void searchuser()
    {
        for (User user : users) {
            if (user.getUsername().equals("swathi")) {
                System.out.println("User Found:");
                System.out.println("User ID: " + user.getUser_id());
                System.out.println("Username: " + user.getUsername());
                System.out.println("Email: " + user.getEmail());
                System.out.println("First Name: " + user.getFirst_name());
                System.out.println("Last Name: " + user.getLast_name());
                System.out.println("User Type: " + user.getUser_type());
            }
            else{
                System.out.println("User Not Found");
            }
        }
    }
    
}
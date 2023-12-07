import java.util.Scanner;

public class UserTest 
{
    static User users[]=new User[5];
    public static void main(String[] args) 
    {
        adduser();
        displayuser();
        deleteuser();
        updateuser();
    }
    public static void adduser()
    {
        users[0]=new User(1,"Swathi","Swathi123","Swathi@gmail.com","Swathi","N","Academic");
        users[1]=new User(2,"Sivashree","Sivashree123","Sivashree@gmail.com","Sivahsree","K","Academic");
        users[2]=new User(3,"Sneka","Sneka123","Sneka@gmail.com","Sneka","S","Athlete");
        users[3]=new User(4,"Selvei","Selvei123","Selvei@gmail.com","Selvei","N","Academic");
        users[4]=new User(5,"Ellakiya","Ellakiya123","Ellakiya@gmail.com","Ellakiya","G","Adminstrator");
    }
    public static void displayuser()
    {
        for (User user : users) {
            System.out.println(user);
        }
    }

    public static void deleteuser()
    {
        Scanner sc=new Scanner(System.in);
        int deleteindex=sc.nextInt();
        users[deleteindex]=null;
        for (User user : users) {
            System.out.println(user);
        }
     
    }
    public static void updateuser()
    {
        Scanner sc=new Scanner(System.in);
        int updateindex=sc.nextInt();
        users[updateindex]=new User(5,"Joshika","Joshika","Joshika@gmail.com","joshika","D","Adminstrator");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
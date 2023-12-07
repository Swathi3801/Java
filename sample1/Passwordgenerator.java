import java.util.*;
public class Passwordgenerator 
{
    public static void main(String[] args) 
    {
        System.out.println(generatepassword(8));
    }
    public static char[] generatepassword(int length)
    {
        String lower="abcdefghijklmnopqrstuvwxyz";
        String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialChar="!@#$%^&*";
        String numbers="1234567890";
        String combine=lower+upper+specialChar+numbers;
        
        Random obj=new Random();
        char password[]=new char[length];
        
        for(int i=0;i<length;i++)
        {
            password[i]=combine.charAt(obj.nextInt(combine.length()));

        }
        return password;
    }
}

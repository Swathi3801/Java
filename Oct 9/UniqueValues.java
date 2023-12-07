public class UniqueValues {
    public static void main(String[] args) {
        int numbers[]={10,20,10,30};
        for(int i=0;i<numbers.length-1;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[i] == numbers[j])
                {
                    numbers[j]=0;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++)
        {
            if(numbers[i]!=0)
            System.out.println(numbers[i]);
        }
        
    }
}


import java.util.*;

public class factorial{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int number;
        int fact=1;
        System.out.println("enter number");
        number=sc.nextInt();

        for(int i=number-1; i>0; i--)
        {
            number=number*i;
        }

        System.out.println(number);







    }

}
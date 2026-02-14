
import java.util.*;

public class dsa14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumofodd = 0;
        int sumofeven = 0;
        int number;
        int choise;

        do {
            System.out.println("enter the number");
            number = sc.nextInt();
            if (number % 2 == 0) {
                sumofeven += number;
            } else {
                sumofodd += number;
            }

            System.out.println("enter 1 for add more number or 0 for print");

            choise = sc.nextInt();

        } while (choise == 1);
        System.out.println("sum of even no 0 " + sumofeven);
        System.out.println("sum of odd no 0 " + sumofodd);

    }

}
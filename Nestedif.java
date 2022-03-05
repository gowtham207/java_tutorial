package programflow;

import java.util.Scanner;

public class Nestedif {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marital status M/U: ");
        char marital = input.next().charAt(0);
        int age;
        if(marital =='u' || marital =='U' )
        {
            System.out.println("Enter the Gender :");
            char gender = input.next().charAt(0);
            System.out.println("Enter the Age :");
            age= input.nextInt();
            if ((gender=='m'||gender=='M')&& age>=30)
            {
                System.out.println("you are eligible for insurance");
            }
            else if((gender=='M' || gender == 'M') && age>=25)
            {
                System.out.println("you are eligible for insurance");
            }
            else
            {
                System.out.println("Insurance is not eligible");
            }
        }
        else if(marital =='m' || marital =='M')
        {
            System.out.println("your are eligible for insurance");
        }
        else
        {
            System.out.println("invalid input ...");
        }
    }
}

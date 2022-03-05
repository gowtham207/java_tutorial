package programs;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String args[])
    {
        Scanner input =new Scanner(System.in);
        System.out.println("enter three digit number: ");
        int num = input.nextInt();//123
        int temp = num;
        int d1,d2,d3;
        d3 = temp%10;
        temp = temp/10;

        d2 = temp%10;
        temp = temp/10;

        d1 = temp%10;

        int result = (d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);

        if(num==result)
        {
            System.out.println(num+" is a armstrong number");
        }
        else
        {
            System.out.println(num+" is not a armstrong number");
        }


    }
}

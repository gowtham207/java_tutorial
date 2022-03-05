package programflow;

import java.util.Scanner;

public class whileloop {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the loop no: ");
        int a = input.nextInt();
        int i =0;
        while(i<=a)
        {
            System.out.println(i);
            i++;
        }
    }
}
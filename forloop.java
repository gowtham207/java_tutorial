package programflow;

import java.util.Scanner;

public class forloop {
    public static void main(String args[])
    {
        System.out.println("enter the number: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for(int i =0;i<=a;i++)
        {
            System.out.println(i);
        }
    }
}

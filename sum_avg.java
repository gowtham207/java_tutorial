package programs;

import java.util.Scanner;

public class sum_avg {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = input.nextInt();
        int a,b=0;
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the number "+i+" : ");
            a = input.nextInt();
            b+=a;
        }
        System.out.println("the sum of number is "+b);
        System.out.println("the average of the number "+b/n);
    }
}

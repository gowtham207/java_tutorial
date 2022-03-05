package programs;

import java.util.Scanner;

public class multiplication {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the table:");
        int t = input.nextInt();
        System.out.println("enter the limit: ");
        int n = input.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(t+" x "+i+" = "+(t*i));
        }
    }
}

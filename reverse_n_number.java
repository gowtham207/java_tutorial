package programs;

import java.util.Scanner;

public class reverse_n_number {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("value: ");
        int n = input.nextInt();
        int reverse = 0 ,rev;
        while(n!=0)
        {
            rev = n%10;
            reverse = (reverse *10)+rev;
            n=n/10;
        }
        System.out.println("reverse is "+reverse);
    }

}


package programflow;

import java.util.Scanner;

public class Switch {
    public static void main(String args[])
    {int a,b,c,ch;
        Scanner input = new Scanner(System.in);
        System.out.println("first number:");
        a= input.nextInt();
        System.out.println("Second number:");
        b=input.nextInt();
        System.out.println("1.add");
        System.out.println("2.sub");
        System.out.println("3.multi");
        System.out.println("4.Div");
        System.out.println("Enter your choice");
        ch = input.nextInt();
        switch (ch)
        {
            case 1:
                c=a+b;
                System.out.println("add: "+c);
                break;

            case 2:
                c=a-b;
                System.out.println("sub: "+c);
                break;

            case 3:
                c=a*b;
                System.out.println("multi: "+c);
                break;

            case 4:
                c=a/b;
                System.out.println("div: "+c);
                break;
            default:
                System.out.println("Invalid selection");
                break;


        }

    }
}

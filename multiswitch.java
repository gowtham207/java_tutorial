package programflow;

import java.util.Scanner;

public class multiswitch
{
    public static void main(String args[])
    {
        char a;
        System.out.println("enter the character:");
        Scanner input = new Scanner(System.in);
        a = input.next().charAt(0);
        System.out.println(a);
        System.out.println();
        switch (a)
        {
            case 'A':
            case 'a':
            case 'e':
            case 'E':
            case 'I':
            case 'i':
            case 'o':
            case 'O':
            case 'U':
            case 'u':
                System.out.println("it is vowels");
                break;
            default:
                System.out.println("it is consonent");
                break;
        }
    }
}

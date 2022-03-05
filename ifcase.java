package programflow;

import java.util.Scanner;

public class ifcase {
    public static void main(String args[])
    {
        int age;
        System.out.println("enter the age: ");
        Scanner input = new Scanner(System.in);
        age =input.nextInt();
        if(age>=18)
        {
            System.out.println("you are elligible for vote");
        }
        else
        {
            System.out.println("you are not elligible for vote");
        }
    }
        }

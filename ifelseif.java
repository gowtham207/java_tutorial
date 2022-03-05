package programflow;

import java.util.Scanner;

public class ifelseif {

    public static void main(String args [])
    {
    float mark;
        System.out.println("enter the mark:");
        Scanner input = new Scanner(System.in);
        mark = input.nextFloat();
        if (mark>=90 && mark<=100)
        {
            System.out.println("grade A");
        }
        else if(mark>=80 && mark<=89)
        {
            System.out.println("grade B");
        }
        else if(mark>=70 && mark<=79)
        {
            System.out.println("grade c");
        }
        else
        {
            System.out.println("grade D");
        }
    }
}

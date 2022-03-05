package programflow;
import java.util.Scanner;
public class do_whileloop {
    public static void main(String args[])
    {
        Scanner input =  new Scanner(System.in);
        System.out.println("enter the value:");
        int a = input.nextInt();
        int i =1;
        do
        {
            System.out.println(i);
            i++;
        }while(a>=i);
    }
}

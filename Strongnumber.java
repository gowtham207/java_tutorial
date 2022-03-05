package programs;

import java.util.Scanner;

public class Strongnumber {

    public static void main(String args [])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number: ");
        int a = input.nextInt();
        int temp=a,rem,fact,sum=0,i;
        while (a>0)
        {
            rem = a%10;
            //System.out.println("remainder: "+rem);
            fact = 1;
            for(i=1;i<=rem;i++)
            {
                fact*=i;
            }
            //System.out.println("modulus: "+fact);
            sum+=fact;
            a=  a/10;
        }

      if(sum == temp)
      {
          System.out.println("it is a Strong number "+ temp);
      }
      else
      {
          System.out.println("it is not a Strong number "+temp);
      }

    }
}

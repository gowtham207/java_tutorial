package programs;

public class armstrong_for_100 {
    public static void main(String[] args)
    {
        int d1,d2,d3,result,temp;
        for(int i=100;i<=999;i++)
        {
            temp = i;
            d3 = temp%10;
            temp = temp/10;
            d2 = temp%10;
            temp = temp/10;
            d1 = temp%10;
            result = (d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);

            if(i==result)
            {
                System.out.println(i+" is a armstrong number");
            }

        }
    }
}

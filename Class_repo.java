package programs;

import java.util.ArrayList;
import java.util.List;

public class Class_repo {
    public static void main(String args[])
    {
        List<String> a ;
        a=getArrayList();
        System.out.println(a);
    }
    public static List getArrayList() {
        List<String> colorsList = new ArrayList<String>();
        colorsList.add("Green");
        colorsList.add("Red");
        colorsList.add("Yellow");
        colorsList.add("Green");
        colorsList.add("Blue");
        colorsList.add("Red");
        return colorsList;
    }
}
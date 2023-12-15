import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class Arraylist
{
    public static void main(String[] args)
    {
        /*ArrayList<Integer> list1 = new ArrayList();
        list1.add(10);
        list1.add(50);
        list1.add(25);
        System.out.println(list1);
        System.out.println("Element at index 1 is = "+list1.get(1));

        list1.add(1,23);
        System.out.println(list1);
        list1.set(1,400);
        System.out.println(list1);

        list1.remove(2);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);*/
        ArrayList<String> list1 = new ArrayList();
        list1.add("hii");
        list1.add("hello");
        list1.add("string");
        System.out.println(list1);
        for(int i=0;i<list1.size();i++)
        {
            if(list1.get(i).startsWith("h"))
                System.out.println(list1.get(i));

        }
    }
}

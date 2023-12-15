import java.util.Scanner;
import java.util.LinkedList;
public class LinkedsList
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list1 = new LinkedList();
        int n,i=0;
        Scanner s = new Scanner(System.in);



            while (true) {

                System.out.println("Enter 1 for insertbegin  \n 2 for insertend \n 3 for display\n 4 for delete begin\n 5 foe delete end\n 6 for search \n7  for exit ");
                int choice = s.nextInt();
                switch (choice)
                {

                    case 1:
                        System.out.println("Enter the data ");
                        int data = s.nextInt();
                        list1.addFirst(data);
                        break;
                    case 2:
                        System.out.println("Enter the data ");
                        data = s.nextInt();
                        list1.addLast(data);
                        break;
                    case 3:for(i=0;i<list1.size();i++)
                    {

                        System.out.print(list1.get(i)+" -> ");
                    }
                    System.out.print(" null ");
                    System.out.println(" ");
                        break;
                    case 4:
                        list1.removeFirst();
                        break;
                    case 5:
                        list1.removeLast();
                        break;
                    case 6:
                        System.out.println("Enter the key ");
                        int key = s.nextInt();
                        for(i=0;i<list1.size();i++) {

                            if(key==list1.get(i))
                                System.out.println("Key found at index "+i);
                        }

                        break;
                    case 7:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice ");
                }
            }
        }


}

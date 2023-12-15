import java.util.Scanner;
public class Stack_array
{
    static Scanner s = new Scanner(System.in);
    static int stack[]=new int[10];
    static int i,top=-1,size;
    public static void push()
    {
        if(top==size-1)
            System.out.println("Stack overflow\n");
        else
        {
            System.out.println("Enter the element to be inserted\n");
            int ele=s.nextInt();
            stack[++top]=ele;
        }

    }
    public static void pop()
    {
        if(top==-1)
            System.out.println("Stack underflow\n");
        else
        {
            System.out.println(" Popped element is "+stack[top--]);
        }
    }
    public static void display()
    {
        if(top==-1)
            System.out.println("Stack underflow\n");
        else
        {
            for(i=top;i>=0;i--)
                System.out.println(stack[i]);
        }

    }
    public static void peek()
    {
        if(top==-1)
            System.out.println("Stack underflow\n");
        else
        {
            System.out.println("Top element is "+stack[top]);
        }
    }
    public static void main(String[] args)
    {
        int choice,ele;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of stack\n");
        size=s.nextInt();
        while(true)
        {
            System.out.println("\nEnter 1 for push\n 2 for pop\n 3 for display\n 4 for peek\n 5 for exit\n");
            choice = s.nextInt();
            switch(choice)
            {
                case 1: push();
                    break;
                case 2: pop();
                    break;
                case 3: display();
                    break;
                case 4: peek();
                    break;
                case 5: System.exit(0);
                default:
                    System.out.println("\nInvalid choice");


            }
        }
    }
}

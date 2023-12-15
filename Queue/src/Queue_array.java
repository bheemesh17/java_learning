import java.util.Scanner;
public class Queue_array {
     static Scanner s = new Scanner(System.in);
     static int front = 0, rear = -1;
     static int size=4;
     static int queue[] = new int[size];

     public static void enqueue(int ele) {
          if (rear == size - 1) {
               System.out.println("Queue full ");
          }
          else {


               queue[++rear] = ele;
          }
     }

     public static void dequeue() {
          if (front > rear)
               System.out.println("Queue Empty ");

           else
               System.out.println("Deleted element is " + queue[front++]);
     }

     public static void display() {
          if (front > rear) {
               System.out.println("Queue Empty ");

          } else {
               for (int i = front; i <= rear; i++)
                    System.out.print(queue[i] + " ");
               System.out.println(" ");
          }
     }

     public static void front() {

          if (front > rear)
               System.out.println("Queue Empty ");
          else
               System.out.println("Front element is" + queue[front]);
     }
     public static void main(String[]args)
     {
          System.out.println("Enter the size of queue:-" );
          size=s.nextInt();
          while(true)
          {
               System.out.println("Enter 1 for insert\n 2 for delete\n 3 for display \n 4 for front \n 5 for exit\n");
               int input=s.nextInt();
               switch(input)
               {
                    case 1:System.out.println("Enter the element to be inserted ");
                         int ele = s.nextInt();
                         enqueue(ele);
                         break;
                    case 2:dequeue();
                         break;
                    case 3:display();
                         break;
                    case 4:front();
                         break;
                    case 5:System.exit(0);
                    default:System.out.println("Invalid choice ");
               }
          }
     }
}

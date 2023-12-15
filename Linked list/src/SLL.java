import java.util.Scanner;
public class SLL
{
    Scanner s = new Scanner(System.in);

    Node head;
    class Node
    {                                          // declaraing data and address
        int data;
        Node next;

        Node(int data) {                  // initialization on constructor
            this.data = data;
            this.next = next;
        }
    }
    void insertBegin(int data)
    {
        Node nn = new Node(data);
        if(head==null)
        {
            head=nn;
            return;
        }
        nn.next=head;
        head=nn;
    }
    void insertafterkey(int data,int key)
    {
        Node nn = new Node(data);
        Node temp=head;
        while(temp!=null && temp.data!=key)
            temp=temp.next;
        nn.next=temp.next;
        temp.next=nn;
    }
     void insertbeforekey(int data)
    {
        Node nn = new Node(data);
        if(head==null)
        {
            head=nn;
            return;
        }
        System.out.println("Enter the key in which you want to insert before ");
        int keyb=s.nextInt();
        Node prev=head;
        Node temp=head;
        while(temp!=null && temp.data!=keyb)
        {
            prev=temp;
            temp=temp.next;
        }
        prev.next=nn;
        nn.next=temp;

    }
    void insertEnd(int data)
    {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = nn;
    }
    void printlist()
    {
        if (head == null) {
            System.out.println("List is empty ");
        }
        Node temp = head;
        if (head != null)
            System.out.println("List is :-  ");
        while (temp!= null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        if (head != null)
            System.out.print(" null ");
        System.out.println(" ");

    }
    void deleteBegin()
    {
        if(head==null)
            System.out.println("List is empty ");
        Node temp=head;
        head=head.next;

    }
    void deletebforekey()
    {
        System.out.println("Enter the key to delete after ");
        int keydb = s.nextInt();
        Node address=head;
         Node tempAddress=head;
         Node preAddress=head;

        //Traverse the list to reach the given node
        while(address.data!=keydb){
            tempAddress=preAddress;
            preAddress=address;
            address=address.next;
        }

        //If need to delete node before second node means to delete first node
        if(address==head.next){
            head=address;
        }

        //If trying to delete first node.
        else if(address==head){
            System.out.println("No any previous node available to delete!!");
        }

        //For rest of the condition
        else{
            tempAddress.next=address;
        }


    }
    void deleteafterkey()
    {
        Node temp=head;

        System.out.println("Enter the key to delete after ");
        int keyda = s.nextInt();
        while(temp.next!=null && temp.data!=keyda)
        {

            temp=temp.next;
        }
        temp.next=temp.next.next;

    }
    void deleteEnd()
    {

        //Node last=head.next;
        if(head==null)
            System.out.println("List is empty ");
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node second_last=head;
        Node last=head.next;
        while(last.next!=null)
        {
            last = last.next;
            second_last = second_last.next;

        }
        second_last.next=null;

    }
    void search(int key)
    {
        Node temp=head;
        int i=0;
        while(temp!=null && temp.data!=key)
        {
            i++;
            temp = temp.next;
        }
        System.out.println("Key found at node number "+(i+1));
    }
    public static void main(String[] args)
    {
        int n,i=0;

        SLL obj = new SLL();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 for singly linked list\n 2 for stack\n 3 for queue ");
        int input=s.nextInt();
        if(input==1)
        {
            while (true) {

                System.out.println("Enter 1 for insertbegin  \n 2 for insertend \n3 for insert_after_key\n 4 for insert_before_key\n5 for display\n 6 for delete begin\n7 for delete_after_key\n 8 for delete_before_key \n9 for delete end\n 10 for search \n11  for exit ");
                int choice = s.nextInt();
                switch (choice)
                {

                    case 1:
                        System.out.println("Enter the data ");
                        int data = s.nextInt();
                        obj.insertBegin(data);
                        break;
                    case 2:
                        System.out.println("Enter the data ");
                        data = s.nextInt();
                        obj.insertEnd(data);
                        break;
                    case 3:System.out.println("Enter the key after which u want 2 insert ");
                            int key_after = s.nextInt();
                            System.out.println("Enter the data ");
                            data = s.nextInt();
                            obj.insertafterkey(data,key_after);
                            break;
                    case 4:
                            System.out.println("Enter the data ");
                            data = s.nextInt();
                            obj.insertbeforekey(data);
                            break;

                    case 5:
                        obj.printlist();
                        break;
                    case 6:
                        obj.deleteBegin();
                        break;
                    case 7:obj.deleteafterkey();
                        break;
                    case 8:
                        obj.deletebforekey();
                        break;
                    case 9:
                        obj.deleteEnd();
                        break;
                    case 10:
                        System.out.println("Enter the key ");
                        int key = s.nextInt();
                        obj.search(key);
                        break;
                    case 11:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice ");
                }
            }
        }
        if(input==2)
        {
            while (true) {

                System.out.println("Enter 1 for inserend \n   2 for display\n 3 for delete end\n 4 or search \n 5for exit ");
                int choice = s.nextInt();
                switch (choice)
                {

                    case 1:
                        System.out.println("Enter the data ");
                        int data = s.nextInt();
                        obj.insertEnd(data);
                        break;

                    case 2:
                        obj.printlist();
                        break;

                    case 3:
                        obj.deleteEnd();
                        break;
                    case 4:
                        System.out.println("Enter the key ");
                        int key = s.nextInt();
                        obj.search(key);
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice ");
                }
            }
        }
        if(input==3)
        {
            while (true) {

                System.out.println("Enter 1 for insertEnd  \n   2 for display\n 3 for delete begin\n n 4 for search \n5  for exit ");
                int choice = s.nextInt();
                switch (choice)
                {

                    case 1:
                        System.out.println("Enter the data ");
                        int data = s.nextInt();
                        obj.insertEnd(data);
                        break;

                    case 2:
                        obj.printlist();
                        break;
                    case 3:
                        obj.deleteBegin();
                        break;

                    case 4:
                        System.out.println("Enter the key ");
                        int key = s.nextInt();
                        obj.search(key);
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice ");
                }
            }
        }
    }

}

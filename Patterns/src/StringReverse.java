public class StringReverse
{
    public static void main(String []args)
    {
        StringBuilder start = new StringBuilder("Tony");
        for(int i=0;i<start.length()/2;i++)
        {
            int front =i;
            int back=start.length()-1-i;
            char frontchar = start.charAt(front);
            char backchar = start.charAt(back);
            start.setCharAt(front,backchar);
            start.setCharAt(back,frontchar);
        }
        System.out.println(start);
        




    }
}

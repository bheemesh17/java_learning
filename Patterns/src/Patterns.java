import java.util.Scanner;
public class Patterns
{
    public static void main(String []args)
    {
        int i,j,n=1;
        // Solid Rectangle


       /* for(i=0;i<4;i++)
        {
            for (j = 0; j < 5; j++)
                System.out.print(" * ");
            System.out.println(" ");
        }*/


        // Hallow Rectangle


        /*for(i=0;i<4;i++)
        {
            for (j = 0; j < 5; j++) {
                if (i == 0 || j == 0 || i == 3 || j == 4)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println(" ");
        }*/

        // Half Pyramid

       /* for(i=0;i<4;i++)
        {
            for (j = 0; j <= i; j++)
            {

                    System.out.print(" * ");

            }
            System.out.println(" ");
        }*/

        //Inverted half pyramid

        /*for(i=3;i>=0;i--)
        {
            for (j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }*/

        // Inverted rotated half pattern
        /*for(i=1;i<=4;i++)
        {
            for (j = 1;j<=4-i; j++)
                System.out.print("   ");
            for (j = 1;j<=i; j++)
                System.out.print(" * ");

            System.out.println(" ");
        }*/

        // Half pyramid with num
            /*
        for(i=1;i<=5;i++) {
            for (j = 1; j <= i; j++)
                System.out.print(" " + j+ " ");
            System.out.println(" ");
        }*/

        // Inverted half pyramid with num

       /* for(i=5;i>=0;i--) {
            for (j = 1; j <= i; j++)
                System.out.print(" " + j + " ");
            System.out.println(" ");
        }*/

        //  System.out.println("floyds pattern ");

        /*for(i=1;i<=5;i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" " + n + " ");
                n++;
            }
            System.out.println(" ");
        }*/

        // System.out.println("Heart pattern pattern ");

        /*  for(i=0;i<5;i++)
          {
            for (j = 0; j < 5; j++)
            {
                if (i == 0 && j != 2 || i == 1 && (i + j) % 2 != 0 || i - j == 2 || i + j == 6)
                    System.out.print("  *  ");
                else
                    System.out.print("     ");
            }
            System.out.println("    ");
        }*/


        // System.out.println("compliment pattern ");

                for(i=1;i<=5;i++) {
            for (j = 1; j <= i; j++)
            {
                if(i==j || i-j==2 ||i==5&&j==1)
                    System.out.print(" 1 ");
                if(i-j==1 || i-j==3)
                    System.out.print(" 0 ");;

            }
            System.out.println(" ");
        }


    }
}

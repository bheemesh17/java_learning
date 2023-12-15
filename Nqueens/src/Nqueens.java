import java.awt.*;
import java.util.Scanner;
public class Nqueens
{
    Scanner  s = new Scanner(System.in);
    static int num=0;
    void nqueen(int arr[][],int n) {
        while (true) {

            int i, j;
            System.out.println("Enter the row no and column no in which u want u place queeen no " + num);
            int r = s.nextInt();
            int c = s.nextInt();
            for (i = 1; i <=n; i++) {
                for (j = 1; j <=n; j++) {
                    if (i == r && j == c)
                    {
                        num++;
                        System.out.print(" Q ");
                    }
                    if( i==r || j==c)
                        System.out.print(" * ");
                    else
                        System.out.print(" ");


                }
                System.out.println(" ");
            }

            if (num == n)
                return;
        }
    }
        public static void main (String[]args)
        {
            int n;
            Nqueens obj = new Nqueens();
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the size n*n ");


            n = s.nextInt();
            int arr[][] = new int[n][n];
            System.out.println("Game starts now:- ");
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                    System.out.print(" * ");
                System.out.println(" ");
            }
            obj.nqueen(arr, n);
        }
    }


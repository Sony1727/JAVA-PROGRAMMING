import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main (String a[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Sum of numbers :");
        int num=s.nextInt();
        int sum=0,i;
        for(i=0;i<num;i++)
        {
            sum=sum+i;
        }
System.out.println("Result="+sum);
    }





}

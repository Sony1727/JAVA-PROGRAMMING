import java.util.Scanner;
public class Main {
    public static void main(String a[])
    {
        System.out.println("Enter 2 numbers :");
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        int num2=s.nextInt();
        int result= sum(num1,num2);
        System.out.println("res="+result);

    }
static int sum(int a,int b)
    {
        int s=a+b;
        return s;
    }


}

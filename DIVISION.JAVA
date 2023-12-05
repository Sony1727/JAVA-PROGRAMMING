import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter  3 numbers :");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int d=s.nextInt();
        d=a/b/d;
        System.out.println("Result="+d);

    }
}

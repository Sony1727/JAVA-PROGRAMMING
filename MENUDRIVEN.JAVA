import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String a[]){
        int ab,bc,df,choice;
        System.out.println("Enter your choice");
        Scanner sc=new Scanner(System.in);
        System.out.println("PRESS1 FOR ADDITION");
        System.out.println("PRESS2 FOR SUBSTRACTION");
        System.out.println("PRESS3 FOR MULTIPLICATION");
        System.out.println("PRESS4 FOR DIVISION");
        System.out.println("PRESS9 FOR QUIT");

        System.out.println("Make your choice");
        choice=sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter your first nbr");
                ab=sc.nextInt();

                System.out.println("Enter your second nbr");
                bc=sc.nextInt();
               df= ab+bc;
               System.out.println("Result is"+df);
               break;

            case 2:
                System.out.println("Enter your first nbr");
                ab=sc.nextInt();

                System.out.println("Enter your second nbr");
                bc= sc.nextInt();
                df=ab -bc;
                System.out.println("Result is :"+df);
                break;

            case 3:
                System.out.println("Enter your first nbr");
                ab=sc.nextInt();
                System.out.println("Enter your second nbr");
                bc= sc.nextInt();
                df=ab * bc;
                System.out.println("Result is :"+df);
                break;

            case 4:
                System.out.println("Enter your first nbr");
                ab=sc.nextInt();
                System.out.println("Enter your second nbr");
                bc= sc.nextInt();
                df=ab / bc;
                System.out.println("Result is :"+df);
                break;

            case 5:
            default:
                System.out.println("QUIT");



        }



    }
}

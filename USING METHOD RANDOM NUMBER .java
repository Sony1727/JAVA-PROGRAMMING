import java.util.Random;

public class Randomnumber {


    static int findrandomnumber(int num)
    {
        Random r=new Random();
        int n= r.nextInt(num) + 1;
        return n;


    }    public static void main(String[] args) {
        System.out.println("Random Number:" +findrandomnumber(10));

    }




}

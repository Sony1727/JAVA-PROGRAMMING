import java.util.Scanner;
public class Main
{
	public static void main(String a[]){
	    int flag=0,num,i;
	    System.out.println("Enter a number :");
	      Scanner s = new Scanner(System.in);
	    num=s.nextInt();
	for( i=2;i<num;i++){
	    if(num%i==0){
	        flag=1;
	        break;
	    }
	}
	if(flag==0)
	{
	    System.out.println("IT IS PRIME NBR:");
	}
	else{
	    System.out.println("PRIME NBR :");
	}
	    
	}
}

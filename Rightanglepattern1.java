/* righ angle patern printing*/
import java.util.Scanner;
public class Rightanglepattern1{
	public static void main(String[] args) {
        System.out.println("enter the number for pattern printing ");
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    for(int i=0;i<a;i++){
	        for(int j=0;j<=i;j++)
	        {
	            System.out.print("#");
	        }
	        System.out.println();
	    }
		
	}
}
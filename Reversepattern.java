import java.util.Scanner;
public class Reversepattern{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number for pattern printing :");
	    int a=sc.nextInt();
	    for(int i=0;i<a;i++){
	        for(int j=1;j<=a-i;j++)
	        {
	            System.out.print("#");
	        }
	        System.out.println();
    }
}
}
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a number");
  int a=sc.nextInt();
   if(a%2!=0)
   {
	   for(int i=1; i<=a; i++)
	   {
		   if(i%2!=0)
		   {
			   System.out.print(i + " ");
		 
		   }
	   }}
	   else
		   for(int i=1; i<=a; i++)
		   {
			   if(i%2!=0)
			   {
				   System.out.print(i);
			   }
		   }
		
		
		
		
	   }}

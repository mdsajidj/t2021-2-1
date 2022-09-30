import java.util.Scanner;

public class SingleInteger {

	public static void main(String[] args) {
		
			   Scanner sc=new Scanner(System.in);
			   System.out.println("emter input");
			   int a=sc.nextInt();
			   for(int i=1; i<=a; i++)
			   {
				   if(i%2!=0)
				   {
					   System.out.print(i+" ");
					   a+=1;
				   }
			   }
			  }
}	

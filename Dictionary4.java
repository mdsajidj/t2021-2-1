import java.util.HashMap;

public class Dictionary4 {

	public static void main(String[] args) {
		HashMap<Integer,Integer>data=new HashMap();
		int count=0;
		int arr[]= {1,2,8,9,12,46,76,82,15,20,30};
		for(int i=1;i<=9;i++)
		{
			 count=0;
		for(int j=0; j<arr.length;j++)
			{
			if(arr[j]%i==0) {
		count++;
			
		data.put(i, count);
			}}}
		 
		System.out.println(data);
      
	}
	 

}

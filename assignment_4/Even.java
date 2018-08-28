import java.util.*;
public class Even{
		public static void main(String[] x)
		{
			int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no. of elements");
		        n= sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter all the elements");
                            
			for(int i=0;i<n;i++)
                               {
					a[i]=sc.nextInt();
                                   }
			for(int i=0;i<n;i++)
			{
				
                                 if(a[i]%2==0)
                                     System.out.println("Even number "+ a[i]);
			}
}
}

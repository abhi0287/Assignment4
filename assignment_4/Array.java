import java.util.*;
public class Array{
		public static void main(String[] x)
		{
			Scanner Sc=new Scanner(System.in);
			System.out.println("Enter the number");		
			int n=Sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter all the numbers");
			for(int i=0;i<n;i++)
			{
				a[i]=Sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(a[i]>a[j])
					{
						int Temp=a[i];
						a[i]=a[j];	
						a[j]=Temp;
					}
				}
			}
				for(int j=0;j<n;j++)
				{
					System.out.println(a[j]);
		}				}
}

			

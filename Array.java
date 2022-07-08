
import java.util.Scanner;

public class TestArray {
	public static void accept(int []a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter "+a.length+" Elements ");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
	}
	public static void display(int []a)
	{
		System.out.println(" ------------------------");
		for(int i=0;i<a.length;i++)
			System.out.print("  "+a[i]);
		System.out.println("\n ------------------------");
		
	}
	public static void bubbleSort(int[] a)
	{
		int i,j,temp;
		int size=a.length,cnt;
		for(i=0;i<size-1;i++) //passes
		{
			cnt=0;
			for(j=0;j<size-1-i;j++)//comp
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					cnt++;
				}
			}
			System.out.println(" Pass :"+(i+1)+"  "+cnt);
			display(a);
			
		}
		
	}
			
			
	public static void main(String[] args) {
		
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Size for Array ");
		size=sc.nextInt();
		int []a=new int[size];
		accept(a);
		display(a);
		bubbleSort(a);
		display(a);
		
		
		
		
				
		
		
	}

}

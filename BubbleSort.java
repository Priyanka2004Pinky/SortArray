//import java.util.*;

class BubbleSort
{
	public static void printArray(int arr[])
	{
		for(int i=0; i<=arr.length-1; i++)       // i=3, 3=<3 
		{
			System.out.print(arr[i]+ " ");  // 1 2 4
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		int arr[] = {4, 9, 2, 1};
		
		for(int i=0; i<arr.length-1; i++)   // i=2, 2<3      ----> i=3, 3<3 false
		{
			for(int j=0; j<arr.length-i-1; j++) // j=0, 0<1  -----> j=1, 1<1 false
			{
				if(arr[j] < arr[j+1])        // 2 > 1
				{
					int temp = arr[j];       // temp = 2
					arr[j] = arr[j+1];       // arr[0] = 1
					arr[j+1] = temp;         // arr[1] = 2
				}
			}
		}                               
		printArray(arr);        // -------> arr[] = 1, 2, 4, 9
	}
}

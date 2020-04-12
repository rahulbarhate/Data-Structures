
public class Quick 
{

	void sort(int[] arr, int low, int high)
	{
		if(low<high)
		{
			// index is the partitioning index
			
			int index = partition(arr, low, high);
			
			sort(arr, low, index - 1);
			sort(arr, index+1, high);
		}
	}
	
	
	int partition(int arr[], int low, int high)
	{
		// making the first element as the pivot element
		int pivot = arr[high];
		
		// index of the starting element
		int i = low - 1;
		
		for(int j = low; j< high; j++)
		{
			if(arr[j] < pivot)
			{
				i++;
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
			
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1; 
	}
	
	static void printArray(int arr[])
	{
		int n = arr.length;
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		int arr[] = {10, 9, 8, 2, 12, 15, 34};
		int n = arr.length;
		
		Quick q = new Quick();
		q.sort(arr, 0, n-1);
		
		System.out.println("Sorted Array: ");
		printArray(arr);
	}

}

import java.io.*;

class QuickSort {
    
   //static int arr[] = {-10, 7, 8, 9, 1, 5};
	
	void sort(int arr[],int l, int h)
	{
	    
	    
	    if(l < h)
	    {
	        int part = partition(arr, l, h);
	        
	        sort(arr, l, part-1);
	        sort(arr, part +1, h);
	    
	    }
	    
	}
	
	int partition(int arr[], int l, int h)
	{
	    
	int pivot = arr[h];
	
	int i = (l-1), temp = 0;
	
	for(int j = l; j < h; j++)
	     {
	      if(arr[j] <= pivot )
	      
	      {
	          i++;
	          temp = arr[i];
	          arr[i] = arr[j];
	          arr[j] = temp;
	          
	      }
	        
	    }
	    
	    temp = arr[h];
	    arr[h] = arr[i+1];
	    arr[i+1] = temp;
	    	//System.out.println("aa");
	    return (i+1);
	    
	    
	    
	}
	
	
	
	public static void main (String[] args) {
		//code
		InputStreamReader isr = new InputStreamReader(System.in);

    BufferedReader br = new BufferedReader(isr);
int arr[] = {9,8,7};
		
		int n = arr.length;
	
		

		QuickSort ob = new QuickSort();
		ob.sort(arr, 0, n-1);
		//	System.out.println(arr[0]);
	System.out.println(arr[0] +".. " + arr[1] +" .." + arr[2]  );
	}
}

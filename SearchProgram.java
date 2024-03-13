// Search Program
// Taylor Carriger
//CPT 307: Data Structures & Algorithms
// Dr. Tina Tian
// Feburary 13, 2023

public class SearchProgram{  

	public static void main(String args[]){  
		//Initialize the array
		int array[] = {5,10,15,20,25,30,35,40,45,50,55,60,65,70};  
		int searchElement = 17;  
		int last=array.length-1;  
		//Search 17 in the array
		int result=binarySearch(array,0,last,searchElement);     
		if(result==-1)
			System.out.println("17 was not found in the array");
		else
			System.out.println("17 was found in the array");
		searchElement = 45;  
		//Search 45 in the array
		result=binarySearch(array,0,last,searchElement);     
		if(result==-1)
			System.out.println("45 was not found in the array");
		else
			System.out.println("45 was found in the array");
	}

	public static int binarySearch(int array[], int first, int last, int searchElement){  
		//Get the mid element
		int mid = (first + last)/2;  
		//Loop until first index is less than or equal to last index
		while( first <= last ){  
			//Compare with search element
			if ( array[mid] < searchElement ){  
				first = mid + 1;     
			}else if ( array[mid] == searchElement ){  
				return mid;  
			}else{  
				last = mid - 1;  
			}  
			mid = (first + last)/2;  
		}  

		return -1;  
	}  
}  
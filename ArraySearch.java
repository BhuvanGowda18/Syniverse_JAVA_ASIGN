
public class ArraySearch {
	public static int search(int arr[],int n)
	{
		int s=0;
		int e=arr.length-1;
		while(s<e)
		{
			int mid=(s+e)/2;
			if(arr[mid]<n) {
				s=mid+1;
			}
			else if(arr[mid]>n){
				e=mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3, 5, 6, 9,12, 16, 19};
		int ind=search(arr,9);
		System.out.print("index "+ind);
	}
 
	}



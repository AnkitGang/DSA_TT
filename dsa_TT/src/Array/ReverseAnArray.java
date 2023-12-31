package Array;

public class ReverseAnArray {
	public static void main(String[] args) { //Two Pointer Approach
		int [] arr = {10, 20, 30, 40, 50};
		int low = 0;
		int high = arr.length-1;
		int temp = 0;
		while(low < high) {
			temp = arr[low];
			arr[low] = 	arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
		
		for(int elem : arr)
			System.out.println(elem);
	}
}

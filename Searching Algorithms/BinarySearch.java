public class BinarySearch {
	
	public static int binarySearch(int[] arr, int num) {
		int low = 0;
		int high = arr.length -1;
		int mid;
		
		while(low <= high) {
			mid = low + (high - low) / 2; 
			if(arr[mid] < num) {
				low = mid + 1;
			} else if (arr[mid] > num) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		
		return -1;
	}
	
	public static void main(String args[]) {
		
		int[] array = new int[]{-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		
		System.out.println(binarySearch(array, 16));//21
		System.out.println(binarySearch(array, -5));//0
		System.out.println(binarySearch(array, 0));//5
		System.out.println(binarySearch(array, 100));//-1
		System.out.println(binarySearch(array, 11));//16
	}
}

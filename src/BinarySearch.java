import java.util.Scanner;


public class BinarySearch { // 分治法 二分搜索技术， 类似的还有  大整数的乘法

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("数组长度：");
		int n = input.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i ++) {
			arr[i] = input.nextInt();
		}
		
		int searchNum = 11;
		int result = binarySearch(arr, searchNum, n);
		
		System.out.println(result);

	}
	
	// 在排好序的数组a[0:n-1]中找出特定元素x    O(log n)
	public static int binarySearch(int[] a, int x, int n) {
		int left = 0;
		int right = n - 1;
		while(left <= right) {
			int middle = (left + right) / 2;
			if(x == a[middle]) {
				return middle;
			}
			if(x >a[middle]) {
				left = middle + 1;
			}
			else {
				right = middle - 1;
			}
		}
		
		return -1;
	}

}

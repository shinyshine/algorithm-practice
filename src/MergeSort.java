import java.util.Arrays;
import java.util.Scanner;


public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("数组长度：");
		int n = input.nextInt();
		int[] arr = new int[n];
		int[] arr2 = new int[n];
		
		for(int i = 0; i < n; i ++) {
			arr[i] = input.nextInt();
		}
		
		mergeSort(arr, arr2, 0, n-1);
		
		System.out.println(Arrays.toString(arr2));
		
	}
	
	public static void mergeSort(int[] a, int[] b,  int left, int right) {
		if(left < right) {
			//至少有两个元素
			int i = (left + right) / 2;
			mergeSort(a, b, left, i);
			mergeSort(a, b, i + 1, right);
			
			merge(a, b, left, i, right);
			copy(a, b, left, right);
		}
	}

	private static void copy(int[] a, int[] b, int left, int right) {
		// TODO Auto-generated method stub
		int l = left, k = left;
		while(l <= right) {
			a[k++] = b[l++];
		}
	}

	private static void merge(int[] a, int[] b, int left, int m, int right) {
		// TODO Auto-generated method stub
		//合并a[left:m] 和a[m+1:right] 到 b[left:right]
		
		int i = left, j = m + 1, k = left;
		
		while((i <= m) && (j <= right)) {
			if(a[i] <= a[j]) {
				b[k++] = a[i++];
			}else {
				b[k++] = a[j++];
			}
		}
		if(i > m) {
			for(int q = j; q <= right; q ++) {
				b[k++] = a[q];
			}
		}else {
			for(int q = i; q <= m; q ++) {
				b[k++] = a[q];
			}
		}
	}
}

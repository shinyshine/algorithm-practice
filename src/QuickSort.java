import java.util.Arrays;
import java.util.Scanner;


public class QuickSort {
	//快速排序是基于分支策略的。
	//辅助空间为O(1)
	//快排的特点：原地排序，不稳定，最好情况下O(nlogn),最坏情况下O(n(2))，平均情况O(nlogn)
	//哨兵所在的位置就是它的最终位置  不用合并
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("数组长度:");
		int n = input.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i ++) {
			arr[i] = input.nextInt();
		}
		
		quickSort(arr, 0, n-1);
		
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] a, int left, int right) {
		// TODO Auto-generated method stub
		if(left < right) {
			int q = Partition(a, left, right);
			quickSort(a, left, q - 1);
			quickSort(a, q + 1, right);
			
		}
	}

	private static int Partition(int[] a, int left, int right) {
		// TODO Auto-generated method stub
		int i = left, j = right + 1;
		int x = a[left];
		
		while(true) {
			while(a[++i] < x && i < right);
			while(a[--j] > x);
			
			if(i >= j) break;
			Swap(a, i, j);
		}
		
		a[left] = a[j];
		a[j] = x;
		return j;
	}

	private static void Swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

}

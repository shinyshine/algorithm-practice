import java.util.Arrays;
import java.util.Scanner;

public class RandomizedSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("数组长度：");
		int n = input.nextInt();
		int[] arr = new int[n];
		int k = 5;
		for(int i = 0; i < n; i ++) {
			arr[i] = input.nextInt();
		}
		
		int selected = randomizedSelect(arr, 0, n - 1, k);
		System.out.println(Arrays.toString(arr));
		System.out.println("第5小的元素是---------" + selected);

	}
	
	private static int randomizedSelect(int[] a, int left, int right, int k) {
		// TODO Auto-generated method stub
		if(left == right) return a[left];
		
		int i = RandomPartition(a, left, right),
			j = i - left + 1;
		
		if(k <= j) return randomizedSelect(a, left, j, k);
		else return randomizedSelect(a, i + 1, right, k - j);
	}

	private static int RandomPartition(int[] a, int left, int right) {
		// TODO Auto-generated method stub
		int i = Random(left, right);
		Swap(a, left, i);
		return Partition(a, left, right);
	}

	private static int Random(int left, int right) {
		// TODO Auto-generated method stub
		int i = (int)(Math.random() * (right - left) + left);
		return i;
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

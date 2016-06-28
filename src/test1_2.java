import java.util.Scanner;


public class test1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int k = input.nextInt();
		
		int[] a = new int[n+1];
		
		for(int i = 1; i <= n; i ++) {
			a[i] = input.nextInt();
		}
		
		int num = select(a, 1, n, k);
		
		System.out.println(num);
		
	}

	private static int select(int[] a, int left, int right, int k) {
		// TODO Auto-generated method stub
		int q = Partition(a, left, right);
		if(q == k) return a[q];
		if(q > k) return select(a, left, q-1, k);
		else return select(a, q+1, right, k);
		
	}

	private static int Partition(int[] a, int left, int right) {
		// TODO Auto-generated method stub
		int i = left, j = right + 1;
		int x = a[left];
		
		while(true) {
			while(a[++i] < x && i < right);
			while(a[--j] > x);
			
			if(i >= j) {
				break;
			}
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

import java.util.Scanner;


public class MaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] a = new int[n];
		
		int i;
		
		for(i = 0; i < n; i ++) {
			a[i] = input.nextInt();
		}
		
		int maxsum = maxSum(a, 0, n-1);
		
		System.out.println(maxsum);

	}

	private static int maxSum(int[] a, int left, int right) {
		// TODO Auto-generated method stub
		
		if(left == right) {
			return a[left] > 0 ? a[left] : 0;
		}
		else {
			int center = (left + right) / 2;
			int leftsum = maxSum(a, left, center);
			int rightsum = maxSum(a, center+1, right);
			
			int s1 = 0;
			int lefts = 0;
			
			for(int i = center; i >= left; i --) {
				lefts += a[i];
				if(lefts > s1) {
					s1 = lefts;
				}
			}
			
			int s2 = 0;
			int rights = 0;
			
			for(int i = center + 1; i <= right; i ++) {
				rights += a[i];
				if(rights > s2) {
					s2 = rights;
				}
			}
			
			int sum = s1 + s2;
			
			if(sum < leftsum) {
				sum = leftsum;
			}
			if(sum < rightsum) {
				sum = rightsum;
			}
			
			return sum;
		}
	}

}

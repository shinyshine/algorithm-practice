import java.util.Scanner;

//设计一个O(n2)时间的算法，找出由n个数组成的序列的最长单调递增子序列。
public class LISdyna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i ++) {
			arr[i] = input.nextInt();
		}
		
		int len = LongestISdyna(arr, n);
		
		System.out.println(len);
		
		
	}
	
	public static int LongestISdyna(int[] a, int n) {
		int[] b = new int[n];
		int i, k, j, t = 0;
		b[0] = 1;
		for(i = 1; i < n; i ++) {
			//对于每个a[i],求a[0]到a[i]序列中，a[i]的最大子序列长度，保存在b[i]中。故题目答案是最大的b[i]
			for(t = 0, k = 0; k <= i - 1; k ++) {
				if(a[k] <= a[i] && t < b[k]) {
					//对于当前a[i],求a[k=0:i-1]中小于等于a[i]的对应所有b[k]中的最大值，保存在t中
					t = b[k];
				}
			}
			
			b[i] = t + 1;
		}
		
		//选出b[n]的最小值
		for(j = 0; j < n; j ++) {
			if(b[j] > t) {
				t = b[j];  //求最大的b[i]
			}
		}
		return t;
	}

}

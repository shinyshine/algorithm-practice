import java.util.Scanner;


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
			//����ÿ��a[i],��a[0]��a[i]�����У�a[i]����������г��ȣ�������b[i]�С�����Ŀ��������b[i]
			for(t = 0, k = 0; k <= i - 1; k ++) {
				if(a[k] <= a[i] && t < b[k]) {
					t = b[k];
				}
			}
			
			b[i] = t + 1;
		}
		
		//ѡ��b[n]����Сֵ
		for(j = 0; j < n; j ++) {
			if(b[j] > t) {
				t = b[j];
			}
		}
		return t;
	}

}

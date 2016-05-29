import java.util.Scanner;


public class BinarySearch { // ���η� �������������� ���ƵĻ���  �������ĳ˷�

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("���鳤�ȣ�");
		int n = input.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i ++) {
			arr[i] = input.nextInt();
		}
		
		int searchNum = 11;
		int result = binarySearch(arr, searchNum, n);
		
		System.out.println(result);

	}
	
	// ���ź��������a[0:n-1]���ҳ��ض�Ԫ��x    O(log n)
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

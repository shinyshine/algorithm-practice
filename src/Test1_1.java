import java.util.Scanner;

/*��ף����ڣ�����˺������Ϸ����Ϸ�������£�

ͬѧ��ÿ���������һ�ź����ƣ�ÿ�˵ĺ��붼����ͬ������Ұ�������������վ�ú����ĳλͬѧ���ڵ�����λ�������ĺ���һ�����ʹ�����ӵ�б��˺���������ƾͿ��Ի�����ı���Ŷ�����磺��λͬѧ���к��������ĺ���ֱ��� ��-2  -1  0   4  7��4��ͬѧ���ڵ�λ����4(�����ͬѧ��λ����1)�����ԣ�˺��4��ͬѧ�������н�Ŷ��Ϊ���ܻ�ñ��ͬѧ�ǵ��뷽�跨���ҳ�ӵ�б����ͬѧ��

���ǵ���Ϸ���ݰ��ŵú������֤ÿ����Ϸֻ��һ��ͬѧӵ�б��Ҳ����˵ÿ��ֻ��һλͬѧ���ĺ���������λ����ͬ����Ȼ����Ϸ��ʱҲ������һ�´�ң�����û����һλͬѧ�������ڵ�λ����ͬ����ʱ����Ҫ�Ͻ�������next�����Կ�ʼ��һ����Ϸ��

ʵ��֤���������������� O(logn)ʱ�����ҵ�ӵ�б����ͬѧ�����Ҫ���ұ�д�ĳ����ʱ�临�Ӷ�Ҳ��O(logn)��
*/
public class Test1_1 {
	private static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] a = new int[n+1];
		
		for(int i = 1; i <= n; i ++) {
			a[i] = input.nextInt();
		}
		
		int num = find(a, 1, n);
		
		System.out.println(num);
		System.out.println(count);
		
		
	}
	private static int find(int[] a, int left, int right) {
		// TODO Auto-generated method stub
		while(left < right) {
			//count ++;
			int mid = (left + right) / 2;
			if(a[mid] == mid) return mid;
			else if(a[mid] < mid) left = mid + 1;
			else right = mid - 1;
		}
		return -1;
	}

}

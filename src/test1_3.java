import java.util.Scanner;
/*Ϊ��ף����ڣ��ؾ������г����⻷����Թ����⻷����Ϊ��㣬�յ������⻷һȦ��ص��������š�
 * ����㿪ʼ��;�й�������n�����г�����㣬ͬѧ�ǿ�������Щվ���������г�����������֮�����һ��վ�㻹����
 * վ��i��վ��j�����Ϊr(i,j)��1<=i<j<=n�����������ǣ�Ӧ�����������⻹�ƻ�����ʹ�����С��? 
 * ע�⣬��������Ҫ��ȫ�̶����⳵ม�
 */

public class test1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[][] cost = new int[n+1][n+1];
		int[] m = new int[n+1];
		
		for(int i = 1; i <= n; i ++) {
			for(int j = i + 1; j <= n; j ++) {
				cost[i][j] = input.nextInt();
			}
		}
		m[1] = 0;
		for(int i = 1; i <= n; i ++) {
			m[i] = m[1] + cost[1][i];
			
			for(int k = 2; k <= i-1; k ++) {
				if(m[k] + cost[k][i] < m[i] ) {
					m[i] = m[k] + cost[k][i];
				}
			}
		}
		
		System.out.println(m[n]);
		
	}

}

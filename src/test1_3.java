import java.util.Scanner;
/*为庆祝青年节，特举行自行车骑外环活动。以广外外环正门为起点，终点是绕外环一圈后回到广外正门。
 * 从起点开始，途中共设置了n个自行车出租点，同学们可以在这些站点租用自行车，并可以在之后的任一个站点还车。
 * 站点i到站点j的租金为r(i,j)，1<=i<j<=n。聪明的你们，应该怎样安排租还计划才能使租金最小呢? 
 * 注意，我们这个活动要求全程都得租车喔。
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

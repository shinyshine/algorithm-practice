import java.util.Scanner;


public class LCSLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int m = input.nextInt();
		int n = input.nextInt();
		
		int[] x = new int[m+1];
		int[] y = new int[n+1];
		
		int[][] c = new int[m+1][n+1];
		int[][] b = new int[m+1][n+1];
		
		int i;
		
		for(i = 1; i <= m; i ++) {
			x[i] = input.nextInt();
		}
		
		for(i = 1; i <= n; i ++) {
			y[i] = input.nextInt();
		}
		
		int longest = lscLength(m, n, x, y, c, b);
		
		System.out.println(longest);
	}

	private static int lscLength(int m, int n, int[] x, int[] y, int[][] c,
			int[][] b) {
		// TODO Auto-generated method stub
		int i, j, l;
		for(i = 1; i <= m; i ++) {
			c[i][0] = 0;
		}
		for(i = 1; i <= n; i ++) {
			c[0][i] = 0;
		}
		
		for(i = 1; i <= m; i ++) {
			for(j = 1; j <=n; j ++) {
				if(x[i] == y[j]) {
					c[i][j] = c[i-1][j-1] + 1;
					b[i][j] = 1;
				}else if(c[i-1][j] >= c[i][j-1]) {
					c[i][j] = c[i-1][j];
					b[i][j] = 2;
				}else {
					c[i][j] = c[i][j-1];
					b[i][j] = 3;
				}
			}
		}
		
		return c[m][n];
		
	}

}

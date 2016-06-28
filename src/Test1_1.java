import java.util.Scanner;

/*庆祝青年节，进行撕名牌游戏。游戏规则如下：

同学们每人身后都贴了一张号码牌，每人的号码都不相同。若大家按号码升序排列站好后，如果某位同学所在的排列位置与他的号码一样，就代表他拥有宝物，撕了他的名牌就可以获得他的宝物哦。例如：五位同学排列后，他们身后的号码分别是 ：-2  -1  0   4  7，4号同学所在的位置是4(最左边同学的位置是1)，所以，撕掉4号同学的名牌有奖哦。为了能获得宝物，同学们得想方设法地找出拥有宝物的同学。

我们的游戏数据安排得很巧妙，保证每轮游戏只有一个同学拥有宝物，也就是说每轮只有一位同学他的号码与所在位置相同。当然，游戏有时也会娱乐一下大家，就是没有任一位同学与他所在的位置相同，这时候大家要赶紧喊出“next”，以开始下一轮游戏。

实践证明：我们最快可以在 O(logn)时间内找到拥有宝物的同学，因此要求大家编写的程序的时间复杂度也是O(logn)。
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

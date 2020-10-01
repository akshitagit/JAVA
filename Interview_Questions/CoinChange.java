import java.util.Scanner;

class CoinChange {
	
	static int minCoins(int[] coins, int m, int V) {
		int table[] = new int[V+1];
		// base case
		table[0] = 0;
		
		// initialize value:
		for(int i=1;i<V+1;i++)
			table[i] = Integer.MAX_VALUE;
		
		for(int i=1;i<=V;i++) {
			for(int j=0; j<m; j++) {
				int coin = coins[j];
				if(coin <= i)
					table[i] = (table[i-coin]+1 < table[i]) ? table[i-coin]+1 : table[i];
			}
		}
		return table[V];
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value = ");
		int V = sc.nextInt();
		
		System.out.print("Enter number of coins: ");
		int m = sc.nextInt();
		
		int[] coins = new int[m];
		System.out.println("Enter coins: ");
		for(int i=0;i<m;i++)
			coins[i] = sc.nextInt();
		
		
		int numberOfCoins = minCoins(coins, coins.length, V);
		System.out.println(numberOfCoins);
	}
}
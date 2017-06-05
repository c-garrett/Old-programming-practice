import java.util.Scanner;
class RupsaAndTheGame{

	public static long [] pow2 = new long[1000010];
	public static long [] arr = new long[1000010];

	public static int mod = Math.pow(10,7) + 7;

	public static void main(String[]args){
		Long t, n, ans, tmp, mul, c;
		pre();
		Scanner scanner = new Scanner(System.in);
		t = scanner.nextInt();
		assert(1 <= t && t <= 10);

		while(t > 0){
			t--;
			ans = 0; mul = 0; c = 0;
			n = scanner.nextInt();
			for(int i = 0; i < n + 1; i++){
				arr[i] = scanner.nextInt();
				if(i == 0){
					tmp = (2 * arr[i]) % mod;
				}else{
					tmp = (arr[i] * pow2[i]) % mod;
				}
				mul += tmp;
				if(mul >= mod){
					mul -= mod;
				}
			}

			for(int i = n + 1; i >= 1; i--){
				tmp = (arr[i] * mul) % mod;
				ans += tmp;
				if(ans >= mod){
					ans -= mod;
				}
				tmp = (arr[i-1] * pow2[i-1]) % mod;
				tmp = (tmp * pow2[c]) % mod;
				mul -= tmp;
				if(mul < 0){
					mul += mod;
				}
				mul += mul;
				if(mul >= mod){
					mul -= mod;
				}
				c++;
			}

			System.out.println(ans);

		}


	}


	public static void pre(){
		pow2[0] = 1;
		for(int i = 1; i < 1000010; i++){
			pow2[i] = pow2[i-1] * 2;
			if(pow2[i] >= mod){
				pow2[i] -= mod;
			}
		}
	}

}
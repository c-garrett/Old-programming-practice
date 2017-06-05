import java.util.Scanner;
class CoinsAndTriangle{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		int gold_coins;
		for(int i = 0; i < cases; i++){
			gold_coins = scanner.nextInt();
			int max_level = 0;
			int counter_requirement = 1;
			int counter_temp = 0;
			int flag = 1;
			while(flag == 1){
				max_level += 1;
				counter_temp += counter_requirement;
				counter_requirement += 1;
				if(counter_temp > gold_coins){
					max_level -= 1;
					break;
				}
			}
			System.out.println(max_level);
		}
	}
}
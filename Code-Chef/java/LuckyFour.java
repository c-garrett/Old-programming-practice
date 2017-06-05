import java.util.Scanner;
class LuckyFour{
	public static void main(String[]args){
		int count;
		Scanner scanner = new Scanner(System.in);
		count = scanner.nextInt();
		int n;
		int remainder;
		int result;
		while(count > 0){
			n = scanner.nextInt();
			result = 0;
			while(n > 0){
				remainder = n % 10;
				if(remainder == 4){
					result += 1;
				}
				n /= 10;
			}
			System.out.println(result);
			count--;
		}
	}
}
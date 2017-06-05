import java.util.Scanner;
class Prob{
	public static void main(String[]args){
		int cases;
		Scanner scanner = new Scanner(System.in);
		cases = scanner.nextInt();
		int t1, t2, t3, t4;

		while(cases > 0){
			cases--;
			t1 = scanner.nextInt();
			t2 = scanner.nextInt();
			t3 = scanner.nextInt();
			t4 = scanner.nextInt();
			System.out.println((double)t1/(t1+t2));
		}

	}
}
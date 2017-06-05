import java.util.Scanner;
class ChefAndRemissness{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		int a, b;
		for(int i = 0; i < cases; i++){
			a = scanner.nextInt();
			b = scanner.nextInt();
			System.out.println(Math.max(a,b) + " " + (a+b));
		}
	}
}
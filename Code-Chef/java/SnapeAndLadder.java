import java.util.Scanner;
class SnapeAndLadder{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		int b, ls;
		for(int i = 0; i < cases; i++){
			b = scanner.nextInt();
			ls = scanner.nextInt();
			System.out.print(Math.sqrt(ls*ls - b*b) + " ");
			System.out.println(Math.sqrt(ls*ls + b*b));
		}
	}
}
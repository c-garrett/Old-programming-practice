import java.util.Scanner;
class FindingSquareRoots{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		int number;
		for(int i = 0; i < cases; i++){
			number = scanner.nextInt();
			System.out.println((int)Math.sqrt(number));
		}
	}
}
import java.util.Scanner;
class FindRemainder{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		int temp1, temp2;
		for(int i = 0; i < cases; i++){
			temp1 = scanner.nextInt();
			temp2 = scanner.nextInt();
			System.out.println(temp1 % temp2);
		}
	}
}
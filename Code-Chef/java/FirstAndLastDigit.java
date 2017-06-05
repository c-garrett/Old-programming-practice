import java.util.Scanner;
class FirstAndLastDigit{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		int number, first, last;
		for(int i = 0; i < cases; i++){
			number = scanner.nextInt();
			last = number % 10;
			number /= 10;
			int temp = 0;
			while(number > 0){
				temp = number % 10;
				number /= 10;
			}
			first = temp;
			System.out.println(first + last);
		}
	}
}
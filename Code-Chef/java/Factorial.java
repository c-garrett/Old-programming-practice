import java.util.Scanner;
class Factorial{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		for(int i = 0; i < cases; i++){
			Z(scanner.nextInt());
		}
	}
	public static void Z(int n){
		
		int multiple = 5;
		int temp = 0;
		int zeros = 0;
		int counter = 1;

		while(1 == 1){
			temp = n / multiple;
			zeros += temp;
			counter += 1;
			multiple = (int)Math.pow(5,counter);
			if(multiple > n){
				break;
			}
		}	

		System.out.println(zeros);

	}
}
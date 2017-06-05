import java.util.Scanner;
class Servant{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		int number;
		for(int i = 0; i < cases; i++){
			number = scanner.nextInt();
			if(number < 10){
				System.out.println("What an obedient servant you are!");
			}else{
				System.out.println(-1);
			}
		}
	}
}
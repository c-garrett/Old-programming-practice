import java.util.Scanner;
class GoodJoke{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int cases, points;
		cases = scanner.nextInt();
		int output = 0;
		int garbage;
		while(cases > 0){
			cases--;
			points = scanner.nextInt();
			for(int i = 0; i < points; i++){
				if(i == 0){
					output = 1;
					garbage = scanner.nextInt();
					garbage = scanner.nextInt();
				}else{
					output ^= i+1;
					garbage = scanner.nextInt();
					garbage = scanner.nextInt();
				}
			}
			System.out.println(output);
		}
	}
}
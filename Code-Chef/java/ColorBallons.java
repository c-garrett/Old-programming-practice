import java.util.Scanner;
class ColorBallons{
	public static void main(String[]args){

		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		String input;
		int a_counter, b_counter;

		for(int i = 0; i < cases; i++){
			a_counter = b_counter = 0;
			input = scanner.next();
			for(int j = 0; j < input.length(); j++){
				if(input.charAt(j) == 'a'){
					a_counter++;
				}else{
					b_counter++;
				}
			}
			if(a_counter < b_counter){
				System.out.println(a_counter);
			}else{
				System.out.println(b_counter);
			}
		}

	}
}
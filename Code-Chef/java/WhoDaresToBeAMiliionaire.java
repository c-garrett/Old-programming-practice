import java.util.Scanner;
class WhoDaresToBeAMillionaire{
	public static void main(String[]args){
		
		Scanner scanner = new Scanner(System.in);
		cases = scanner.nextInt();

		int number_questions = 0;
		String answers;
		String chef_answers;
		int [] winnings;
		int winnings_zero = 0;
		int [] binary;
		int correct_answers = 0;
		int maximum_winnings = 0;

		for(int i = 0; i < cases; i++){

			number_questions = scanner.nextInt();
			answers = scanner.next();
			chef_answers = scanner.next();

			correct_answers = 0;

			winnings = new int[number_questions];

			winning_zero = scanner.nextInt();

			for(int j = 0; j < number_questions; j++){
				winnings[j] = scanner.nextInt();
			}
			
			binary = new int[number_questions];

			for(int j = 0; j < number_questions; j++){
				if(answers.charAt(j) == chef_answers.charAt(j)){
					binary[j] = 1;
					correct_answers += 1;
				}else{
					binary[j] = 0;
				}
			}

			maximum_winnings = winning_zero;

			for(int j = 0; j < correct_answers; j++){
				if(winnings[j] > maximum_winnings){
					maximum_winnings = winnings[j];
				}
			}

			System.out.println(maximum_winnings);

		}

	}
}
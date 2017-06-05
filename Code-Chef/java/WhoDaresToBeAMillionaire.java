import java.util.Scanner;
class WhoDaresToBeAMillionaire{
	public static void main(String[]args){
		int cases;
		Scanner scanner = new Scanner(System.in);
		cases = scanner.nextInt();

		int number_questions = 0;
		String answers;
		String chef_answers;
		int [] winnings;
		int winning_zero = 0;
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
			
			for(int j = 0; j < number_questions; j++){
				if(answers.charAt(j) == chef_answers.charAt(j)){
					correct_answers += 1;
				}
			}

			maximum_winnings = winning_zero;

			if(correct_answers == number_questions){
				maximum_winnings = winnings[number_questions-1];
			}else{
				for(int j = 0; j < correct_answers; j++){
					if(winnings[j] > maximum_winnings){
						maximum_winnings = winnings[j];
					}
				}
			}
			System.out.println(maximum_winnings);
		}

	}
}
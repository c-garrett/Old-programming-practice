import java.util.Scanner;
class TheLeadGame{
	public static void main(String[]args){

		Scanner scanner = new Scanner(System.in);
		int rounds = scanner.nextInt();
		int max_difference = 0;
		int current_winner = 0;
		int temp_difference = 0;

		int [] player1 = new int[rounds];
		int [] player2 = new int[rounds];
		int [] differences = new int[rounds];

		for(int i = 0; i < rounds; i++){
			player1[i] = scanner.nextInt();
			player2[i] = scanner.nextInt();
			differences[i] = Math.abs(player1[i] - player2[i]);
		}

		for(int i = 0; i < rounds; i++){
			if(differences[i] > max_difference){
				max_difference = differences[i];
				if(player1[i] > player2[i]){
					current_winner = 1;
				}else{
					current_winner = 2;
				}
			}
		}

		System.out.println(current_winner + " " + max_difference);
	}
}
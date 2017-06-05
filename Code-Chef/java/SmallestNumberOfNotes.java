import java.util.Scanner;
class SmallestNumberOfNotes{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		int [] notes = {100,50,10,5,2,1};
		int n = 0;
		int min_notes = 0;
		for(int i = 0; i < cases; i++){
			n = scanner.nextInt();
			min_notes = 0;
			for(int j = 0; j < notes.length; j++){
				if(n - notes[j] >= 0){
					n -= notes[j];
					j = j - 1;
					min_notes += 1;
				}
				if(n == 0){
					break;
				}
			}
			System.out.println(min_notes);
		}
	}
}
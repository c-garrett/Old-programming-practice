import java.util.Scanner;
import java.util.Arrays;

class UncleJohny{
	public static void main(String[]args){
		int cases;
		Scanner scanner = new Scanner(System.in);
		cases = scanner.nextInt();
		int n;
		int [] songs;
		int k;
		int uncleJohny;
		while(cases > 0){
			cases--;
			n = scanner.nextInt();
			songs = new int[n];
			for(int i = 0; i < n; i++){
				songs[i] = scanner.nextInt();
			}
			k = scanner.nextInt();
			k -= 1;
			int pos = 0;
			for(int i = 0; i < n; i++){
				if(songs[i] < songs[k]){
					pos += 1;
				}
			}
			System.out.println(pos+1);
		}
	}
}
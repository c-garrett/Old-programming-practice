import java.util.Scanner;
class ChefAndHisSequence{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		int length_n, length_f;
		int [] n;
		int [] f;
		int flag = 0;
		for(int i = 0; i < cases; i++){

			length_n = scanner.nextInt();
			n = new int[length_n];
			for(int j = 0; j < length_n; j++){
				n[j] = scanner.nextInt();
			}
			length_f = scanner.nextInt();
			f = new int[length_f];
			for(int j = 0; j < length_f; j++){
				f[j] = scanner.nextInt();
			}


		
			int temp;
			int j1 = 0;
			int counter = 0;

			for(int j = 0; j < length_f;){
				while(j1 < length_n){
					if(f[j] == n[j1]){
						counter += 1;
						j1 += 1;
						break;
					}
					j1 += 1;
				}
				j += 1;
			}

			if(counter == length_f){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		

		}
		
	}
}
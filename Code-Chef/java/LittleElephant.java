import java.util.Scanner;
class LittleElephant{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		int size;
		int [] input;
		for(int i = 0; i < cases; i++){
			size = scanner.nextInt();
			// obtain inversions i < j and a[i] > a[j]
			input = new int [size];
			for(int j = 0; j < size; j++){
				input[j] = scanner.nextInt();
			}
			// obtain inversions
			int temp_number = 0;
			int inversion_count = 0;
			int inversion_total = 0;

			for(int j = 0; j < size; j++){
				temp_number = input[j];
				inversion_count = 0;
				for(int j1 = j + 1; j1 < size; j1++){
					if(temp_number > input[j1]){
						inversion_count += 1;
					}
				}
				inversion_total += inversion_count;
			}

			int local_inversion_total = 0;
			for(int j = 0; j < size - 1; j++){
				if(input[j] > input[j+1]){
					local_inversion_total += 1;
				}
			}

			if(local_inversion_total == inversion_total){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

		}		
	}
}
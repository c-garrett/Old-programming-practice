import java.util.Scanner;
class VersionControlSystem{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		int n, m, k;

		int [] ignored;
		int [] tracked;
		int [] total;

		int in_sequence, not_sequence;
		int flag;

		for(int i = 0; i < cases; i++){

			n = scanner.nextInt();
			m = scanner.nextInt();
			k = scanner.nextInt();

			total = new int[n];
			ignored = new int[m];
			tracked = new int[k];

			in_sequence = not_sequence = 0;

			for(int j = 0; j < m; j++){
				ignored[j] = scanner.nextInt();
				total[j] = ignored[j];
			}

			int counter = 0;
			int temp_flag = 0;
			for(int j = 0; j < k; j++){
				tracked[j] = scanner.nextInt();
				temp_flag = 0;
				for(int j1 = 0; j1 < n; j1++){
					if(total[j1] == tracked[j]){
						temp_flag = 1;
						break;
					}
				}
				if(temp_flag == 0){
					total[m+counter++] = tracked[j];
				}
			}
			if(m > k){
				int temp_number;
				for(int j = 0; j < m; j++){
					temp_number = ignored[j];
					for(int j1 = 0; j1 < k; j1++){
						if(tracked[j1] == temp_number){
							in_sequence++;
							break;
						}
					}
				}
			}else{
				int temp_number;
				for(int j = 0; j < k; j++){
					temp_number = tracked[j];
					for(int j1 = 0; j1 < m; j1++){
						if(ignored[j1] == temp_number){
							in_sequence++;
							break;
						}
					}
				}
			}
			int temp_check = 0;
			for(int j = 0; j < n; j++){
				int temp_number_check = total[j];
				temp_check = 0;
				for(int j1 = 0; j1 < m; j1++){
					if(ignored[j1] == temp_number_check){
						temp_check = 1;
						break;
					}
				}
				if(temp_check == 1){
					continue;
				}
				for(int j1 = 0; j1 < k; j1++){
					if(tracked[j1] == temp_number_check){
						temp_check = 1;
						break;
					}
				}
				if(temp_check == 0){
					not_sequence++;
				}
			}

			System.out.println(in_sequence + " " + not_sequence);

		}	
	}
}
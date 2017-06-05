import java.util.Scanner;
class ChefAndWay{

	public static int mod = 1000000007;

	public static void main(String[]args){

		Scanner scanner = new Scanner(System.in);

		int n, k;
		n = scanner.nextInt();
		k = scanner.nextInt();

		int final_street = 0;
		int[] streets = new int[n];

		for(int i = 0; i < n; i++){
			streets[i] = scanner.nextInt();
			if(i == n-1){
				final_street = streets[i];
			}
		}

		int temp;
		for(int n1 = 0; n1 < streets.length; n1++){
			for(int i = 0; i < streets.length-1; i++){
				if(streets[i] > streets[i+1]){
					temp = streets[i];
					streets[i] = streets[i+1];
					streets[i+1] = temp;
				}
			}
		}

		int start, total;
		start = streets[0];
		total = start;

		int break_flag = 1;
		int current_street = 0;
		int true_variable = 1;

		while(true_variable == 1){
			for(int i = 1; i < n; i++){

				current_street = streets[i];

				if(current_street - start > 0 && current_street - start <= k){
					if(final_street - start <= k){
						total = total * final_street;
						break;
					}else{
						total = current_street * start;
						start = current_street;
					}
				}

			}

			if(break_flag == 1){
				break;
			}
		}

		System.out.println(total % mod);
	}

}
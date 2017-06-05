import java.util.Scanner;
class CountSubarrays{
	public static void main(String[]args){
		int cases;
		Scanner scanner = new Scanner(System.in);
		cases = scanner.nextInt();

		int size = 0;
		int [] arr;
		int counter = 0;

		for(int i = 0; i < cases; i++){

			size = scanner.nextInt();
			arr = new int[size];
			counter = size;

			for(int j = 0; j < size; j++){
				arr[j] = scanner.nextInt();
			}

			int pos = 0;

			for(int j = 1; j < size; j++){
				if(arr[j] >= arr[j-1]){
					counter += j - pos;
				}else{
					pos = j;
				}
			}


			System.out.println(counter);

		}

	}
}
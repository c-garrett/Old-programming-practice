import java.util.Scanner;
class ATM{
	public static void main(String[]args){

		Scanner scanner = new Scanner(System.in);
		double transaction, balance;
		transaction = scanner.nextDouble();
		balance = scanner.nextDouble();

		if(transaction % 5 != 0){
			System.out.printf("%.2f\n",balance);
		}else if(balance - transaction - .50 >= 0){
			System.out.printf("%.2f\n",balance-transaction-.50);
		}else{
			System.out.printf("%.2f\n",balance);
		}

	}
}
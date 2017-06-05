import java.util.Scanner;
class CielAndReceipt{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		int p;
		int [] menu = new int [12];
		for(int i = 0; i < 12; i++){
			menu[i] = (int)Math.pow(2,i);
		}

		for(int i = 0; i < menu.length / 2; i++){
			int temp = menu[i];
			menu[i] = menu[menu.length-i-1];
			menu[menu.length-i-1] = temp;
		}

		int min_menu = 0;

		for(int i = 0; i < cases; i++){
			min_menu = 0;
			p = scanner.nextInt();
			for(int j = 0; j < menu.length; j++){
				if(p - menu[j] >= 0){
					min_menu += 1;
					p = p - menu[j];
					j = j - 1;
				}
				if(p == 0){
					break;
				}
			}
			System.out.println(min_menu);
		}
	}
}
#include <iostream>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <algorithm>
#include <math.h>

using namespace std;

int main(){

	int t;
	cin >> t;
	int r, c;
	char* matrix;
	char check[4] = {'p','o','o','n'};
	int flag, flag1;

	while(t--){

		flag = 0;
		flag1 = 0;
		cin >> r >> c;
		matrix = new char[r*c];

		for(int i = 0; i < r*c; i++){
			cin >> matrix[i];
		}

		for(int i = 0; i < r*c; i++){
			if(tolower(matrix[i]) == 's'){
				int counter = 0;
				for(int j = i + 1; j < r*c; j++){
					if(tolower(matrix[j]) == check[counter]){
						counter++;
						if(counter == 4){
							break;
						}
					}else{
						break;
					}
				}
				if(counter == 4){
					flag = 1;
				}
			}
			if(flag == 1){
				break;
			}
		}

		if(r > 4){
			int counter1 = 0;
			while(true){
				for(int i = counter1; i < r*c; i+=c){
					if(tolower(matrix[i]) == 's'){
						int counter2 = 0;
						for(int j=i+c; j < r * c; j += c ){
							if(tolower(matrix[j]) == check[counter2]){
								counter2++;
								if(counter2 == 4){
									break;
								}
							}else{
								break;
							}
						}
						if(counter2 == 4){
							flag1 = 1;
						}
					}
					if(flag1 == 1){
						break;
					}
				}
				if(flag1 == 1){
					break;
				}
				counter1 += 1;
				if(counter1 == c){
					break;
				}
			}
		}


		if(flag == 1 || flag1 == 1){
			cout << "There is a spoon!" << endl;
		}else{
			cout << "There is indeed no spoon!" << endl;
		}

	}
	return 0;
}
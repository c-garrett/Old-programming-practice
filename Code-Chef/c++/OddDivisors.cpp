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

	int i, r;
	int  total;

	while(t--){
		cin >> i >> r;
		total = 0;
		for(int j = i; j <= r; j++){
			for(int j1 = 1; j1 <= j; j1++){
				if(j1 % 2 != 0){
					if(j % j1 == 0){
						total += j1;
					}
				}
			}
		}
		cout << total << endl;
	}

	return 0;
}
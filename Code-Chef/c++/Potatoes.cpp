#include <iostream>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <algorithm>
#include <math.h>

using namespace std;

bool check_prime(int n);

int main(){
	int t;
	cin >> t;
	int x, y;
	int total;

	while(t--){
		cin >> x;
		cin >> y;
		total = x + y;
		int i = 1;
		while(!check_prime(total + i)){
			i += 1;
		}

		cout << i << endl;
		
	}
}

bool check_prime(int n){
	if(n<=1){
		return false;
	}else if(n <= 3){
		return true;
	}else if(n%2==0 || n%3==0){
		return false;
	}
	int i = 5;
	while(i*i <= n){
		if(n % i == 0 || n % (i+2) == 0){
			return false;
		}
		i = i + 6;
	}
	return true;
}














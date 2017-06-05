#include <iostream>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <algorithm>
#include <math.h>

using namespace std;

// return the total distance that is traversed
int distance(int n){
	if(n == 0){
		return 0;
	}else if(n == 1){
		return 2;
	}else{
		return (((2 * n) + 1) + distance(n-2));
	}
}

int main(){

	long long int t, n;
	cin >> t;
	while(t--){
		cin >> n;
		cout << (n*(n+3))/2 << "\n";
	}
	return 0;
}
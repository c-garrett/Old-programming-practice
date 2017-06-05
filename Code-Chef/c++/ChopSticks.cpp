#include <iostream>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <algorithm>
#include <math.h>

using namespace std;

int main(){

	int n, d;
	cin >> n >> d;

	int n1 = n;
	int chopSticks[n];
	int pairs = 0;
	int i = 0;

	while(n1--){
		cin >> chopSticks[i];
		i += 1;
	}

	sort(chopSticks,chopSticks + n);

	for(i = 0; i < n; ){
		if( abs(chopSticks[i] - chopSticks[i+1]) <= d ){
			pairs += 1;
			i += 2;
		}else{
			i += 1;
		}
	}

	cout << pairs << endl;

	return 0;
}
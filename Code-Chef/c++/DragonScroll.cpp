#include <iostream>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <algorithm>

using namespace std;

int ones(int x);

int main(){
	int t;
	cin >> t;
	int n, a, b;
	int* number1;
	int* number2;
	int ones1, ones2;
	int zeros1, zeros2;
	int maximum_value;

	// 0101
	// 0100
	// x = 2
	// y = 1

	while(t--){
		cin >> n;
		cin >> a;
		cin >> b;
		ones1 = ones2 = 0;
		ones1 = ones(a);
		ones2 = ones(b);
		zeros1 = n - ones1;
		zeros2 = n - ones2;
		int x = min(ones1,zeros2);
		int y = min(ones2,zeros1);
		int p = x + y;
		int answer = (((1<<p) - 1) << (n-p));
		cout << answer << endl;
	}
}

int ones(int x)
{
	if(x==0) return 0;
	return 1 + ones(x&(x-1));
}
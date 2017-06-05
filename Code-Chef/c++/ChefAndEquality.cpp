#include <iostream>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <algorithm>
#include <math.h>

using namespace std;

const int maxn = (int) 1e5 + 5;
int cnt[maxn];

int max_number(int a, int b){
	if(a > b){
		return a;
	}else{
		return b;
	}
}

int main(){


	int t;
	cin >> t;
	int n;

	while(t--){

		cin >> n;
		
		memset(cnt, 0, sizeof(cnt));

		// create a histogram of the values
		for(int i = 0; i < n; i++){
			int x;
			cin >> x;
			cnt[x]++;
		}

		int answer = 0;
		// obtain the max value within the histogram
		for(int x = 1; x <= (int)1e5; x++){
			answer = max_number(answer,cnt[x]);
		}

		// report the max of the histogram minus the total of
		// numbers
		cout << n - answer << endl;

	}
	return 0;
}
#include <iostream>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <algorithm>

using namespace std;

void generate_primes();

int main(){
	int t;
	cin >> t;
	int x, y;
	int total;
	int min_harvest;
	int* primes;
	primes = generate_primes();
	for(int i = 0; i < 100; i++){
		cout << primes[i] << endl;
	}
	while(t--){
		cin >> x;
		cin >> y;
		total = x + y + 1;
		min_harvest = 1;
	}
}

void generate_primes(){
	int arr[3000];
	for(int i = 0; i < arr.length(); i++){
		arr[i] = i + 2;
	}
	int multiple;
	int primes = arr.length();
	for(int i = 0; i < arr.length(); i++){
		if(arr[i] == 0){
			continue;
		}
		multiple = arr[i];
		for(int j = i+1; j < arr.length(); j++){
			if(arr[j] % multiple == 0){
				arr[j] = 0;
				primes -= 1;
			}
		}
	}
	int arr1[primes];
	int counter = 0;
	for(int i = 0; i < arr.length(); i++){
		if(arr[i] != 0){
			arr1[counter++] = arr[i];
		}
	}
	return arr1;
}












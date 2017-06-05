#include <iostream>
using namespace std;

int main(){
	int t;
	cin >> t;
	int n;
	int* songs;
	int k;
	int uncle;
	while(t > 0){
		t--;
		cin >> n;
		songs = new int[n];
		for(int i = 0; i < n; i++){
			cin >> songs[i];
		}
		cin >> k;
		k -= 1;
		int pos = 0;
		for(int i = 0; i < n; i++){
			if(songs[i] < songs[k]){
				pos += 1;
			}
		}
		cout << pos+1 << endl;
	}
	return 0;
}
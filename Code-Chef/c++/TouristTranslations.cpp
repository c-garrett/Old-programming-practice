#include <iostream>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <ctype.h>

using namespace std;

int main(){
	int t;
	cin >> t;

	string alphabet = "abcdefghijklmnopqrstuvwxyz";

	string translation;
	cin >> translation;

	string s;
	string output;

	while(t--){
		cin >> s;
		output = "";
		for(int j = 0; j < s.length(); j++){
			if(s[j] == '_'){
				output += " ";
				continue;
			}
			if(isalpha(s[j]) == 0){
				output += s[j];
				continue;
			}
			for(int i = 0; i < alphabet.length(); i++){
				if(tolower(s[j]) == alphabet[i]){
					if(s[j] >= 'a' && s[j] <= 'z'){
						output += translation[i];
					}else{
						char n = toupper(translation[i]);
						output += n;
					}
				}
			}
		}
		cout << output << endl;
	}
	return 0;
}
// Hackathon.cpp : Defines the entry point for the console application.
//
#include <cstdio>
#include <cstring>
#include <iostream>
#include <cctype>
#include <string>
#include <sstream>

using namespace std;

int main() {

	int moves = 0;
	int t = 0;
	int g = 0;
	int p = 0;
	string strt;
	string strg;
	string strp;
	getline(cin, strt);
	t = stoi(strt, nullptr, 10);

	for (int k = 0; k < t; k++) { //loop for test cases
		getline(cin, strg);
		g = stoi(strg, nullptr, 10);

		string strstones;
		int totalMoves = 0;
		
        for (int k = 0; k < g; k++) { //loop for game cases
			
			//get piles of stones
			getline(cin, strp);
			p = stoi(strp, nullptr, 10);
			
			//read in first set of stones
			getline(cin, strstones);
			stringstream stream(strstones);

				for (int i = 0; i < p; i++) {
					int n;
					stream >> n;
					if (!stream)
						break;
					totalMoves = totalMoves + (n / 2);
				}
		}

		//mod to find even or odd
		if (totalMoves % 2 == 0) { //even and player is even
			cout << "Bob" << endl;
        }
		else {
			cout << "Alice" << endl;
		}

    }
	return 0;


}
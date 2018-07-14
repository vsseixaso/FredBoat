#include <bits/stdc++.h>

using namespace std;

typedef long long ll;
typedef vector<int> vi;
typedef vector<vi> vvi;

#define N 100000

int p[][];

void preprocess() {
	for(int i = 1; i <= N; i++)
		for(int j = 0; (i<<j) < N; j++)
			p[i][j] = -1;
}

int main() {


	return 0;
}
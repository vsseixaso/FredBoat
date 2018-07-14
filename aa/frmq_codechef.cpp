#include <bits/stdc++.h>

using namespace std;

const int k = 16;
const int N = 1e5;

int table[k + 1][N];
int logs[N];
int powers[20];

int main() {
	int n, L, R, q, lg;

	for(int i = 1; i < N; i++) logs[i] = log2(i);
	for(int i = 0; i < 20; i++) powers[i] = 1 << i;
	
	scanf("%d", &n);
	for(int i = 0; i < n; i++)
		scanf("%d", &table[0][i]);

	for(int i = 1; powers[i] <= n; i++)
		for(int j = 0; j + powers[i] <= n; j++)
			table [i][j] = max(table[i - 1][j], table[i - 1][j + powers[i - 1]]);

    long long answer = 0;
    scanf("%d%d%d", &q, &L, &R);
    for(int i = 0; i < q; i++) {
    	if (L <= R) {
    		lg = logs[R - L + 1];
    		answer += max(table[lg][L], table[lg][R - powers[lg] + 1]);
    	} else {
    		lg = logs[L - R + 1];
    		answer += max(table[lg][R], table[lg][L - powers[lg] + 1]);
    	}
    
    	L += 7; while(L >= (n-1)) L-=(n-1);
        R += 11; while(R >= n) R-=n;
    }

    printf("%lld\n", answer);

	return 0;
}
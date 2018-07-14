#include <bits/stdc++.h>

using namespace std;

const int k = 16;
const int N = 1e5;
 
int table[N][k + 1];
int arr[N];
 
int main() {
    int n, L, R, q;
 
    scanf("%d", &n);
    for(int i = 0; i < n; i++)
        scanf("%d", &arr[i]);
 
    for(int i = 0; i < n; i++)
        table[0][i] = arr[i];
    for(int j = 1; j <= k; j++) {
        for(int i = 0; i <= n - (1 << j); i++)
            table[j][i] = max(table[j][i - 1], table[j + (1 << (i - 1))][i - 1]);
    }
 
    long long ans = 0;
    scanf("%d%d%d", &q, &L, &R);
    for(int i = 0; i < q; i++) {
        int auxL = L; int auxR = R;
        int max_value = 0;
        for(int j = k; j >= 0; j--) {
            if (auxL > auxR) swap(auxL, auxR);
            if(auxL + (1 << j) - 1 <= auxR) {
                max_value = max(max_value, table[j][auxL]);
                auxL += 1 << j;
            }
        }
        ans += max_value;
 
        L += 7;
        while(L >= (n-1)) L-=(n-1);
        R += 11;
        while(R >= n) R-=n;
    }
 
    cout << ans;
 
    return 0;
}

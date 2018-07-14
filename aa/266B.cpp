#include <bits/stdc++.h>

using namespace std;

int main() {
	int n, t = 0;
	string aux = "";

	scanf("%d %d", &n, &t);
	scanf("%s", &aux);

	char queue[aux.size()+1];
	strcpy(queue, aux.c_str());

	for (int i=0; i<t; i++) {
		for (int j=0; j<n-1; j++) {
			if (queue[j] == 'B' && queue[j+1] == 'G') {
				swap(queue[j], queue[j+1]);
			}
		}
	}

	string out = "";
	for (int i=0; i<n-1; i++) {
		out += queue[i] + " ";
	}
	out += queue[n-1];

	printf("%s\n", out);

	return 0;
}
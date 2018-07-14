#include <bits/stdc++.h>

using namespace std;

typedef pair<int, int> ii;
typedef vector<ii> vii;
typedef vector<int> vi;
typedef vector<vi> vvi;

int counter = 0;

void dfs(int x, vi graph[1001], bool visited[]) {
	visited[x] = true;
	counter++;
	for (int i=0; i<graph[x].size(); i++) {
		if(!visited[i]) {
			dfs(i, graph, visited);
		}
	}
}

int main() {
	int n, m, a, b, e;
	while (scanf("%d %d", &n, &m) != EOF) {
		bool visited[n];
		vector<ii> link;
		vi graph[1001];

		for (int i=0; i<m; i++) {
			scanf("%d %d", &a, &b);
			graph[a].push_back(b);
			graph[b].push_back(a);
		}

		scanf("%d", &e);

		if (graph[e].size() != 0) {
			dfs(e, graph, visited);
		}

		printf("%d\n", counter+1);

		counter = 0;
	}

	return 0;
}
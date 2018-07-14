#include <bits/stdc++.h>

using namespace std;

typedef vector<int> vi;
typedef vector<vi> vvi;

vvi graph;
vi visited;
int counter = 0;

void dfs(int n) {
	visited[n] = 1;
	counter++;
	for (int i=0; i<graph[n].size(); i++) {
		if (visited[graph[n][i]] == 0) {
			dfs(graph[n][i]);
		}
	}	
	visited[n] = 2;
}

int main ()
{
	int n, m, a, b, e;
	
	while (scanf("%d %d", &n, &m) != EOF) {
		graph.assign(n, vi ());
		visited.assign(n, 0);
		
		for (int i=0; i<m; i++) {
			cin >> a >> b;
			graph[a-1].push_back(b-1);
			graph[b-1].push_back(a-1);
		}

		counter = 0;
		
		scanf("%d", &e);

		if (graph[e-1].size() != 0) {
			dfs(e-1);
			printf("%d\n", counter);
		} else {
			printf("%d\n", 1);
		}	

		visited.clear();
		graph.clear();
	}
}
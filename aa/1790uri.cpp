#include <bits/stdc++.h>

using namespace std;

typedef pair<int, int> pii;

int current_cities = 0;

void dfs(int x, int graph[][51], int cities, bool visited[]) {
	visited[x] = true;
	current_cities++;
	for(int i = 0; i < cities; i++) {
		if(graph[x][i] == 1 && !visited[i]) {
			dfs(i, graph, cities, visited);
		}
	}
}

void clean(bool visited[], int cities) {
	for(int j = 0; j < cities; j++) {
		visited[j] = false;
	}
}

int main() {
	int cities, bridges_amount, first_city, second_city;
	while(scanf(" %d%d", &cities, &bridges_amount) != EOF) {
		bool visited[cities];
		vector<pii> bridges;
		int graph[51][51];

		clean(visited, cities);

		for(int i = 0; i < 51; i++) {
			for(int j = 0; j < 51; j++) {
				graph[i][j] = 0;
			}
		}   
		int i = 0;
		while(i < bridges_amount) {
			scanf(" %d%d", &first_city, &second_city);
			pii a(first_city, second_city);
			bridges.push_back(a);
			graph[first_city-1][second_city-1] = 1;
			graph[second_city-1][first_city-1] = 1;
			i++;
		}

		int marked_cities = 0;
		int searched_bridges = 0;
		for(int i = 0; i < bridges_amount; i++) {
			graph[bridges[i].first-1][bridges[i].second-1] = 0;
			graph[bridges[i].second-1][bridges[i].first-1] = 0;

			dfs(0, graph, cities, visited);
			marked_cities = current_cities;
			current_cities = 0;
			if(marked_cities < cities) {
				searched_bridges++;
			}

			clean(visited, cities);

			graph[bridges[i].first-1][bridges[i].second-1] = 1;
			graph[bridges[i].second-1][bridges[i].first-1] = 1;
		}

		printf("%d\n", searched_bridges);
	}

	return 0;
}
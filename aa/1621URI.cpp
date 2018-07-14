#include <bits/stdc++.h>

#define INF 9999999

using namespace std;

typedef pair<int, int> ii;
typedef vector<ii> vii;
typedef vector<int> vi;
typedef vector<vi> vvi;
typedef vector<string> vs;

bool is_leaf(vector<vector<char>> &v, int i, int j) {
	int count = 0;
	if (i > 0 && v[i-1][j] == '.') count++;
	if (i < v.size()-1 && v[i+1][j] == '.') count++;
	if (j > 0 && v[i][j-1] == '.') count++;
	if (j < v[0].size()-1 && v[i][j+1] == '.') count++;

	return count <= 1;
}

pair<int,ii> bfs(vector<vector<char>> &v, int i, int j) {
	list<char> q;
	list<ii> lii;
	q.push_back(v[i][j]);
	lii.push_back(ii(i,j));
	
	vi aux;
	aux.assign(501, 0);
	vector<vi> dist;
	dist.assign(501, aux);
	vii cel;

	vi aux2;
	aux2.assign(501, 0);
	vector<vi> vis;
	vis.assign(501, aux2);
	vis[i][j] = 1;

	while (!q.empty()) {
		char s = q.front();
		ii p = lii.front();
		q.pop_front();
		lii.pop_front();

		if (p.first > 0 && !vis[p.first-1][p.second]) {
			vis[p.first-1][p.second] = 1;
			q.push_back(v[p.first-1][p.second]);
			lii.push_back(ii(p.first-1,p.second));
			dist[p.first-1][p.second] += (dist[p.first][p.second] + 1);
			cel.push_back(ii(p.first-1,p.second));
		}
		if (p.first < v.size()-1 && !vis[p.first+1][p.second]) {
			vis[p.first+1][p.second] = 1;
			q.push_back(v[p.first+1][p.second]);
			lii.push_back(ii(p.first+1,p.second));
			dist[p.first+1][p.second] += (dist[p.first][p.second] + 1);
			cel.push_back(ii(p.first+1,p.second));
		}
		if (p.second > 0 && !vis[p.first][p.second-1]) {
			vis[p.first][p.second-1] = 1;
			q.push_back(v[p.first][p.second-1]);
			lii.push_back(ii(p.first,p.second-1));
			dist[p.first][p.second-1] += (dist[p.first][p.second] + 1);
			cel.push_back(ii(p.first,p.second-1));
		}
		if (p.second < v[0].size()-1 && !vis[p.first][p.second+1]) {
			vis[p.first][p.second+1] = 1;
			q.push_back(v[p.first][p.second+1]);
			lii.push_back(ii(p.first,p.second+1));
			dist[p.first][p.second+1] += (dist[p.first][p.second] + 1);
			cel.push_back(ii(p.first,p.second+1));
		}
	}

	int max = 0;
	ii pair_max;
	for (int i=0; i<cel.size(); i++) {
		if (dist[cel[i].first][cel[i].second] > max) {
			max = dist[cel[i].first][cel[i].second];
			pair_max = ii(cel[i].first,cel[i].second);
		}
	}

	return make_pair(max, pair_max);
}

int main() {
	while (true) {
		vector<vector<char>> vvs;
		int n, m;

		scanf ("%d%d", &n, &m);
		if (!n && !m) return 0;

		for (int i=0; i<n; i++) {
			char x[501];
			scanf(" %s", x);
			vector<char> aux;
			for (int j=0; j<m; j++) {
				aux.push_back(x[j]);
			}
			vvs.push_back(aux);
		}

		vi dist_max;
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				if (vvs[i][j] == '.' && is_leaf(vvs, i, j)) {
					pair<int,ii> piii = bfs(vvs, i, j);
					piii = bfs(vvs, piii.second.first, piii.second.second);
					dist_max.push_back(piii.first);
				}
			}
		}

		int out = -1;
		for (int i=0; i<dist_max.size(); i++) {
			if (dist_max[i] > out) out = dist_max[i];
		}

		printf("%d\n", out);
	}

	return 0;
}	
#include <bits/stdc++.h>

using namespace std;

int main() {
	int n, ans = 0;
	string s;
	map<string, int> n_faces;
	
	n_faces["Tetrahedron"]  = 4;
	n_faces["Cube"]         = 6;
	n_faces["Octahedron"]   = 8;
	n_faces["Dodecahedron"] = 12;
	n_faces["Icosahedron"]  = 20;

	cin >> n;
	while (n--) {
		cin >> s;
		ans += n_faces[s];
	}
	cout << ans;

	return 0;
}
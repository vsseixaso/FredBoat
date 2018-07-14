#include <bits/stdc++.h>

using namespace std;

typedef map<string, int> msi;

int main() {
  int MAX = 1000001;
  msi killers;
  string k, d;

  while (cin >> k >> d) {
    if (killers.count(k) == 0) {
      killers[k] = 1;
    } else {
      killers[k]++;
    }
    killers[d] = MAX;
  }

  cout << "HALL OF MURDERERS" << endl;
  for (auto e:killers) {
    if (e.second < MAX) {
      cout << e.first << " " << e.second << endl;
    }
  }

  return 0;
}
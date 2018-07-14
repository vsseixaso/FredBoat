#include <bits/stdc++.h>

using namespace std;

string raoni = "raaoni";
string vuvuzela = "vuvuzela";

void make_permutation(string str) {
	sort(str.begin(), str.end());
	do {
		cout << str << endl;
	} while (next_permutation(str.begin(), str.end()));
}

int main() {
	make_permutation(raoni);
	cout << endl;
	//make_permutation(vuvuzela);
	return 0;
}
/*int binary_search(double *v, int size, double searchable, int begin, int end) {
	int middle = (begin + end) / 2;
	double middle_value = *(v + middle);
	if (begin > end) {
		return -1
	}
	if (middle_value == searchable) {
		return middle;
	} else if (middle_value > searchable) {
		return binary_search(v, size, searchable, begin, middle-1);
	} else {
		return binary_search(v, size, searchable, middle+1, end);
	}

}

#include <bits/stdc++.h>

using namespace std;

#define LOWBIT(x) (x & -x)

011010101010100
100101010101100
000000000000100

const int VUVUZELA = 10;

typedef pair<int, int> ii;

int, long long, unsigned long long, char, float, double, long double
string

bool cmp(int a, int b) {
	return LOWBIT(a) > LOWBIT(b);
}

sort(a, a + n, cmp);

do {
	for (int i = 0; i < n; ++i) printf("%d ", a[i]);
	puts("");
} while (next_permutation(a, a + n));

char buffer[MAX]; 
int main() {
	vector<ii> a;
	ii p = make_pair(1, 2);
	ii p = {1, 2};
	ii p = ii(1, 2);
	a.push_back();
	string s;
	scanf("%s", buffer);
	s = buffer; //conversão de array de char para string de c++
	s.size()
	s.find()
	map<int, int> m;

	m[1] = 2;
	m.begin();
	m.end();
	m.count(1);
	*m.find()
	m.erase(m.find(2))

	set<int> s;
	s.insert(1);
	s.erase(1);
	s.erase(s.find(1))
	s.size()
	s.empty()

	multiset<int> 
	multimap<int> 

	unordered_map<int, int> a;
	unordered_set<int> 

	pair<int, int> p;
	p.first
	p.second

	vector<pair<int, long long>> v;

	sort(v.begin(), v.end(), [&](const pair<int, long long> &a, const pair<int, long long> &b) {
		return a.second < b.second;
	});

	point *p = (point*) malloc(sizeof(point));
	queue<int> q;
	q.push(1);
	q.pop();
	q.front();
	q.empty()
	q.size()

	stack<int> s;
	s.push(1);
	s.pop();
	s.top();
	s.empty()
	s.size()
	
	vector<int> v;
	v.push_back(1);
	v.pop_back();
	v.size()
	v.front()
	v.back()
	v.pop_front();
	v.push_front();

	list<int> l;
	deque<int> 

	return 0;
}

/*#include <bits/stdc++.h>

using namespace std;

int main() {
	srand(time(NULL)); //setup
	vector<int> v; 
	int l, r, n;
	scanf("%d %d %d", &l, &r, &n);
	for (int i = 0; i < n; ++i) {
		v.push_back(rand() % (r - l + 1) + l); //randomizer
	}
	for (int i = 0; i < n; ++i) {
		printf("%d ", v[i]);
	}
	printf("\n");
	sort(v.begin(), v.end());
	reverse(v.begin(), v.end());
	for (int i = 0; i < n; ++i) {
		printf("%d ", v[i]);
	}
	printf("\n");
	return 0;
}
/*int lo = 0, hi = n - 1, asw = -1;
for (int i = 0)
while (lo <= hi) {
	int md = (lo + hi) / 2;
	if (v[md] < val) {hu
		lo = md + 1;
	} else if (v[md] > val) {
		hi = md - 1;
	} else {
		asw = md;
		break;
	}
}*/
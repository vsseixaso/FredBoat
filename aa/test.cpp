#include <bits/stdc++.h>

using namespace std;

struct point {
	double x, y;
	point(){}
	point(double _x, double _y): 
		x(_x), y(_y) {}
	point operator +(const point &other) const{
		return point(x + other.x, y + other.y);
	}
	point operator -(const point &other) const{
		return point(x - other.x, y - other.y);
	}
	point operator *(double k) const{
		return point(x*k, y*k);
	}
};

double dot_product(point &a, point &b) {
	return (a.x*b.x) + (a.y*b.y);
}

double cross_product(const point &a, const point &b) {
	return a.x*b.y - b.x*a.y;
} 

int main() {
	int n;
	scanf("%d", &n);
	vector<point> points;
	for(int i = 1; i <= n; i++) {
		double x, y;
		scanf("%lf %lf", &x, &y);
		points.push_back(point(x, y));
	}


	for(int i = 0; i < n; i++) {
		for (int j=i+1; j<n; j++) {
			int count = 0;
			point main_vector = points[j] - points[i];
			for (int k=0; k<n; k++) {
				if (cross_product(points[k] - points[i], main_vector) == 0) {
					count++;
				}
			}
			printf("%d \n", count-2);
		}
	}


	return 0;
}
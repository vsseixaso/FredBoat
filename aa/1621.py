

while True:
	n, m = map(int, raw_input().split())
	if n == m == 0: break

	vs = []
	for i in xrange(n):
		aux = raw_input()
		aux = list(aux)
		vs.append(aux);

	for i in xrange(n):
		for j in xrange(m):
			if vs[i][j] == '.':
				if i > 0:
					
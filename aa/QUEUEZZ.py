import Queue

t = int(raw_input())
q = []

for i in xrange(t):
	n = map(int, raw_input().split())

	if n[0] == 1:
		q.append(n[1])
	elif n[0] == 2:
		if len(q) != 0:
			q.pop(0)
	elif n[0] == 3:
		if len(q) == 0:
			print "Empty!"
		else:
			print q[0]

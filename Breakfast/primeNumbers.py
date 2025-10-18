number = 100
divisorCount = 0
for numbers in range(1, number):
	for count in range (1, len(str(numbers))):
		if numbers % count == 0:
			divisorCount += 1
		if divisorCount > 2:
			print(numbers)

number = 64
number_of_divisor = 0
for count in range (1, number+1):
	if number % count == 0:
		number_of_divisor +=1
print(f"Number of divisor is: {number_of_divisor}")

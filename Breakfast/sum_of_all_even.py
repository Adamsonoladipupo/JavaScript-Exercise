numbers = 123456
numbers_in_array = []
for digit in str(numbers):
	if int(digit) % 2 == 0:
		print(digit)
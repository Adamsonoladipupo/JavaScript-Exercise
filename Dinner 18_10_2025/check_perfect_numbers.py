number = int(input("Enter a number: "))
divisor = 0;
for count in range (1, number):
	if number % count == 0:
		divisor += count
if divisor == number:
	print("Is a perfect number")
if divisor != number:
	print("Is not a perfect number")
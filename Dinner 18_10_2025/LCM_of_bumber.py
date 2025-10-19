number = int(input("Enter a number: "))
divisor = 2;
sumOfDivisors = 0;
while number != 1:
	if number % divisor == 0:
		number = number/divisor
		sumOfDivisors += divisor
	else: 
		divisor += 1
print(f"The LCM is: {sumOfDivisors}");
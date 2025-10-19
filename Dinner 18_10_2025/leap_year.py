year = int(input("Enter a number: "))
 
if year % 4 == 0 and year % 100 != 0:
	print("Is a leap year")
else:
	print("Not a leap year");
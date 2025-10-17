number = 294555492
number = str(number)
new_number = number[-1::-1]
check = False
if number == new_number:
	check = True

print(check)
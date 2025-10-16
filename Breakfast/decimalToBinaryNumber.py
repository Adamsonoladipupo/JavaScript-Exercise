number = 123
remainder = 0
add_all_rmainders = ""
while number % 2 != 0 or number / 2 != 0:
	remainder = number % 2
	number //= 2
	add_all_rmainders += str(remainder)
add_all_rmainders = add_all_rmainders[len(add_all_rmainders)::-1]
print(add_all_rmainders)

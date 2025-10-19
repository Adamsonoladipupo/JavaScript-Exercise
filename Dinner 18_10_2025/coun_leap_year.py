def get_leap_year(number):
	if number % 4 == 0 and number % 100 != 0:
		return number
	else:
		return 0


for count in range (1900, 2026):
	checker = get_leap_year(count)
	if checker > 0:
		print(checker)
def checkArmStrong(number):
	initialInput = 0
	initialInput = number
	seperatedNumber = 0
	cubeOfSeperatedNumber = 0
	SumOfCubeOfSeperatedNumber = 0;
	while number % 10 != 0 or number / 10 != 0:
		seperatedNumber = number % 10
		cubeOfSeperatedNumber = seperatedNumber*seperatedNumber*seperatedNumber
		SumOfCubeOfSeperatedNumber += cubeOfSeperatedNumber
		number /=10
		seperatedNumber = 0
	if initialInput == SumOfCubeOfSeperatedNumber:
		return SumOfCubeOfSeperatedNumber
	else:
		return 0


checker = 0
count = 1
for count in range (1, 1001):
	checker = checkArmStrong(count)
	if checker > 0:
		print(checker)
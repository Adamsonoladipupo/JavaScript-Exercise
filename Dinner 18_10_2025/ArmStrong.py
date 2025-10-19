number = int(input("Enter a number: "))
initialInput = 0;
initialInput = number;
seperatedNumber = 0;
cubeOfSeperatedNumber = 0;
SumOfCubeOfSeperatedNumber = 0;
while number % 10 !=0 or number / 10 !=0:
	seperatedNumber = number % 10
	cubeOfSeperatedNumber = seperatedNumber**3
	SumOfCubeOfSeperatedNumber += cubeOfSeperatedNumber
	number /=10;
	seperatedNumber = 0;
if initialInput == SumOfCubeOfSeperatedNumber:
	print(f"{initialInput} is an strong number")
else:
	print(f"{initialInput} is not an strong number")
const inputCollector = require("prompt-sync")({sigint: true});
let number = inputCollector("Enter a number: ");
let initialInput = 0;
initialInput = number;
let seperatedNumber = 0;
let cubeOfSeperatedNumber = 0;
let SumOfCubeOfSeperatedNumber = 0;
while(number % 10 !=0 || number / 10 !=0){
	seperatedNumber = number % 10;
	cubeOfSeperatedNumber = seperatedNumber*seperatedNumber*seperatedNumber;
	SumOfCubeOfSeperatedNumber += cubeOfSeperatedNumber;
	number /=10;
	seperatedNumber = 0;
}
if (initialInput == SumOfCubeOfSeperatedNumber){
	console.log("%d is an strong number", initialInput);
} else {
	console.log("%d is not an strong number", initialInput);
}

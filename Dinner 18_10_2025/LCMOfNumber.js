const prompt = require("prompt-sync")({signit: true});
let number = prompt("Enter a number: ")
let  divisor = 2;
let sumOfDivisors = 0;
while ( number != 1){
	if (number % divisor == 0 ){
		number = number/divisor;
		sumOfDivisors += divisor;
	} 
	else { divisor++;}
}
console.log("The LCM is: %d",sumOfDivisors);
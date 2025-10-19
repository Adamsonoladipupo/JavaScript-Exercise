const prompt = require("prompt-sync")({sigint: true});
let divisor = 0;
let number = prompt("Enter a number: ");
for (let count = 1; count < number; count++){
	if (number % count == 0){
		divisor += count; 
	}
}
if (divisor == number){
	console.log("Is a perfect number");
} 
if (divisor != number) {console.log("Is not a perfect number");}
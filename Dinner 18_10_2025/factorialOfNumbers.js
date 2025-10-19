const prompt = require("prompt-sync")({sigint: true});
		
factorial = 1
let number = prompt("Enter a number: ");
for (let count = 1; count <= number; count++){
	factorial *= count;
}
	console.log("The factorial is: %d", factorial);
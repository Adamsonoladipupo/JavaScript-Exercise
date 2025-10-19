const prompt = require("prompt-sync")({signit: true});
 
let userInput = prompt("Enter a number: ")
if ( userInput % 4 == 0 && userInput % 100 != 0){
	console.log("Is a leap year");
}
else{
	console.log("Not a leap year");
}
/*const ps = require("prompt-sync");
const prompt = ps();*/

const prompt = require("prompt-sync")({sigint: true});

let numerator = prompt("Enter first number: ");
let denominator = prompt("Enter second number: ");
let result = numerator / denominator;

 
console.log(result);
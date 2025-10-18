let population = 0;
let initialPopulation = 8230000000;
let increasePolulation = 0;
let pupulationX2 = 0;

console.log("Year	Anticipated Population	Increase Population");
for (let count = 1; count <= 75; count++){
	population = 8.23 * (2.71828 ** (0.0084*count));
	increasePolulation = population - initialPopulation;
	console.log(count ,"	",population ,"	 ", increasePolulation);
}
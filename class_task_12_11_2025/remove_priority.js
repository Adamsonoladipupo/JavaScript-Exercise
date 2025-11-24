function remove_priority( input){	
	newList = [];
	for (let count = 0; count < input.length; count++){
		if (input[count] > 0 && input[count] < 6){
			newList.push(input[count]);
			//input.splice(input[count]);
		}
	}
	return newList;
}


let entries = [7,2,0,1,3];
console.log("Before",entries);

console.log("After", remove_priority(entries))
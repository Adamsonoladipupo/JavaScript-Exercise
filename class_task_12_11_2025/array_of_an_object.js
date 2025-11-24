function get_sorted_high_score(input){
	new_list = [];
	return new_list;
}

survey_result = [{name: "Ade", score: 63}, {name: "Bola", score: 50},{name: "Peter", score :80},{name : "Chigozie", score: 95},{name : "Bisi", score : 85},{name : "Makanaki", score : 45}]
for (let item of survey_result){
	let customer = item
	console.log(customer)
	for (const key in customer){
		let name_and_score = Object.values(customer);
		for(let e in name_and_score){
			console.log(e);
		}
		//console.log(Object.values(customer));
		
		
	}
}
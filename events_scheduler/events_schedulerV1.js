const prompt = require ("prompt-sync")({sigint: true})

success = ["Action performed success . . ."]
main_data = {}
userIDs = []
user_data = {}
each_event = {}

function menu_two(){
	let main = `
	Welcome to Event Scheduler

	1. Add event
	2. View Events
	3. View Schedule
	4. Delect event
	
	0. Back
	`;
	console.log(main);
}
function menu_one(){
	let main_menu = `
	Welcome to Event Scheduler

	1. New user
	2. Returning User
	3. View All Users & Events

	0. Exit
	`;
	console.log(main_menu);
}

function add_event_to_specific_user(user_data, each_event, event_name, event_date, start_time, end_time){
			each_event = {
				"Event Date": event_date,
				"Start Time": start_time,
				"End Time": end_time
			}
			user_data[event_name] = each_event
}

function add_user_event_into_main_database(main_data, user_data, userid){
			main_data[userid] = user_data;
}

function view_specific_user_event(userid){
	user_event = main_data[userid];
	console.log(user_event)
}



while (true){
	menu_one();
	user_input = prompt("Make a selection: ")
	switch(user_input){
		case "1": {
			let userid = prompt("Enter a prefered userID: ")
			userIDs.push(userid);
			//main_data[userid]user_data;
			console.log(success);
			break;
		}
		case "2": {
			let userid = prompt("Enter your userID to proceed : ");
			if ( userIDs.includes(userid)){
			//if ( userid in main_data){
				menu_two();
				let user_input = prompt("make a selection to proceed: ")
				switch(user_input){
					case "1":{
						let event_name = prompt("Enter event name: ")
						let event_date = prompt("Enter event date: ")
						let start_time = prompt("When is the event starting: ")
						let end_time = prompt("EWhen is the event ending: ")
			
						add_event_to_specific_user(user_data, each_event, event_name, event_date, start_time, end_time)

						add_user_event_into_main_database(main_data, user_data, userid)

						each_event = {}
						user_data = {}

						break;
					}
					case "2":{
						console.log(user_data)
						view_specific_user_event(userid)
						break;
					}
					case "3":{
						console.log("View Schedule")
						break;
					}
					case "4":{
						console.log("delete event")
						break;
					}
					case "0": {break;}
				}
				//{ console.log("Oops, User is not registered")}

			
			} // end of case 2
			break;
		}
		case "3": {
			console.log(main_data)
		}
		case "0": {break;}
	}
}





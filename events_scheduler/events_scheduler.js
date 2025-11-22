const prompt = require ("prompt-sync")({sigint: true})
main_database = {};
store_users_event = {}
store_event = {}

// ===========  FUNCTONS ================
function menu_one(){
	menu = `

	Welcome to Event Scheduler App

	1. Register as a new user
	2. Enter as a user
	3. View all users with events

	0. Exit
	`;
	console.log(menu)
}

function menu_two(userid){
	menu = `

	Welcome back ${userid}

	1. Add a new event
	2. View schedule events
	3. View my events
	4. Delete event

	0. Back
	`;
	console.log(menu)
}
function input_to_date(yyyy, mm, d){
	let date = `${d}/${mm}/${yyyy}`
	return date;
}

function adding_event_per_user(event_name, start_date, end_date, start_time, end_time, store_event){
    store_event = {
        "Start Date" : start_date,
        "End Date" : end_date,     
        "Start time" : start_time,
        "End time" : end_time,
    }
    store_users_event[event_name] = store_event
}

function adding_user_events_to_user_id(userid, storeUserEvent, main_database){
    if (!(userid in main_database)) {
        main_database[userid] = {} 
    }
    for (let events in storeUserEvent){
        main_database[userid][events] = storeUserEvent[events];
    }
}

function delete_event(event_name, userid, main_database){
	if (!(userid in main_database && event_name in main_database[userid])){
		console.log("users or event does not exit");
	}
	else{
		delete main_database[userid][event_name];
		console.log("Event deleted successfully! . . .")
	}

}



let user_input = 10;
while (user_input != 0){
	menu_one();
	user_input = prompt("Make a selection: ")
	switch(user_input){
		case "1":{
			let userid = prompt("Enter a userID: ");
			//store_IDs.push(userid);
			main_database[userid] = {} 
			console.log("Registrtion successful . . .")
			break;
		}
		case "2":{
			let userid = prompt("Enter your userID: ");
			if (userid in main_database){
				menu_two(userid);
				let new_input = 5
				while(new_input != 0){
					new_input = prompt("Make a selection: ")
					switch(new_input){
						case "1": {
							let event_name = prompt("Enter event name: ");
							console.log("Collecting event date and time");
							let start_time = prompt("Enter start time(hours:minutes): ");
							let end_time = prompt("Enter end time(hours:minutes): ");
							let number_of_days = prompt("The event will lasted how many days: ");
							if (number_of_days < 2 && number_of_days > 0){
								let start_date_day = prompt("Enter start date (Day): ");
								let start_date_month = prompt("Enter start date (Month): ");
								let start_date_year = prompt("Enter start date (Year): ");
								start_date = input_to_date(start_date_year, start_date_month, start_date_day);
								end_date = start_date; 
								console.log("Event information submitted . . .");
							}
							else if (number_of_days > 1){
								let start_date_day = prompt("Enter start date (first Day): ");
								let start_date_month = prompt("Enter start date (Month): ");
								let start_date_year = prompt("Enter start date (Year): ");
								start_date = input_to_date(start_date_year, start_date_month, start_date_day);
								let end_date_day = prompt("Enter start date (last day): ");
								let end_date_month = prompt("Enter start date (Month): ");
								let end_date_year = prompt("Enter start date (Year): ");	
								end_date = input_to_date(start_date_year, start_date_month, start_date_day)
								console.log("Event information submitted . . .");
							}
							else{console.log("Invalid number of days")}
							adding_event_per_user(event_name, start_date, end_date, start_time, end_time, store_event)
							adding_user_events_to_user_id(userid, store_users_event, main_database)
							store_users_event = {}
							store_event = {}
							break;
						}
						case "2": {
							console.log("View schedule event")
							break;
						}
						case "3": {
							console.log(main_database[userid]);
							break;
						}
						case "4": {
							console.log("Select from your available events: ")
							console.log(main_database[userid]);
							event_name = prompt("Enter event name: ");
							delete_event(event_name, userid, main_database)
							break;
						}
						case "0":{break;}
						default : {console.log("Please, enter a valid input");}
					}
				}
			}
			else{
				console.log("Oops, user is not registered!")
			}
			break;
		}// end of case 2
		case "0":{console.log("Thank you for using our app!..."); break;}
		case "3":{console.log(main_database ); break;}
		default : {console.log("Please, enter a valid input"); break;}
	}
}
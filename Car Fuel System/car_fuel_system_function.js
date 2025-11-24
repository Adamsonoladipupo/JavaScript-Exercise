function start_car(car_key, fuel_level){
    let car_started = false;
    if (car_key == true && fuel_level > 0){
        car_started = true
    }
    else if(car_key == false && fuel_level > 0){
        let message = "Car key if off";
        return message
    }
    else if (car_key == true && fuel_level < 1){
        let message = "Your fuel tan kis empty";
        return message;
    }
    else{
        car_started = false
    }
    return car_started;
}

function check_fuel(fuel_level){
    return fuel_level;
}

function car_state(car_key){
    let is_driving = false;
    if(car_key == true){
        is_driving = true;
    }
    else{
        is_driving = false;
    }
    return is_driving;
}

function fuel_consumed(FUEL_EFFICIENCY, distance_traveled){
    let fuel_consumed = distance_traveled / FUEL_EFFICIENCY;
    return fuel_consumed;
}
module.exports = {start_car, check_fuel, car_state, fuel_consumed}
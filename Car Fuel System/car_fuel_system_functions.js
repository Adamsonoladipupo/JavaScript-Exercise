
function car_starter( car_fuel_tank, car_key){
    let car_started = false;
    if (car_fuel_tank > 0 && car_key == true){
        car_started = true
    }
    else{
        car_started = false;
    }
    return car_started
}

function check_fuel_level(car_fuel_tank){
    //console.log("Car fuel level is: ", car_fuel_tank);
    return car_fuel_tank;
}

function car_driving_status(car_key, driving){
    if (car_key == false){
        driving = false
    }
    else{
        driving = true
    }
}
function fuel_car(car_fuel_tank, fuel_amount){
    if( fuel_amount + car_fuel_tank > 50){
        throw new Error ("The 50 Liters car capacity has been exeeded!");
    }
    if ( fuel_amount + car_fuel_tank <= 50){
        car_fuel_tank += fuel_amount;
        return car_fuel_tank;
    }
}

function fuel_consumed(distance, fuel_efficiency){
    let fuel_consumed = distance/ fuel_efficiency;
    return fuel_consumed;
}

module.exports = {car_starter, check_fuel_level, fuel_car, car_driving_status, fuel_consumed}
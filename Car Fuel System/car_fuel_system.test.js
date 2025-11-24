const {start_car, check_fuel, car_state, fuel_consumed} = require("./car_fuel_system_function")

describe ("Testing the car fuel system functions", ()=>{
    test("testing if the car started function can't start the car when key if off, and fuel level is 0", ()=>{
        expect(start_car(false, 0)).toBeFalsy();
    })
    test("test if the car will start if car key is on and fuel tank is not empty", ()=>{
        expect(start_car(true, 5)).toBeTruthy();
    })
    test("testing if check fuel function will return car fuel level", ()=>{
        expect(check_fuel(6)).toEqual(6);
    })
    test("test if car is not driving when key is off", ()=>{
        expect(car_state(false)).toBeFalsy();
    })
    test("test if car is driving when key is on", ()=>{
        expect(car_state(true)).toBeTruthy();
    })
    test("testing fuel consumed knowing distance covered and fuel efficiency", ()=>{
        FUEL_EFFICIENCY = 15; // this mean that the car can travel 15km using 1 liter of fuel
        distance = 100
        expect(fuel_consumed(FUEL_EFFICIENCY, distance)).toBeGreaterThanOrEqual(6.66);
    })
})
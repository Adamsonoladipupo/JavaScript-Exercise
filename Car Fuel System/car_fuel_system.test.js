const {car_starter, fuel_car, check_fuel_level, fuel_consumed} = require("./car_fuel_system_functions")

describe ('Testing simple fuel system function ',()=>{

    test('testing to see if car will not start if the fuel level is zero, empty ', ()=> {
        expect(car_starter(0,true)).toBeFalsy();
    })

    test('testing to see if car will start if the fuel level is above zero, not empty ', ()=> {
        expect(car_starter(4,true)).toBeTruthy();
    })

    test('testing to see if car will start if car key is on ', ()=> {
        expect(car_starter(50,true)).toBeTruthy();
    })

    test('testing to see if car will stop if car key is off ', ()=> {
        expect(car_starter(50,false)).toBeFalsy();
    })

    test('testing if car can be refueled', ()=>{
        expect(fuel_car(1, 40)).toEqual(41);
    })

    test('testing if car can be refueled beyond its capacity 50L', ()=>{
        expect(()=>fuel_car(40,40)).toThrow("The 50 Liters car capacity has been exeeded!");
    })

    test("checking car fuel level", ()=>{
        expect(check_fuel_level(40)).toEqual(40);
    })

    test("testing if car can be driven", ()=>{
        const FUEL_EFFICIENCY = 15; // 15kml mean the car can cover 15km using 1 liter of fuel
        expect(fuel_consumed(100, FUEL_EFFICIENCY)).toBeGreaterThanOrEqual(6.66)
    })

})
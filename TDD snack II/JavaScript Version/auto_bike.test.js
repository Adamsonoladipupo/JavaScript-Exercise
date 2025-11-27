const {start_bike, fluctuating_speed} = require("./bike_function");

describe("Testing all auto_bike_functions", ()=>{
    test("testing if bike will turns on if key is off", ()=>{
        expect(start_bike(true)).toBeTruthy();
    })
    test("testing if bike will turns off if key is off", ()=>{
        expect(start_bike(false)).toBeFalsy();
    })
    test("testing if bike gear changes with change in speed", ()=>{
        expect(fluctuating_speed(25, 0)).toEqual(2);
    })
})
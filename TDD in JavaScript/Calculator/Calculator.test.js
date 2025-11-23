const {add, subtraction, multiply, division} = require("./CalculatorFunction")

describe('Test for simple operation', ()=>{

    test("Test to add three numbers, 4,2, and 6", ()=> {
        expect(add(4,2,6)).toBe(12);
    })

    test("Test to subtract 6 and 4", ()=> { 
        expect(subtraction(6,4)).toBe(2);
    })

    test("Test to multiply 6 and 4", ()=> {
        expect(multiply(6,4)).toBe(24);
    })

    test("Test to divide 60 and 10", ()=> {
        expect(division(60,10)).toBe(6);
    })


 })
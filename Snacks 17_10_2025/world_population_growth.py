#using  P(t) = Po . e^rt
population = 0
initialpopulation = 8230000000
increasePolulation = 0
pupulationX2 = 0

print("Year	Anticipated Population		Population Increase")
for count in range (1, 76):
	population = 8230000000 * (2.71828 ** (0.0084*count))
	increasePolulation = population - initialpopulation
	print(f"{count}	{population}		{increasePolulation}")

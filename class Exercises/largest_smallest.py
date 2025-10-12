#def largest_smallest(numbers):

numbers = [10, 45, 32, 15, 4, 17]

 = smallest
for count in range(len(numbers)):
	if smallest > numbers[count]:
		numbers[count] = smallest
print(smallest)

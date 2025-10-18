def encryption():
	print("Send a simple message in four digits")
	message = [0,0,0,0]
	for count in range (4):
		message[count] = int(input("Enter digit :"))
	print(f"You entered: {message}")
	for count in range (4):
		message[count] = message[count] + 7
		message[count] = message[count] % 10
	tv1 = message[0]
	tv2 = message[2]
	message[0] = tv2
	message[2] = tv1
	tv1 = message[1]
	tv2 = message[3]
	message[1]= tv2
	message[3] = tv1
	print(f"Encrypted Value is {message[0]}{message[1]}{message[2]}{message[3]}")
	
def decryption():
	print("Send a simple message in four digits")
	message = [0,0,0,0]
	for count in range (4):
		message[count] = int(input("Enter digit :"))
	print(f"You entered: {message}")
	for count in range (4):
		message[count] = message[count] - 7
		message[count] = message[count] + 10
		if message[count] > 10:
			message[count] = message[count] % 10
	tv1 = message[0]
	tv2 = message[2]
	message[0] = tv2
	message[2] = tv1
	tv1 = message[1]
	tv2 = message[3]
	message[1]= tv2
	message[3] = tv1
	print(f"Decrypted Value is {message[0]}{message[1]}{message[2]}{message[3]}")
	
docString = """

Welcome! 
Send and receive message in codes.	
		
1. Encrypt
2. Decrypt

"""; 
print(docString);
selectMessage = int(input(""))
match selectMessage:
	case 1: encryption()
	case 2: decryption()

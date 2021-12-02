#Example file for working with conditional statement with elseif
def main():
	x,y =8,8
	if(x < y):
		st= "x is less than y"
	elif (x == y):
		st= "x is same as y"
	else:
		st="x is greater than y"
	print(st)
if __name__ == "__main__":
	main()
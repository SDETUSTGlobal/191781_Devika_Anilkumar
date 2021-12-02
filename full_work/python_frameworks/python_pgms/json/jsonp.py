import csv

reader = csv.DictReader(open("G:\\file.csv"))
for raw in reader:
    print(raw)

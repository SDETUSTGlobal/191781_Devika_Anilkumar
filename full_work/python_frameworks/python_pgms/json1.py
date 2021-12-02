import csv

reader = csv.DictReader(open("G:\file"))
for raw in reader:
    print(raw)

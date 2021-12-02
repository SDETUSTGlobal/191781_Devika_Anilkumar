import mysql.connector
db_connection = mysql.connector.connect(
  host="localhost",
  user="root",
  passwd="root",
  database="my_first_db"
  )
db_cursor = db_connection.cursor()
#Here creating database table as employee with primary key
db_cursor.execute("CREATE TABLE employee(id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), salary INT(6))")
#Get database table
db_cursor.execute("SHOW TABLES")
for table in db_cursor:
	print(table)

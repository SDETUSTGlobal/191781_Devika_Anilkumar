import mysql.connector
db_connection = mysql.connector.connect(
  host="localhost",
  user="root",
  passwd="root",
  database="my_first_db"
  )
db_cursor = db_connection.cursor()
#Here creating database table as student'
db_cursor.execute("CREATE TABLE student (id INT, name VARCHAR(255))")
#Get database table'
db_cursor.execute("SHOW TABLES")
for table in db_cursor:
	print(table)

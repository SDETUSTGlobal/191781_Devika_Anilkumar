from flask import Flask, render_template, request
from flask_mysqldb import MySQL
app = Flask(__name__)

app.config['MYSQL_HOST'] = 'localhost'
app.config['MYSQL_USER'] = 'root'
app.config['MYSQL_PASSWORD'] = 'root'
app.config['MYSQL_DB'] = 'my_first_db'

mysql = MySQL(app)


@app.route('/', methods=['GET', 'POST'])
def index():
    if request.method == "POST":
        details = request.form
        name = details['userna']
        uid= details['uid']
        compna = details['cna']
        email= details['email']
        cur = mysql.connection.cursor()
        cur.execute("INSERT INTO usersdetails(uname,uid,Companyname,email) VALUES (%s,%s,%s,%s)", (name,uid,compna,email))

        cur.close()
        cur2=mysql.connection.cursor()
        cur2.execute("SELECT * FROM usersdetails")
        data = cur2.fetchall()
        mysql.connection.commit()
        cur2.close()
        return render_template('template.html',details=data,na=name,uid=uid,cna=compna,em=email)
    return render_template('sample.html')


if __name__ == '__main__':
    app.run()
MariaDB [(none)]> create database employee
    -> ;
Query OK, 1 row affected (0.008 sec)

MariaDB [(none)]> use employee
Database changed
MariaDB [employee]> create table employeeDetails( Id int NOT NULL PRIMARY KEY,
    -> FirstName varchar(25) NOT NULL,
    -> LastName varchar(25) NOT NULL);
Query OK, 0 rows affected (0.183 sec)

MariaDB [employee]> desc employeeDetails;
+-----------+-------------+------+-----+---------+-------+
| Field     | Type        | Null | Key | Default | Extra |
+-----------+-------------+------+-----+---------+-------+
| Id        | int(11)     | NO   | PRI | NULL    |       |
| FirstName | varchar(25) | NO   |     | NULL    |       |
| LastName  | varchar(25) | NO   |     | NULL    |       |
+-----------+-------------+------+-----+---------+-------+
3 rows in set (0.029 sec)

MariaDB [employee]> INSERT into employeeDetails VALUES (1,"Gaurav","Sharma"),(2,"Khushi","Singhal"),(3,"Raju","Rastogi"),(4,"Chaman","Dosa");
Query OK, 4 rows affected (0.050 sec)
Records: 4  Duplicates: 0  Warnings: 0

MariaDB [employee]> SELECT * FROM employeeDetails
    -> ;
+----+-----------+----------+
| Id | FirstName | LastName |
+----+-----------+----------+
|  1 | Gaurav    | Sharma   |
|  2 | Khushi    | Singhal  |
|  3 | Raju      | Rastogi  |
|  4 | Chaman    | Dosa     |
+----+-----------+----------+
4 rows in set (0.004 sec)

MariaDB [employee]> UPDATE employeeDetails SET FirstName='Anjali' where Id=2;
Query OK, 1 row affected (0.015 sec)
Rows matched: 1  Changed: 1  Warnings: 0

MariaDB [employee]> SELECT * FROM employeeDetails;
+----+-----------+----------+
| Id | FirstName | LastName |
+----+-----------+----------+
|  1 | Gaurav    | Sharma   |
|  2 | Anjali    | Singhal  |
|  3 | Raju      | Rastogi  |
|  4 | Chaman    | Dosa     |
+----+-----------+----------+
4 rows in set (0.000 sec)

MariaDB [employee]> DELETE from EmployeeDetails where Id=3;
Query OK, 1 row affected (0.003 sec)

MariaDB [employee]> SELECT * FROM employeeDetails;
+----+-----------+----------+
| Id | FirstName | LastName |
+----+-----------+----------+
|  1 | Gaurav    | Sharma   |
|  2 | Anjali    | Singhal  |
|  4 | Chaman    | Dosa     |
+----+-----------+----------+
3 rows in set (0.000 sec)

MariaDB [employee]> 

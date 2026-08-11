# Springboot RESTful Application

Returning data as a JSON from the query for SQL Server

### Runtime Environment
```
export DB_SERVER=<SQL Server Name>
export DB_PORT=<SQL Server Port>
export DB_NAME=<SQL Server Database Name>
export DB_USER=<SQL Server Login ID>
export DB_PASSWORD=<SQL Server Login Password>
```

### Build
```
mvn clean install
```

### Run
```
java -jar target/springboot-mssql-0.0.1-SNAPSHOT.jar
```

### End Point URL
```
http://localhost:8080/api/trades?input_ymd=20260807&koyu_mei_cd=0004
```

### SQL Server
docker image for Microsoft SQL server 
Name=mcr.microsoft.com/azure-sql-edge
Port=1401

```
docker start mssql
docker ps
docker stop
```


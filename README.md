Sample spring boot application to read from mysql and write to elastic search.

This is a sample application to show working with jpa and elastic search. Data is read from myqsl data base. Spring-data-jpa is used to read data from Mysql using hibernate.
Data is written to elastic search. Spring-data-elasticsearch is used to write to an embedded elasticsearch. Elasticsearch data files are stored under target directory.
Also a rest service is provied to send queries to embedded elasticsearch. Only one method is provied to search by name. Rest application uses embedded servlet container so no container is needed. 
Sample url is given below:

http://localhost:8080/recipe/by-name?name=pasta

http://localhost:8080/recipe/all

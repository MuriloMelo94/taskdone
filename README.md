![logo](https://user-images.githubusercontent.com/80219103/208516280-6d74f848-1149-44a2-88a5-7d3deee04dac.png)

# ESIG GROUP - JAVA Intern Challenge
#### This application was developed as part of ESIG GROUP’s selective process for new JAVA intern developer.

## Introduction
A WEB Java application using JSF to create, read, update and delete tasks (CRUD). 
Including the featuring of mark a task as done.

## Technologies
What was used:
- **Java8**
- **JSF**
- **PrimeFaces**
- **PostgreSQL** 
- **JPA**
- **Hibernate** 
- **Maven** 

## How to Run the project
### Getting Started
To get started, you should have **Java8** (or superior) and **Maven** installed. To verify if you already have JAVA, run:
```
$ java --version 
```
And to verify if you already have maven, run:
```
$ mvn --version 
```
In your JAVA IDE, import the application as a maven project. Just for reference, this project was developed using **[Eclipse IDEA](https://www.eclipse.org/downloads/)**
<br></br>
### Setting server and DataBase
Download Apache TomCat version 9 and create a server with it on your IDE
```
Add the project to the server
```
Download the PostgreSQL and PGAdmin4. Create a new database called "taskdonedb".

```
In the project:
-> Find the persistence.xml (Java Resources > src/main/java > META-INF > persistence.xml)
-> Change the value of *user* property in line 9 to which one you had previously set on you PostgreSQL
-> Change the value of *password* property in line 10 to which one you had previously set on you PostgreSQL
```

### Running the Application
Build the jar:
```
$ mvn clean install
```
Up the system:
```
-> Start your Tomcat server
-> Open a new browser window (Firefox, Google Chrome, others...)
-> Write the url below on your browser:
-> localhost:8080/taskdone/index.xhtml
```

And you're already good to go!
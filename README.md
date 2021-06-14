# COVID TRACKING PROJECT

##This project is created for learning purpose, article will be shared on https://Onurdesk.com

Project Overview :

This project gives us information about the current status of COVID across India. Following
details about COVID can be tracked using this project :

1. Current Status of COVID patients of India
    a. Total Cases
    b. Total Recovered
    c. Total Active Cases
    d. Total Deaths
2. Weather According to the selected Location and Temperature of that location.
3. News related to COVID published on that day.
4. Vaccination Slots available

User can select the state and then the district. They will see the different centers available for
that state and district. They can then see the center details and know the availability of
vaccination slots according to the age group.

They can also register their email id for any particular center, if the user want to get notified
about the availability of vaccine slots.

## Prerequisites :

### 1. JAVA 8

2. Spring Framework
3. Spring MVC
4. Springboot
5. Knowledge of RestTemplate/Microservices (For connection of APIs)
6. MySQL

## Software needed :

1. Eclipse / STS

## APIs used :

1. Weather (source: Rapid API) : https://rapidapi.com/weatherapi/api/weatherapi-com

## 2. Covid- 19 (source : Rapid API) : https://rapidapi.com/api-sports/api/covid- 193

3. News (source : Newsapi.org) : https://newsapi.org/
4. Cowin (source : API Setu) : https://apisetu.gov.in/public/api/cowin


# STEPS TO IMPORT AND EXECUTE THE PROJECT

1. Import the project in Eclipse/STS. (File -> Import -> Browse -> Select Folder of project
    downloaded)
2. Create account (if not) on Rapid API and go to that link.
3. Copy the API_KEY and paste it in WebService class of com.gaurav.covid.service
    package in the variable with name RAPID_API_KEY.
4. Follow the same steps as above on NewsAPI and paste that in WebService class in
    the variable with name NEWS_API_KEY.
5. Set the EMAIL_FROM variable from the email id you want to send the mail.
6. Do ensure that nothing is running on PORT 8080 of your computer.

```
If it is giving an error as “Application failed to start” that means PORT 8080 is busy.
Either you stop your server of PORT 8080 or write following thing in
application.properties
```
```
server.port = 8081 ( or whichever port is free in your computer )
```
7. Set following things according to your system in application.properties:
    a. spring.datasource.url = jdbc:mysql://localhost:3306/covid
    b. spring.datasource.username = YOUR_DB_USERNAME
    c. spring.datasource.password = YOUR_DB_PASSWORD
    d. spring.mail.username=YOUR_EMAIL_ID_BY_WHICH_YOU_WANT_TO_SEND_MAIL
    e. spring.mail.password=PASSWORD_GENERATED (by doing following steps)
       i. Login to your account
ii. Click on your image on upper right corner (if working on chrome. May
vary according to browser)
iii. Click on Manage your Google Account
iv. Click on Security
v. Click on App Password (if not able to see. Check after enabling 2-way
authentication)
vi. Choose “Others” in select app dropdown
vii. Give App name according to you
viii. Click on Generate. A password will be generated.
ix. Use that password in application.properties
8. Set Database
9. Create Database with name “covid”. (if you want to change, make sure you are
    changing in application.properties too.)

```
Query : create database DB_NAME;
```

10. There are two ways to create the tables in DB.
    a. Use query to create table with columns according to the below db structure

```
b. For the first time change as below in application.properties file:
```
```
spring.jpa.hibernate.ddl-auto = create
```
```
Make sure after running for the first time change it to
```
```
spring.jpa.hibernate.ddl-auto = validate
```

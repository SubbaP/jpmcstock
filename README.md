# jpmcstock
Requirements 
1. Provide working source code that will :- 
a.	For a given stock,  
i.	Given any price as input, calculate the dividend yield 
ii.	Given any price as input,  calculate the P/E Ratio 
iii.	Record a trade, with timestamp, quantity of shares, buy or sell indicator and traded price 
iv.	Calculate Volume Weighted Stock Price based on trades in past 15 minutes 
b.	Calculate the GBCE All Share Index using the geometric mean of prices for all stocks 

Software design solution - I have used following design patterns to implement the requirements provided.


- The facade pattern.

The facade pattern (also spelled façade) is a software design pattern commonly used with object-oriented programming. 
The name is by analogy to an architectural façade.A facade is an object that provides a simplified interface to a larger body of code, such as a class library. A facade can
make a software library easier to use, understand and test.
Facade provide convenient methods for common tasks,make the library more readable, for the same reason,
reduce dependencies of outside code on the inner workings of a library, since most code uses the facade, thus allowing more flexibility in developing the system,
wrap with a single well-designed API.

- Composite pattern.

The composite pattern is a partitioning design pattern, describes a group of objects that is treated the same way as a single instance of the same type of object. The intent of a composite is to "compose" objects into tree structures to represent part-whole hierarchies. Implementing the composite pattern lets clients treat individual objects and compositions uniformly


Technical design - Attached diagram below provides all the classes and it's associations.


![alt text](https://cloud.githubusercontent.com/assets/28501639/25785811/2ece64f6-3381-11e7-9e00-47225b6cf801.jpg)


Build:

- Development Technology stack - Spring Boot, Spring and Spring data repository
- Test technology statck - Mocikto
- Maven is used as a build tool.
- Eclipse Oxygen is used for development tool.
- GIT master branch is used for code respository.

Test:

- Download the source code and navigate to root(demo) directory which has POM.
- Run the Spring boot application with demo profile, mvn spring-boot:run 
  a. Populates the demo data
  b. Perform a random number of parallel transactions with a minimum of 10 transactions 
     and a maximum of 50
- To run the junit test case, mvn test.
  a. Mocked Trade respository and Stock repository.
  b. All the 14 unit test case should pass.
  



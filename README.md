Java project which determines type of triangle based on the lengths of three sides taken as user input. 

Class with main method - TriangleTest.java

In this project Factory design pattern is used as there are 3 classes which are sub types of triangle class having common method getTriangleType(). This leads to loose coupling among actual triangle objects, business logic which determines the type of triangle and client side code. Each of the concrete class stores the three sides of triangle and has a method which returns the type of triangle. In factory class we are determining the type of triangle based on the user input and returning specific triangle object.

We are taking user input in variables of double data type so that we can have input as float point numbers with more precision.   

Invalid user inputs are also handled like length of triangle side is zero or any negative value. If user enters invalid value then program terminates with message indicating invalid user input.
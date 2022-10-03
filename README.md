# Unit-4-More-Object-Concepts
Exercises 4-1 - 4-11

I bet your real proud of yourself. 

ps. Make sure to read the instructions :~)

SlayTeam 2023

Exercise Instructions
-----------------------------------------------
4-1
--
Create a class named FormLetterWriter that includes two overloaded methods named displaySalutation(). The first method takes one String parameter that represents a customer’s last name, and it displays the salutation Dear Mr. or Ms. followed by the last name. The second method accepts two String parameters that represent a first and last name, and it displays the greeting Dear followed by the first name, a space, and the last name. After each salutation, display the rest of a short business letter: Thank you for your recent order. Write a main() method that tests each overloaded method. Save the file as FormLetterWriter.java.

4-2
--
Create a class named Billing that includes three overloaded computeBill() methods for a photo book store.

 - When computeBill() receives a single parameter, it represents the price of one photo book ordered. Add 8% tax, and return the total due.

 - When computeBill() receives two parameters, they represent the price of a photo book and the quantity ordered. Multiply the two values, add 8% tax, and return the total due.

- When computeBill() receives three parameters, they represent the price of a photo book, the quantity ordered, and a coupon value. Multiply the quantity and price, reduce the result by the coupon value, and then add 8% tax and return the total due.

Write a main() method that tests all three overloaded methods. Save the application as Billing.java.

4-3
--
A. Create a FitnessTracker class that includes data fields for a fitness activity, the number of minutes spent participating, and the date. The class includes methods to get each field. In addition, create a default constructor that automatically sets the activity to running, the minutes to 0, and the date to January 1 of the current year. Save the file as FitnessTracker.java. Create an application that demonstrates each method works correctly, and save it as TestFitnessTracker.java.

B. Create an additional overloaded constructor for the FitnessTracker class you created in Exercise 3a. This constructor receives parameters for each of the data fields and assigns them appropriately. Add any needed statements to the TestFitnessTracker application to ensure that the overloaded constructor works correctly, save it, and then test it.

C. Modify the FitnessTracker class so that the default constructor calls the three-parameter constructor. Save the class as FitnessTracker2.java. Create an application to test the new version of the class, and name it TestFitnessTracker2.java.

4-4
--
A. Create a class named BloodData that includes fields that hold a blood type (the four blood types are O, A, B, and AB) and an Rh factor (the factors are + and –). Create a default constructor that sets the fields to O and +, and an overloaded constructor that requires values for both fields. Include get and set methods for each field. Save this file as BloodData.java. Create an application named TestBloodData that demonstrates each method works correctly. Save the application as TestBloodData.java.

B. Create a class named Patient that includes an ID number, age, and BloodData. Provide a default constructor that sets the ID number to 0, the age to 0, and the BloodData values to O and +. Create an overloaded constructor that provides values for each field. Also provide get methods for each field. Save the file as Patient.java. Create an application that demonstrates that each method works correctly, and save it as TestPatient.java.

4-5
--
A. Create a class to hold data about a high school sports team. The Team class holds data fields for high school name (such as Roosevelt High), sport (such as Girls’ Basketball), and team name (such as Dolphins). Include a constructor that takes parameters for each field, and include get methods that return the values of the fields. Also include a public final static String named MOTTO and initialize it to Sportsmanship!. Write an application named TestTeam to instantiate three Team objects with different values, and then display all the data, including the motto, for each object. Save both the Team.java and TestTeam.java files.

B. Create a class named Game. Include two Team fields that hold data about the teams participating in the game. Also include a field for game time (for example, 7 PM). Include a constructor that takes parameters for two Team objects and a time. Write an application named TestGame to instantiate a Game object, then pass the Game to a method that displays the details about the Game.

4-6
--
A. Create a class named Circle with fields named radius, diameter, and area. Include a constructor that sets the radius to 1 and calculates the other two values. Also include methods named setRadius() and getRadius(). The setRadius() method not only sets the radius, but it also calculates the other two values. (The diameter of a circle is twice the radius, and the area of a circle is pi multiplied by the square of the radius. Use the Math class PI constant for this calculation.) Save the class as Circle.java.

B. Create a class named TestCircle whose main() method declares several Circle objects. Using the setRadius() method, assign one Circle a small radius value, and assign another a larger radius value. Do not assign a value to the radius of the third circle; instead, retain the value assigned at construction. Display all the values for all the Circle objects. Save the application as TestCircle.java.

4-7
--
Write a Java application that uses the Math class to determine the answers for each of the following:

- The square root of 37

- The sine and cosine of 300

- The value of the floor, ceiling, and round of 22.8

- The larger and the smaller of the character ‘D’ and the integer 71

- A random number between 0 and 20 (Hint: The random() method returns a value between 0 and 1; you want a number that is 20 times larger.)

Save the application as MathTest.java.

4-8
--
Write a program that declares two LocalDate objects and assign values that represent January 31 and December 31 in the current year. Display output that demonstrates the dates displayed when one, two, and three months are added to each of the objects. Save the application as TestMonthHandling.java.

4-9
--
Write an application that computes and displays the day on which you become (or became) 10,000 days old. Save the application as TenThousandDaysOld.java.

4-10
--
The LocalDate class includes an instance method named lengthOfMonth() that returns the number of days in the month. Write an application that uses methods in the LocalDate class to calculate how many days are left until the first day of next month. Display the result, including the name of the next month. Save the file as DaysTilNextMonth.java.

4-11
--
Create a class named Person that holds the following fields: two String objects for the person’s first and last name and a LocalDate object for the person’s birthdate. Create a class named Couple that contains two Person objects. Create a class named Wedding for a wedding planner that includes the date of the wedding, the names of the Couple being married, and a String for the location. Provide constructors for each class that accept parameters for each field, and provide get methods for each field. Then write a program that creates two Wedding objects and in turn passes each to a method that displays all the details. Save the files as Person.java, Couple.java, Wedding.java, and TestWedding.java.

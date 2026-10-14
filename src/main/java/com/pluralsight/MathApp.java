package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // Question 1:

// declare variables here

// then code solution

// then use System.out.println() to display results

// ex: System.out.println("The answer is " + answer);

// REPEAT FOR NEXT EXERCISE

        /// * declared variables *
        /// Bob's annual salary is $75k
        double bobSalary = 75000.00;
        /// Gary's annual salary is $80k
        double garySalary = 80000.00;
        /// This declares and initializes a variable called highestSalary that finds the higher / max number between
        /// variables bobSalary and garySalary
        double highestSalary = Math.max(bobSalary, garySalary);
        /// This prints, along with a nice string, the variable highestSalary.
        System.out.printf("The highest salary between Bob and Gary is %.2f%n", highestSalary);
        /// The car's price is $24,999.99 , or $25k give or take.
        double carPrice = 24999.99;
        /// The truck's price is $49,999.99 , or $50k give or take.
        double truckPrice = 49999.99;
        /// This declares and initializes a variable called lowestPrice that finds the lowest / min number between
        /// variables carPrice and truckPrice
        double lowestPrice = Math.min(carPrice, truckPrice);
        /// This prints, along with a nice string, the variable lowestPrice.
        System.out.printf("The lowest price between the car and the truck is %.2f%n", lowestPrice);
        /// This is the radius of a given circle - 7.25 (assuming inches)
        double radiusOfCircle = 7.25;
        /// This calculates the area of the given circle, using A = pi * r^2
        double areaOfCircle = Math.PI * Math.pow(radiusOfCircle, 2);
        /// This prints the radius and calculated area, along with a nice string, from variables radiusOfCircle and
        /// areaOfCircle
        System.out.printf("The area of the circle with radius %.2f is %.2f%n", radiusOfCircle, areaOfCircle);
        /// My variable for finding the square root is called number and its value is 5.0
        double number = 5.0;
        /// This calculates the square root of variable number
        double squareRootOfNumber = Math.sqrt(number);
        /// This prints the variable number and the calculated square root from variable squareRootOfNumber
        System.out.printf("The square root of %.1f is %.4f%n", number, squareRootOfNumber);
        /// The variables I created for points (5, 10) are called x1 and y1
        double x1 = 5, y1 = 10;
        /// The variables I created for points (85, 50) are called x2 and y2
        double x2 = 85, y2 = 50;
        /// This calculates the distance between the points, or the variables x1, y1 and x2, y2
        double distance = Math.hypot(x2 - x1, y2 - y1);
        /// This prints that calculation in a nice displayed string.
        System.out.printf("The distance between points (5, 10) and (85, 50) is %.2f%n", distance);
        /// I assigned -3.8 to variable negativeNum, as a double
        double negativeNum = -3.8;
        /// I assigned the calculation that would strip away the negative sign to variable absoluteValue, as a double
        double absoluteValue = Math.abs(negativeNum);
        /// This prints the calculation to find the absolute value in a nice displayed string.
        System.out.printf("The absolute value of %.1f is %.1f%n", negativeNum, absoluteValue);
        /// I assigned the variable randomNum to call the random ability from public library Math
        double randomNum = Math.random();
        /// This prints that random number in a nice string.
        System.out.printf("A random number between 0 and 1 is: %f%n", randomNum);
        /// These are my declared variables for calculating how many minutes are in 24 days.
        int numberOfDays = 24;
        int hoursInDay = 24;
        int minutesPerHour = 60;

        /// This is the calculation of the minutes
        double totalMinutes = numDays * hoursInDay * minutesPerHour;
        /// Here I convert to long to get a human readable number (typecasting)
        long totalMilliseconds = (long) totalMinutes * 60 * 1000;

        System.out.printf("There are %.2f minutes in %d days", totalMinutes, numberOfDays);
        System.out.printf("There are %d milliseconds in %d days", totalMilliseconds, numberOfDays);

    }
}

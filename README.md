To run both of these projects, you will need to download the latest version of Java SE or Java JRE. Java SE can be downloaded from the link below.
https://www.oracle.com/technetwork/java/javase/overview/index.html

If you want to run the program on an IDE, you should be able to copy the contents of the folders into the IDE and then run the program.

If you want to compile the program on the command prompt, you will have to change the directories using
    javac filenamehere.java
   
So long as you have the latest version of Java, there should be no errors. You can then run the programs using the java command. For example:
  java Helloworld
  
  
The first project, Java_Lab_3a, is a simple calculator program that runs similarly to a four function calculator. This program needs to be run from the command prompt due to how the input is set up.

To run the program, you need to input three (3) arguments. The arguments must have spaces inbetween them in order to work. For example:
  java Java_Lab_3a.jar 3 + 3
Will return
  3.0 + 3.0 = 6.0
  
The program will not accept more than or less than three arguments. Doing so will result in the program returning an error. If you do not put space inbetween arguments, the program will interpret it as you having not put in enough arguments. For example:
  java Java_Lab_3a.jar 3+3
Will return
  Error: Too few arguments.
  
To use addition, your input should look like
  java Java_Lab_3a.jar 3 + 3
Which will return
  3.0 + 3.0 = 6.0
  
To use subtraction, your input should look like
  java Java_Lab_3a.jar 3 - 3
Which will return
  3.0 - 3.0 = 0.0
  
To use multiplication, your input should look like
  java Java_Lab_3a.jar 3 X 3
Which will return
  3.0 * 3.0 = 9.0
  
A * cannot be used as the operator for the input and the X must be capitalized.

To use division, your input should look like
  java Java_Lab_3a.jar 3 / 3
Which will return
  3.0 / 3.0 = 1.0
  
If you divide by 0, the program will return an error.


The second program, Java_Lab_2b, can be run in the IDE as well as the command prompt. The program will ask for you to input a number in dollars and cents. For example:
  Input the total in dollars and cents: 
  9.99
  
The program's output will return the value in how many dollars and cents it takes to reach the total. For 9.99, the output would be

  Dollars: 9
  Half-dollars: 1
  Quarters: 1
  Dimes: 2
  Nickles: 0
  Pennies: 4
  
If you do not add any cents, the program will only return the dollar value. For example, 9 returns

  Dollars: 9
  Half-dollars: 0
  Quarters: 0
  Dimes: 0
  Nickles: 0
  Pennies: 0

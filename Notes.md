* What is a program ?
It is a set of instructions which act as input to the computer and produce some output.

* Algorithm
It is a set of steps or instructions to be followed to complete any task.

* Source code
It is the actual text that is used to construct the program using the language of your choice.

* Programming language
The language in which we communicate with the computers
Example: Java, C, C++, Python, Javascript
* High level languages: Java, C++
* Low level languages: Assembly, which are closer to machine language

* Compiler
Compiler is a software program which converts our source code into binary language or byte code which is called machine language.

* Binary language:
Binary consists of 0 and 1. We can express everything in the form of 0s and 1s.

Decimal number system to Binary number system:

6 / 2 = 0
3 / 2 = 1
1 / 2 = 1
0

6 in binary is 110

14 / 2 = 0
7 / 2 = 1
3 / 2 = 1
1 / 2 = 1
0

14 in binary is 1110

28 / 2 = 0
14 / 2 = 0
7 / 2 = 1
3 / 2 = 1
1 / 2 = 1
0


28 in binary is 11100

* Binary number system to decimal number system

1110 = 0 * 2^0 + 1 * 2^1 + 1  * 2^2 + 1 * 2^3
	 = 0 + 2 + 4 + 8
	 = 14

1010 = 0 * 2^0 + 1 * 2^1 + 0 * 2^2 + 1 * 2^3
	 = 0 + 2 + 0 + 8
	 = 10

1011 = 1 * 2^0 + 1 * 2^1 + 0 * 2^2 + 1 * 2^3
	 = 1 + 2 + 0 + 8
	 = 11

Any number raised to the power of 0 is 1. 66^0 = 1, 923^0 = 1


* Java

javac -version or java -version
https://www.java.com/en/download/manual.jsp

IDE - Integrated development environment. Intellij, Eclipse, Vscode
Text editors - sublime text, notepad++

* How to run java program
- Install java from https://www.java.com/en/download/manual.jsp or refer any article or youtube video
- Create HelloWorld.java file and write source code
- Open command prompt or terminal: 
	for windows: press win+r, in the dialog write cmd and press enter, a black screen should appear
- Switch to the folder in which java file is present in cmd using cd command
- javac HelloWorld.java
- java HelloWorld
- Output should appear

- Full Stack web development
- Front end: UI/UX, user interface or user experience
	technologies: HTML, CSS, Javascript, React, Angular

- Back end: The logic, the state management, the database resides in back end
	technologies: java, Node.js, Python (Django), PHP, 
	databases: MongoDB, Mysql, dynamoDB

MERN stack is full stack - MongoDB, ExpressJs, React, Nodejs

* Storage:
* Primary storage: Processes or programs running on our computer take space in primary storage. This is temporary storage. RAM is an example.
* Secondary storage: Permanent storage like hard disks

Units of storage:
Bit: means binary digit, means 0 or 1
Byte: 8 bits
1 kiloByte: 1024 bytes
1 MegaByte: 1024 kilobytes

* Variables
Variable is a container or a space holder for the value stored in the memory.
x = "text"

* data types
All kinds of values that we can store in a variable is called data. Data used in program can be of different types.
Data types can be whole numbers, numbers, decimal numbers, characters or some text.

Data types in java:

byte: it stores integers in the range of -128 to 127
short: it stores integers in the range of -32,768 to 32,767
int: it stores integers in the range of -2,147,483,648 to 2,147,483,647
long: it stores integers in the range of -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

float: it stores decimal numbers upto 6-7 decimal places
double: it stores decimal numbers upto 15 decimal places

char: it stores characters, 'a', 'y', '9', '?', ' ', '0', '-'
string: it stores words or sentences like "hello world", "newton school"

boolean: it stores true or false

data types 			size		default	
byte				1 byte 			0
short				2 bytes 		0
int 				4 bytes 		0
long 				8 bytes 		0L
float				4 bytes 		0.0f
double 				8 bytes 		0.0d

char 				2 bytes  		\u0000 (null character)		
boolean				1 bit 			false


* Operations and operators

a + b -> we are performing addition which is an operation.

In an operation, there are operators and operands.
Here, + is an operator
a and b are operands

* Types of operators:

* Unary operators:
Operators which only need one operand.

pre increment: ++a -> first increment the value and then use

post increment: a++ -> first use and then increment

pre decrement: --a -> first decrement the value and then use

post decrement: a-- -> first use and then decrement

Logical Not: ! -> it is used for inverting a boolean value
!true = false

* Arithmetic operators:
Addition: +
Subtraction: -
Multiplication: *
Division: /
Modulo: % -> gives remainder


* Relational operators:
>, <, >=, <=, 

10 > 5 -> true
10 < 5 -> false

10 >= 10 -> true

Equal to: ==
5 == 5 -> true
5 == 3 -> false

Not equal to: !=
5 != 5 -> false
5 != 6 -> true


* Logical operators:

Logical AND (&&): this applies on two boolean operands

	0 && 0 = 0
	0 && 1 = 0
	1 && 0 = 0
	1 && 1 = 1

	false && false = false
	false && true = false
	true && false = false
	true && true = true

Logical OR (||): this applies on two boolean operands

	0 || 0 = 0
	0 || 1 = 1
	1 || 0 = 1
	1 || 1 = 1

	false || false = false
	false || true = true
	true || false = true
	true || true = true

Assignment operators:

	= is assignment operator
	+=
	-=
	*=
	/=
	%=

* Shift operators

* Bitwise operators



* Input/Output:


* Control Structures:

* Conditional statements:

if-else ladder:

if (some condition is true) {
	....
}
else if (second condition is true) {
	....
}
else if (third condition is true) {
	....
}
.
.
.
.
.
else {
	...
}


* Switch case:

Switch case is similar to if else but it reduces the complexity of if-else ladder

switch (condition) {
	case 1:
		...
	case 2:
		...
	case 3:
		...
	.
	.
	.
	default:
		...
}

break in switch case is needed to only run one case and the break out of switch


* Ternary operator:

It takes three operands
It is a short form to write if-else

condition ? if true do this : if false do this


int age = 25;
age >= 18 ? print("You are eligible to vote") : print("You are not eligible to vote")

if (age >= 18) {
	print("You are eligible to vote")
}
else if (age <= 12) {
	print("You should focus on studies")
}
else {
	print("You are not eligible to vote")
}


* Type conversion:

* implicit or Upward conversion:

byte < short < int < long < float < double

byte b = 10;
 // works

int a = 10;
float f = a; // f will be 10.0

short s = 98;
long l = s;int i = b;

float f = 5.32;
double d = f;


* Explicit or Downward conversion

float f = 3.14;
int i = f; // compilation error

int i = (int) f; // 3

int i = 129;
byte b = i; // compilation error

byte b = (byte) i;

b will be -128

-128 to 127

-128, -127, -126, -125, -124.......0..........125, 126, 127+3




128 -> -128
129 -> -127
130 -> -126
131 -> -125

132 -> -124
200 -> ??


double d = 4.56;
float f = (float)d;


* Loops 

We need loops to execute a line of code or lines of code many number of times.

* While loop:

while (condition) {
	....
	update statement
}

How while loop works ?
It keeps on executing till the condition becomes false


* for loop

for (initialise the variable; condition; update statement) {
	.....
}

* do while loop

do {
	// some code

	update statement
}
while (condition);

do while loop gets executed at least once 


* Functions:

calculate 2x + 5

x = 5
o/p= 15

x = 6
o/p= 17

x=7
o/p= 19

functions are a reusable chuck or piece of code that we can use over and over again instead of wrting the same code multiple times.

* Function definition or declaration:


return_type functionName (dataType var1, dataType var2.....) {
	
	// function body
	....

	 return statement
}

return_type is the data type of  the output the function produces

dataType var1, dataType var2..... -> they are known as function arguments or function parameters

A function can accept any number of arguments/parameters or it can even accept zero parameters.

return statement marks the end of the function.


* function to calculate sum of two numbers:

int getSum(int a, int b) {
	int sum = a + b;

	return sum;
}

float getSum (float a, int b) {
	float sum = a + b;

	return sum;
}

* Calling a function

int sum = getSum(5, 3); // 8

int sum2 = getSum(9, 7); // 16

int sum3 = getSum(4, 8); // 12


int calculate(int x) {
	int result = 2 * x + 5;

	Systen.out.println(result);

	return result;
}


int result1 = calculate(8); // 21

int result2 = calculate(6); // 17

int result3 = calcualte(4); // 13

int result4 = calculate(7);



int calculate() {
	return 2;
}

what is void?
If a function returns nothing, its return type will be void 
void means empty.








































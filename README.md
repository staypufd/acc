#ACC Summer 2014 Java Course

#Books
- The Java Tutorial: A Short Course on the Basics (5th Edition)
	- http://www.amazon.com/The-Java-Tutorial-Course-Edition/dp/0132761696
- Murach's Java Servlets and JSP, 3rd Edition 
	- http://www.amazon.com/Murachs-Java-Servlets-JSP-Murach/dp/1890774782/ref=sr_1_2?s=books&ie=UTF8&qid=1405362741&sr=1-2&keywords=java+servlets

#Java 1 Class (24 hrs)
## Syllabus
###Week 1 (4 day week)
####Module 1 (3 hrs)
	- What is Object Oriented Programming?
	- What are Objects?
	- Classes
	- Instance variables
	- toString method
	- Creating Java Project in Eclipse
	- Vehicle Lab
	

	
####Module 2 (3 hrs)
	- Methods - What are they?
	- Polymorphism
	- Animal Talk Lab
	
####Module 3 (3 hrs)
	- Constructors
		- Default Constructor (no arguments)
		- Constructors serve as instance initializers
		- Default Initializers Pattern
	- Constructors Lab
	- Getters and Setters
	- Constructors Lab
####Module 4 (3 hrs)
	- Encapsulation
	- Access Modifies (package, public,and private)
	- Class variables
	- Class methods
	- Encapsulation Lab

###Week 2 (4 day week)
####Module 5 (3 hrs)
	- Inheritance
	- Access Modifies (protected)
	- Shapes Lab
	
####Module 6 (3 hrs)
	- Arrays (built-in and ArrayList)
	- Packages
	- Access Modifies (package)
	
####Module 7 (3 hrs)
	- Overloading methods
		- Show System.out.println method Overloading
	- Overriding methods
		- Only occurs in subclassing
	- Overloading has to do with specializing a method to take different types of arguments
	- Overriding has to do with specialing a method in different classes in a inheritance heirarchy
	
####Module 8 (3 hrs)
	- End of Java2 Lab
	
## Projects
	- Composition
	- ArrayList
	- ArrayList-Expanded
	- CookieStore
	- CookieStore-Inheritance
	
## Readings
	- Object Oriented Programming Concepts
		- http://docs.oracle.com/javase/tutorial/java/concepts/index.html
	- 

##Instructor Notes

###Constructors Notes
	- A default constructor is added to a class if not specific constructors are declared. Instance variables are initialized to there default initial values.
		- http://docs.oracle.com/javase/specs/jls/se7/html/jls-4.html#jls-4.12.5

####Vehicle Lab
	- Add classes for vehicle classes Car, Truck, BigRig, Submarine, AirPlane, Boat and Bulldozer
	- Add instance varialbles to them for 
		- color (a String)
		- weight (a Float)
		- running (a boolean)
		- name (a String)
	- Add a toString method
		
#### Animal Talk Lab
	- Add classes for Dog, Cat and Dolphin
	- Add method speak() to all of them
		- Should return a String instance for how that animal speaks
	- Add method eat() to all of them

###Constructors Lab
	- Add constructors to your vehicle and animals classes that take same number and types of arguments as your instance variables
	- Add constructors that call the fully general constructor and provide default values to that constructor for some of the args
	
###Encapsulation Lab
	- Make sure your classes have Getters and Setters for all instance variables (ivars)
	- Make sure your instance varialbes are either package, protected or private and know the difference for each one.
	
###Shapes Lab
	- Shape class
	- Rectangle class, Triangle class, Circle class
	- Square class as a subclass of Rectangle
	- Add a calcArea() method to all the classes

###End of Java2 Lab
	- Tic Tac Toe game
	- Card Deck
	- D&D Dice (My favorite)

#Java 2 Class 
## Syllabus
###Week 1 (4 day week)
####Module 1 (3 hrs)
	- Interfaces
	- Designing with Composition, Inheritance and Interfaces
	
####Module 2 (3 hrs)
	- Collections
		- Collection Interfaces List, Map and Set
	- TreeSet, TreeMap
	- ArrayList, ArrayMap
		
####Module 3 (3 hrs)
	- Enum
		- Simple Enums
			- Ordinal values
		- Enum classes
			- Customer Enum constructors
			- Custom Enum behaviores
	- Enum Lab

		
####Module 4 (3 hrs)
	- What is an Exception?
	- Types of Exceptions in Java
		- Exception
		- Error
		- Runtime Exception
	- Try and catch
		
###Week 2 (4 day week)

####Module 5 (3 hrs)
	- Throwing Exceptionsn
	- Method signature for throwing a exception
	- Debugging an Exception
	- Exception Handling Lab
	
####Module 6 (3 hrs)
	- Scanner class usage
		- hasNext
	- REPL's in Java
		- Read, Eval, Print and Loop
	- Scanner Lab
	
####Module 7 (3 hrs)
	- Regular Expressions (RegEx)
	
####Module 8 (3 hrs)
	- StringFormat class
	- printf method on System.out
## Projects
	- WorldCupOfJava
	- GreetingShapes
	- TestSystemOutPrintln
	- CollectionsIntro
	- CollectionsFilterLab
	- Enums
	- ExceptionHandlingIntro
	- ExceptionHandling-Expanded
	- Scanner
	- StringManipulationAndFormating
## Readings
	- CRC - Class Responsibility Collaborators
	    - A Laboratory For Teaching Object Oriented Thinking
	    		- http://c2.com/doc/oopsla89/paper.html
		- Object Design: Roles, Responsibilities, and Collaborations
			- http://www.amazon.com/Object-Design-Roles-Responsibilities-Collaborations/dp/0201379430/ref=la_B001IQXNWC_1_1?s=books&ie=UTF8&qid=1405365849&sr=1-1
			- My favorite
		- Using CRC Cards: An Informal Approach to Object-Oriented Development
			- http://www.amazon.com/Using-CRC-Cards-Object-Oriented-Development/dp/0133746798/ref=sr_1_1?s=books&ie=UTF8&qid=1405365731&sr=1-1&keywords=CRC+cards
		- The CRC Card Book
			-http://www.amazon.com/CRC-Card-Book-David-Bellin/dp/0201895358/ref=sr_1_2?s=books&ie=UTF8&qid=1405365731&sr=1-2&keywords=CRC+cards
		- Responsiblity Base Modeling
			- http://alistair.cockburn.us/Responsibility-based+modeling
	- Basic Computer Games 
		- http://www.atariarchives.org/basicgames/

##Instructor Notes
	- Scanner Lab - ???

#Java 3 Class Info & Projects
##Syllabus
	- HTML - A Short History
	- Basic HTML Tags
	- More HTML Tags
	- CSS
	- HTTP - An Intro
	- Servlets
	- JSP's
	- JSTL

##Instructor Notes
###HTML History
	- ARPANET
		- DOC Funded
	- TCP/IP
	- Internet
	- Tim Berners Lee
		- HTTP - Hyper Text Transfer Protocol
		- NeXT Machine
		- First web server
		- First browser
		- Open source
		- Hyper Text
		- Created the World Wide Web (www)
	- Mo-her of all Demos
		- https://www.youtube.com/watch?v=yJDv-zdhzMY&feature=kp
		- Showed so many things before there time
			- mice
			- hypertext
			- video conferencing
			- outlining
			- video overlays & blending
			- semantic data
		- Inspired Xerox Parc and others
	- Mosaic
		- Marc Andreson
			- Co-founder of Netscape with Jim Clark (of Standford and Xerox Parc - creator of VHDL)
		- Microsoft created IE from Mosaic base
	
###Basic HTML Page
	- Tags
		- DOCTYPE declaration for HTML5 
		- head
		- title
		- body
		- header (h1 - h5)
		- paragraphs
		- lists (ul, ol)
		- images
		- Colors and Color Names
		- HTML Entities (special characters) < must be encoded as &lt and > must be encoded as &gt etc.
	
###More HTML 
	- More Tags
		- style
		- link "<a>" tag
		- comments
		- formatting tags
		- div
		- span
		- form
		- input (only works in form tag)

###CSS
	- ???

##Additional Resources
	- W3Schools Web Tutorials - http://www.w3schools.com/


#ACC Additional Materials

##Copy Constructor
- http://java-journal.blogspot.com/2013/02/how-to-write-copy-constructor-using.html
- http://www.artima.com/intv/bloch13.html  (Very good advice from one of the Masters of Java

##Numbers & Strings
- http://docs.oracle.com/javase/tutorial/java/data/index.html

##StringBuilder
- http://docs.oracle.com/javase/tutorial/java/data/buffers.html

##Collections
- http://docs.oracle.com/javase/tutorial/collections/
- http://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html

##Enums
- http://docs.oracle.com/javase/tutorial/java/javaOO/enum.html

##Scanner and Formatters
- http://docs.oracle.com/javase/tutorial/essential/io/scanning.html
- http://docs.oracle.com/javase/tutorial/essential/io/formatting.html

##Exceptions
- http://docs.oracle.com/javase/tutorial/essential/exceptions/index.html

##RegEx 
- http://refcardz.dzone.com/refcardz/regular-expressions#refcard-download-social-buttons-display

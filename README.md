# wgu-c169-vgt1
VGT1 Task 1  Scripting and Programming - Applications Project — C169

## Requirements

* Content reflects attention to detail, is organized, and focuses on the main ideas as prescribed in the task or chosen by the candidate. Terminology is pertinent, is used correctly, and effectively conveys the intended meaning. Mechanics, usage, and grammar promote accurate interpretation and understanding. 
* The candidate correctly provides personal information in the last item of the table above. 
* The candidate provides a program that uses the information in the table above to create an ArrayList of Student objects.
* The candidate provides appropriate instance variables that describe each student for the given points.
* The candidate correctly provides an accessor in the Student class for each instance variable from part B1.
* The candidate correctly provides a mutator in the Student class for each instance variable from part B1.
* The candidate provides a constructor in the Student class using all of the input parameters. 
* The candidate correctly provides a print() method in the Student class to print specific student data using accessors.
* The candidate correctly provides a public static void remove(studentID) that removes students from the roster by student ID. 
* The candidate provides public static void print_all() that prints a complete tab-separated list of student data using accessor methods.
* The candidate provides public static void print_average_grade(String studentID) that correctly prints a student’s average grade by student ID.
* The candidate provides public static void print_invalid_emails() that verifies student e-mail addresses and displays all invalid e-mail addresses to the user.
* The candidate provides evidence of the program’s required functionality by attaching the output along with the entire project folder. 
* If the candidate uses sources, the candidate provides appropriate in-text citations and references with no readily detectable deviations from APA style, OR the candidate does not use sources.

## Results Output

This is also included in the OutputResults.txt file in this repository

```
/Library/Java/JavaVirtualMachines/jdk-12.0.1.jdk/Contents/Home/bin/java "-javaagent:/Users/dberry/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/192.7142.36/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=61659:/Users/dberry/Library/Application Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/192.7142.36/IntelliJ IDEA.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Users/dberry/IdeaProjects/VGT1/out/production/VGT1 com.wgu.c169.Roster
Print All Students Method:
Student ID: 1	First Name: John	Last Name: Smith	Email Address: John1989@gmail.com	Age: 20	Grades:[88, 79, 89]
Student ID: 2	First Name: Suzan	Last Name: Erickson	Email Address: Erickson_1999@gmailcom	Age: 19	Grades:[91, 72, 85]
Student ID: 3	First Name: Jack	Last Name: Napoli	Email Address: The_lawyer99yahoo.com	Age: 19	Grades:[85, 84, 87]
Student ID: 4	First Name: Erin	Last Name: Black	Email Address: Erin.black@comcast.net	Age: 22	Grades:[91, 98, 82]
Student ID: 5	First Name: Daniel	Last Name: Berry	Email Address: dberry8@wgu.edu	Age: 38	Grades:[91, 84, 98]

Print Invalid Email Addresses:
Suzan Ericksonhas an invalid email address (Erickson_1999@gmailcom)
Jack Napolihas an invalid email address (The_lawyer99yahoo.com)

Output Average Grade For Each Student:
John Smith: 85
Suzan Erickson: 82
Jack Napoli: 85
Erin Black: 90
Daniel Berry: 91

Remove Student with ID of 3:
Student with ID 3 was not found.
A student with ID 3 was not found.

Process finished with exit code 0

```

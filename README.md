
QA Assessment Test - API Test cases for Mobiquity
#Automation - Compilation,Build and Assumptions:

1.Using Windows machine 
2.Node,Maven,Java,Intellij installed and all configured correctly


#################Task###################### 
●  Perform the validations for the comments for the post made by a
specific user

###############Flow to be tested############### 

● Search for the user with username “Delphine”.
● Use the details fetched to make a search for the posts written by the
user.
● For each post, fetch the comments and validate if the emails in the
comment section are in the proper format.
● Think of various scenarios for the test workflow, all the things that
can go wrong. Add them to test coverages

#### Achievements ##############
● Created 1 feature file using Gherkin syntax
● Created step definitions and link these to the feature file and implemented code that links both pieces up
●  Created TestRunner to run test :
..../src/test/java/platforms/api/Api_runner.java
● Searched for the user with username “Delphine”
● Used the details fetched to make a search for the posts written by the
user
● For each post, fetch the comments, validated if the emails in the
comment section are in the proper format

#### Steps to run ##############
1.Run the test by Running the Api_runner
2.View the reports generated under .../target/cucumber-reports/ApiReports/ just open api.html in any browser, the framework used Extent Reports to record the test execution reports. 
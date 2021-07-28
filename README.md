Runtime Version : 1.0
Junit4 is used in this program for unit testing.
<root url="jar://$MAVEN_REPOSITORY$/junit/junit/4.12/junit-4.12.jar!/" />
<root url="jar://$MAVEN_REPOSITORY$/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar!/" />

Here's the file to provide detailed instructions on writing & execution of this program.

Firstly, my system runs the Ericsson's internal git repo and 
hence it was not feasible for me to access personal git hub cloning, versioning etc.

However, please find below a step-by-step guide to reach the solution I programmed.
1. Started Product class as a POJO holding number of items, price of each item & province/state code.
   'double' is decided as best data field to store price of each item & eventually the total cost as it can 
   preserve values of upto 15-16 decimals with precision.
2. Generated parametrized constructor along with toString.
3. Now compute basic methods for calculation of state/province tax & volume based discounts.
4. Total cost computation would be deduction of discount & addition of tax to final product.
5. Now, these values are not computed based on console/file input, so writing a block of predefined values,
   which computes & displays final cost in various scenarios.
6. Collect these scenarios under a separate class PricingProblem to run as package.
7. Started writing all-positive testcases for the solution with minimal additional packages to Test folder.
8. Now started thinking of some corner cases & exception handling for ex in cases of input errors.
9. Handled the exception cases in program code in parallel with the test case design.
10. Covered maximum possible test scenarios for the given challenge.
11. Had some more time, so added some runtime input collection steps including scanners.
    These are hidden under block comments in PricingProblem.
    You can use it if you wish to enter input through console i.e. at runtime :)

Execution:
Run the PricingProblem on command prompt using javac & java commands.
Alternatively, you can also run the TestCases using the above commands.
Note: Only the positive testcases will run when running by the file. So pls run each testcase individually.
You can always respond back on my email for any support/assistance. Happy to help!

Thank you!
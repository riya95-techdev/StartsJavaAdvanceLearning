/*
Question 3: filter and map
You have an Optional<String> containing a user input. You need to validate and transform this input.
Create an Optional<String> from the user input.
Use the filter method to check if the string has a length greater than 5. If it doesn't, the Optional should become empty.
Use the map method to convert the filtered string to uppercase.
Finally, use ifPresent to print the final, transformed string. If the original string was too short, nothing should be printed.
Example inputs:
String input1 = "longstring"; // Should be transformed and printed
String input2 = "short"; // Should not be printed
 */

import java.util.Scanner;
import java.util.Optional;
public class OptionalChain {
    public static void main(String[] args) {
        Scanner riya = new Scanner(System.in);
        System.out.print("Enter a string : ");
        Optional<String> userInput = Optional.ofNullable(riya.nextLine());

        userInput.filter(s -> s.length()>5)
                .map(String::toUpperCase)
                .ifPresent(result->{
                    System.out.println("Filtered and mapped value : "+result);
                });
    }
}

import java.util.Optional;
public class OptionalMethodsPractice {
    public static void main(String[] args) {

        /*
        Question 1: orElse and ifPresent
         You have a String variable that might be null.
         Create an Optional<String> using Optional.ofNullable.
         If the Optional contains a value, print a message saying "Value found: [the value]". Use ifPresent.
         If the Optional is empty, print a message "No value found". Use orElse to provide a default string for printing.

         Example input:
         String value1 = "Hello Optional";
         String value2 = null;
         */

        String value1= "hello optional";
        String value2 = null;

        Optional<String> oneValue = Optional.ofNullable(value1);
        Optional<String> twoValue = Optional.ofNullable(value2);

        //ifPresent(Consumer)
//        oneValue.ifPresent(v1-> System.out.println("Value Found : "+v1));//output : hello optional
//        twoValue.ifPresent(v2 -> System.out.println("No value found!")); //no output

        //orElse
        String valueChecker1 = oneValue.orElse("No value found!");
        System.out.println(valueChecker1); //hello optional
        String valueChecker2 = twoValue.orElse("No value found!");
        System.out.println(valueChecker2); //No value found!
    }
}

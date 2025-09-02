import java.util.Optional;
import java.util.SimpleTimeZone;

public class AppRunner {
    public static void main(String[] args) {
        //Optional practice
        String name= "Riya";
        Optional<String> optionalName = Optional.of(name);
        System.out.println(optionalName.get());

//        String surname = null;
//        Optional<String > optionalSurname = Optional.of(surname);
//        System.out.println(optionalSurname.get());

        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional.isEmpty());

        Optional<String > optionalDifName = Optional.ofNullable("BOB");
        if(optionalName.isPresent()){
            System.out.println("THE value is "+ optionalDifName.get());
        }

        Optional<String> optionalNull = Optional.ofNullable(null);
        if(optionalName.isEmpty()){
            System.out.println("The value is empty");
        }
    }
}

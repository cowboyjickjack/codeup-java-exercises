import java.lang.reflect.Array;

public class ExceptionsHandlingLecture {
    public static void main(String[] args) {

        try {
            int[] numbers = {1, 2, 3};
            // since only an array of 3 numbers, it'll say it's 'out of bounds', and throw an error
            System.out.println(numbers[99]);

            // you can also throw your own error
            throw new Exception("Something bad happened.");

            // in java, you need to name parameter types, and an error in java is an Exception
            // you can also throw multiple catches
            // this is referring to the original error we got with the out of bound integer
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage()); // .getMessage will only show the message
            e.printStackTrace(); // shows up the full details of the exception, but not to where it'll kill the app
        }

        catch (Exception e){
            // after you throw an exception, you can sout 'e'
            System.out.println(e);


            // you'll never see this, bc the error kills the application. So we need logic that
            // says, ok, do this instead!
            System.out.println("After the error happens...");
            // so now that we have logic, the error occurred, but the app went on :)

            // finally will run NO MATTER WHAT
            // hasn't really been seen in the wild
        } finally {
            System.out.println("This is my finally block");
        }

        System.out.println("This is after the try/catch/finally");

        // you can also have multiple try/catches in a method
    }
}

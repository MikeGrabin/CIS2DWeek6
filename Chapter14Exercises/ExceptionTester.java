import java.io.*;

public class ExceptionTester {

    public static void main(String[] args) {
        System.err.println("In main: calling Method1.");
        Method1();
        System.err.println("In main: returned from Method1.");
    }

    public static void Method1() {
        try {
            System.err.println("\tIn Method1: calling Method2.");
            Method2();
            System.err.println("\tIn Method1: returned from Method2.");
        } //Return the catch exceptions
          //Print each method
        catch (FileNotFoundException e) {
            System.err.println(e.toString());
        }
    }

    public static void Method2() throws FileNotFoundException {
        System.err.println("\t\tIn Method2: calling Method3.");
        Method3();
        System.err.println("\t\tIn Method2: returned from Method3.");
    }

    public static void Method3() throws FileNotFoundException {

            System.err.println("\t\t\tIn Method3: Entering.");
            //Add code to throw an exception here.
        RandomAccessFile in = new RandomAccessFile("products.ran", "r");
            System.err.println("\t\t\tIn Method3: Exiting.");
        }
}

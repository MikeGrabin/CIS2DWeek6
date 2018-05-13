import java.io.*;

public class ResourcesTester {

    public static void main(String[] args) {
        String s1 = readLineWithResources();
        String s2 = readLineWithFinally();
    }

    public static String readLineWithResources() {
        System.out.println("Starting readLineWithResources method.");
        //Change to try-with-resources pg: 439
        try (RandomAccessFile in = new RandomAccessFile("products.ran", "r")) {
            String s = in.readLine();
            return s;
        } catch (IOException e) {
            System.out.println(e.toString());
            return null;
        }
    }

    public static String readLineWithFinally() {
        System.out.println("Starting readLineWithFinally method.");
        //declare RandomAccessFile object
        RandomAccessFile in = null;
        try {
            in = new RandomAccessFile("products.ran", "r");
            String s = in.readLine();
            return s;
        } catch (IOException e) {
            System.out.println(e.toString());
            return null;
        }//finally block pg: 437
        finally {
            try {
                if (in != null) /*(in == null)*/ {
                    in.close();
                    System.out.println("File Closed");
                } // if condition is true
                else {
                    System.out.println("File Not Found");
                }
            } catch(IOException e) {
                    System.out.println("Unable to Close");
                }
            }
    }
}


























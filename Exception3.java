

package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Exception3
{
    public static void main(String[] args)  {
        int a = 10, b =0;
        int c;
        try {
            String str = null;
            System.out.println(str.length());
            c = a/b;
            System.out.println(c);


            System.out.println("i give the correct value so , Skipped catch block");

        }

        catch (NullPointerException e){
            System.out.println("Null pointer exception error is occured");
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic error is occured");
        }


        catch (Exception e){
            System.out.println("Exception is occured");
        }
        finally {
            System.out.println("End of the programme");
        }





    }
}
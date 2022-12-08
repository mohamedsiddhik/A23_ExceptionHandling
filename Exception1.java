
package exceptionHandling;

public class Exception1
{
    public static void main(String[] args) {
        try {                                            //ArithmeticException
            int a = 10, b = 0, c;
            c = a / b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException : cant divided by zero");
        }
        try {
            String str = null;                          //NullPointerException
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("NullPointerException Error is occured");
        }
        try {                                               //NumberFormatError
            int num =Integer.parseInt("Hello");
            System.out.println(num);
        }catch (NumberFormatException e){
            System.out.println("Number Format Error will occured");
        }
        try {                                                //ArrayIndexOutOfBoundsException
            int a[]=new int[5];
            a[8]=9;
//            System.out.println(a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception will occured ");
        }







        System.out.println("End of the programme");
    }
}
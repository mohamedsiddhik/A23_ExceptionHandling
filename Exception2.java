

// nested try
package exceptionHandling;

public class Exception2
{
    public static void main(String[] args) {
        try {
            try {
                int num = Integer.parseInt("hiii");
                System.out.println(num);
            }catch (NumberFormatException e){
                System.out.println("Number Format Exception");
            }try {
                int a[] = new int[5];
                a[7]=9;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of bounds Exception");
            }
            System.out.println("Other statement");
//            int a=10,b=0;
//            int c;
//            c= a/b;
//            System.out.println(c);
        }catch (Exception e){
            System.out.println("Handled and recovered");
        }
    }
}
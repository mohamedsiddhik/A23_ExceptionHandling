
package exceptionHandling;

public class ThrowException
{
    void voter(int age){
        if (age <=18){
            throw new  ArithmeticException("You are not eligible for voting");
//            System.out.println("You are not eligible for vote");
        }else {
            System.out.println("You are eligible");
        }
    }
    public static void main(String[] args) {
        ThrowException t =new ThrowException();
        t.voter(16);
    }
}
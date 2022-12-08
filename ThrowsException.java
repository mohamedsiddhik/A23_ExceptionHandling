

package exceptionHandling;

import java.io.IOException;

public class ThrowsException
{
    void numCheck(int num) throws IOException,ClassNotFoundException{
        if (num ==1){
            throw new IOException("IOException");
        }
        else {
            throw new ClassNotFoundException("Class Not Found");
        }
    }
    public static void main(String[] args) {
        ThrowsException te = new ThrowsException();
         try {
             te.numCheck(5);
         }
         catch (IOException e){
             System.out.println("IOException error");
         }catch (ClassNotFoundException e){
             System.out.println("ClassNotFoundException error");
         }
         catch (Exception e){
             System.out.println(e);
         }

    }
}
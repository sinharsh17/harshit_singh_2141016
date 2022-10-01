import java.io.FileNotFoundException;
import java.io.IOException;

public class exceptionprac2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try{
            testException(-5);
            testException(-10);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){

        }
    }
    public static void testException(int i) throws FileNotFoundException,IOException {
        if (i < 0) {
            FileNotFoundException myException = new FileNotFoundException("negative integer " + i);
            throw myException;
        }
        else if (i < 10) {
                throw new IOException("only supported for index 0 to 10");
            }
        }
    }

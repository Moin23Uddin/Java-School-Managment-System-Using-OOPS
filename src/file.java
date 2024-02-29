import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class file{

    public static void main(String[] args) {
        File obj=new File( "indexh.txt");
        try {
            obj.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileWriter filebhai=new FileWriter("indexh.txt");
            filebhai.write("Okay this is java course");
            filebhai.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}


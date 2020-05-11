package beginner;

import static core.MyCore.toastln;
import java.io.*;

//Writing file using FileOutputStream.
public class Writer {

    public static void main(String[] args) {
        String path = "C://Users//TANDOH//Desktop//file.txt";
        try {
            try (FileOutputStream fos = new FileOutputStream(path)) {
                int b = 1111;
                fos.write(b);
            }
        } catch (FileNotFoundException e) {
            toastln("FileNotFoundException : " + e);
        } catch (IOException e) {
            toastln("IOException : " + e);
        }
    }

}

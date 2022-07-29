
import java.io.File;
public class file_class {
    public static void main(String[] args) {
        File file = new File("C:/Users/HP/Desktop/secret_msg.txt");
        if(file.exists()) {
            System.out.println("File exists");
            System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
            System.out.println(file.getPath());
            System.out.println(file.getName());
            // file.delete();    // deletes the file
        }
        else {
            System.out.println("File does not exist");
        }
    }
}

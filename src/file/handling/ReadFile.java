package file.handling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws IOException {

        // Creates a file in the JavaDataStructure folder
        File file = new File("Resources/Sample File.txt");
        file.createNewFile();
        System.out.println(file.getAbsolutePath());

        FileReader fr = new FileReader(file);

        BufferedReader br = new BufferedReader(fr);
        String str;
        while((str = br.readLine()) != null) {
            System.out.println(str);
        }

    }

}

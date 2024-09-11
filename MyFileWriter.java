
import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

public class MyFileWriter {
    private static void printTotalFileSize(String... fileNames) {
    
        System.out.println("Total size of all files: ...TBD... bytes");
    }
    public static void main(String[] args) {
        //String data = "Hello, World!";
        // String fileName1 = "example1.txt";
        // String fileName2 = "example2.txt";
        // String fileName3 = "example3.txt";
        // String fileName4 = "example4.txt";
        //String fileName5 = "example5.txt";
        //this is my commit today
        String password = "myPassword";

        // 5. Using Files (java.nio.file)
        String passwordFile = ".notmypassword.txt";
        String regularFile = "secretData.dat";
       
        String hiddenFolder = ".classifiedData";
        String topSecretData = "My password is reall just password";
        try {
            
           // Files.write(Paths.get(fileName5), data.getBytes(StandardCharsets.UTF_8));
            Files.write(Paths.get(passwordFile), password.getBytes(StandardCharsets.UTF_8));
            Path hiddenFolderName = Files.createDirectory(Paths.get(hiddenFolder));
            // Files.write(Paths.get(regularFile), topSecretData.getBytes(StandardCharsets.UTF_8));
            // Files.move(,hiddenFolder.resolve(source.regularFile), REPLACE_EXISTING);
            Path regularFileName = hiddenFolderName.resolve(regularFile);
           Files.write(regularFileName, topSecretData.getBytes(StandardCharsets.UTF_8));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
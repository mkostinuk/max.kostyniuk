package FileWorking;
import java.io.File;

public class FIleCreate {



    public static void FileCreateEncrypted(String newfilePlace) {
        String filepath = newfilePlace + "[ENCRYPTED].txt";


        try {
            File file = new File(filepath);
            boolean isFileCreated = file.createNewFile();
            if (isFileCreated) {
                System.out.println("Файл успішно створено.");
            } else {
                System.out.println("Файл вже існує.");
            }
        } catch (Exception e) {
            System.err.println("Помилка при створенні файла: " + e.getMessage());

        }


    }

    public static void FileCreateDecrypted(String newfilePlace) {
        String filepath = newfilePlace + "[DECRYPTED].txt";


        try {
            File file = new File(filepath);
            boolean isFileCreated = file.createNewFile();
            if (isFileCreated) {
                System.out.println("Файл успішно створено.");
            } else {
                System.out.println("Файл вже існує.");
            }
        } catch (Exception e) {
            System.err.println("Помилка при створенні файла: " + e.getMessage());

        }
    }

    public static String getFileplaceEncrypted(String newFilePlace) {
        return newFilePlace + "[ENCRYPTED].txt";
    }

    public static String getFileplaceDecrypted(String newFilePlace) {
        return newFilePlace + "[DECRYPTED].txt";
    }
}
package FileWorking;
import java.io.FileWriter;

public class FileWrite {


  public  static void WriteEncypt( char[] Encrypt, String filepath) {
        try (FileWriter fileWriter = new FileWriter(filepath)) {
            for (int i = 0; i < Encrypt.length; i++) {
                fileWriter.write(Encrypt[i]);
            }
        }
        catch (Exception e){
            throw new RuntimeException("Помилка запису");
        }
    }
    public  static  void  WriteDecrypt(char[] Decrypt, String filepath){
      try (FileWriter fileWriter= new FileWriter(filepath)){
          for (int i = 0; i < Decrypt.length; i++) {
              fileWriter.write(Decrypt[i]);
          }

      }
      catch (Exception e){
          throw  new RuntimeException("Помилка запису");
      }
    }
}

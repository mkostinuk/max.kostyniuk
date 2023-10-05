package Crypt;

import FileWorking.FileRead;
import FileWorking.FileWrite;

public class BRUTE_FORCE {
    private  String filepath;
    public BRUTE_FORCE(String filepath) {

        this.filepath = filepath;
    }


    public void bruteForceDecrypt() {
        FileRead fileRead = new FileRead(filepath);
        for (int key = 1; key <= 26; key++) {
            CaesarCipher decrypt = new CaesarCipher(fileRead.read(),key);
            char[] decryptedText = decrypt.DECRYPT();
            String newFilePlace = filepath.substring(0, filepath.indexOf('.'));
            String newFilePath = newFilePlace + "-" + key + "[DECRYPTED].txt";
            FileWrite.WriteDecrypt(decryptedText, newFilePath);
        }
    }
}
package CLI;
import Crypt.BRUTE_FORCE;
import Crypt.CaesarCipher;
import FileWorking.FIleCreate;
import FileWorking.FileRead;
import FileWorking.FileWrite;

import java.util.Scanner;

public class Combination {
	private String command;
	private String filepath;
	private int key;

	public Combination(String args[]) {
		try {
			this.command = args[0];
			this.filepath = args[1];
			this.key = Integer.parseInt(args[2]);

		}
		catch (Exception e){
			throw new RuntimeException("Аргументів не знайдено "+ e+ e.getStackTrace());
		}



	}
	public Combination(){
		Scanner scanner=new Scanner(System.in);
	this.command=scanner.nextLine();
	this.filepath=scanner.nextLine();
	this.key=scanner.nextInt();
	}
private  void Connecting() {
	    FileRead fileRead = new FileRead(filepath);
		String newFilePlace = filepath.substring(0, filepath.indexOf('.'));
	CaesarCipher defaultcrypt=new CaesarCipher(fileRead.read(),key);
		if (command.equalsIgnoreCase("ENCRYPT")) {
			FIleCreate.FileCreateEncrypted(newFilePlace);
			FileWrite.WriteEncypt(defaultcrypt.ENCRYPT(), FIleCreate.getFileplaceEncrypted(newFilePlace));
		}
	else if (command.equalsIgnoreCase("DECRYPT")) {
			FIleCreate.FileCreateDecrypted(newFilePlace);
			FileWrite.WriteDecrypt(defaultcrypt.DECRYPT(), FIleCreate.getFileplaceDecrypted(newFilePlace));

		}
	else	if(command.equalsIgnoreCase("BRUTE_FORCE")) {
			BRUTE_FORCE bruteForce=new BRUTE_FORCE(filepath);
			bruteForce.bruteForceDecrypt();

		}
		}

	public static void Start(String[] args){
		if (args.length>0){
			Combination combinationClasses=new Combination(args);
			combinationClasses.Connecting();
		}
		else{
			Combination combinationClasses=new Combination();
			combinationClasses.Connecting();
		}
	}


}


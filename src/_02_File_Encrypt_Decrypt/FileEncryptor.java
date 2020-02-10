package _02_File_Encrypt_Decrypt;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class FileEncryptor {
	// Create a program that takes a message from the user.
	// Use the methods in the String and Character classes to save
	// an encrypted form of the message to a file
	public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Type a message: ");
		String message = scan.next();
		String cipherText = "";
		for (int i = 0; i < message.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(message.charAt(i));
            int keyVal = (1 + charPosition) % 26;
            char replaceVal = ALPHABET.charAt(keyVal);
            cipherText += replaceVal;
        }
		System.out.println(cipherText);
		
		try {
			FileWriter fw = new FileWriter("src/_02_File_Encrypt_Decrypt/test3.txt");
			
			fw.write(cipherText);
				
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

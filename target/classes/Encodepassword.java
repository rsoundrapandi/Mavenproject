package resources;

import java.util.Base64;

public class Encodepassword {
	
	public static void encode(String input) {
		
		 byte[] encodedString = Base64.getEncoder().encode(input.getBytes());
		 System.out.println("encoded value is " + new String(encodedString));

		  // Decode data on other side, by processing encoded data
		  byte[] decodedString = Base64.getDecoder().decode(encodedString);
		  System.out.println("Decoded value is " + new String(decodedString));
	}
		
	
public static void main(String[] args) {
	
	encode("Easwari@22");
	
	
}

}

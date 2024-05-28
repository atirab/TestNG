package BasicTests;

import org.apache.commons.codec.binary.Base64;

public class EncodingandDecodingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="autotest";
		
		byte[] encodedstr = Base64.encodeBase64(str.getBytes());
		System.out.println("encodedString: "+new String(encodedstr));
		
		byte[] decodedstr = Base64.decodeBase64(encodedstr);
		System.out.println("decodedString: "+new String(decodedstr));

	}

}

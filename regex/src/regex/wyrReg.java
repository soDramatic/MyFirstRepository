package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class wyrReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String code = "24-320";
		Pattern p = Pattern.compile("[0-9]{2}-[0-9]{3}");
		Matcher m = p.matcher(code);
		
		boolean sprawdzenie = Pattern.matches("[0-9]{2}-[0-9]{3}", code);
		System.out.println(sprawdzenie);
		
	}

}

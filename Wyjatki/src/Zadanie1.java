
public class Zadanie1 {

	public static void main(String[] args) throws Exception{
		try{
			//lenghtOfString("asd");
			lenghtOfString(null);	
		}
		catch(NullPointerException e){
			throw new Exception(e);
		}
	}

	public static void lenghtOfString(String string) {
		System.out.println("Lenght of string: " + string.length());
	}

}

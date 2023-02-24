package asdf;

public class Z1 {

	public static void main(String[] args) {
		
		String name="12321";
		String rev="";
		for (int i=name.length()-1; i>=0; i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(name)) {
			
			System.out.println("this is prindilim");
		}
		else {
			System.out.println("this is not prindilim");

		}
	}

}

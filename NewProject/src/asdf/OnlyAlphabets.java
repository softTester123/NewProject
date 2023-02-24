package asdf;

public class OnlyAlphabets {

	public static void main(String[] args) {
		String alpha="P23u123n#545#e1d3@e";
		for (int i=0; i<=alpha.length()-1; i++) {
			char ch =alpha.charAt(i);
			if(Character.isAlphabetic(ch)) {	
				System.out.println(ch);
			}
			else if (Character.isDigit(ch)) {
				System.out.println(ch);
			}
		}
	} 

}

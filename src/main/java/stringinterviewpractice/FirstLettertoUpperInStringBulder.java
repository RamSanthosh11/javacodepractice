package stringinterviewpractice;

public class FirstLettertoUpperInStringBulder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java is a programming language";
		String[] sa = s.split(" ");
		StringBuilder newstr = new StringBuilder();
		for(String word : sa) {
			if(word.length()>0) {
				newstr.append(Character.toUpperCase(word.charAt(0)))
				.append(word.substring(1))
				.append(" ");
			}
		}
        System.out.println(newstr.toString().trim());

	}

}

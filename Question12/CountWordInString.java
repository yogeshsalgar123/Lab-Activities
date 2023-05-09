package Question12;

public class CountWordInString {

	public static Integer countNumberOfWord(String str) {
		int count=0;
		
		if(str.charAt(0)!=' ') {
			count++;
		}
		
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==' '&& str.charAt(i+1)!=' ') {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String str = new String("Happy Diwali");
		int count=countNumberOfWord(str);
		System.out.println("Number of Word in string="+count);
	}
}

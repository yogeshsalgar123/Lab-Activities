package Question03;

public class Question3 {

	public static void main(String[] args) {
	
		int cv=countVowel("Hcl Technologies");
		System.out.println(cv);
		
	}
		
		
	public static int countVowel(String str)
	{
        int vowel = 0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vowel++;
			}
		}
	    return vowel;
	
	}
}

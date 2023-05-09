package Question18;

public class FindVowelConDigit {

	//Create a method for finding number of vowels, consonants,digit and white space,
		public static void findString() {
			int vowels=0, consonants= 0, digits=0,whitespaces=0;
			
			String str = " HELLO EVERYONE I AM YOGESH";
			String str_lower = str.toLowerCase();
			char[] str_arr = str_lower.toCharArray();
			
			for(char s: str_arr) {
				if(s=='a'|| s=='e'|| s=='i' || s=='o' || s=='u') {
					vowels++;
					
				}
				else if(s>'a'&&s<'z') {
					consonants++;
				}
				else if(s==' ') {
					whitespaces++;
					
				}
				else {
					digits++;
				}
			}
			
			System.out.println("sttring"+str+"\n");
			System.out.println("Number of Vowels: "+vowels);
			System.out.println("Number of Consonants: "+ consonants);
			System.out.println("Number of digit: "+digits);
			System.out.println("Number of white space : "+whitespaces);
		}
		
}

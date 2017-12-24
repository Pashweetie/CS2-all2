import java.io.BufferedReader;
public class Word{
	private int count=1;
	private StringLand wordLand;
	private String word="";
	public Word(String s){

		wordLand =new StringLand(remake(s));
		word = remake(s);
		// System.out.println(word);
	}
	public StringLand getWordLand(){
		return wordLand;
	}
	public String getWord(){
		return word;
	}
	public int getTimes(){
		return count;
	}
	public boolean addition(String s){
		if(s.equals(word)){
			count++;
			return true;
		}
		return false;
	}
	public String remake(String s){
		String b ="";
		for(int i =0;i<s.length();i++){
			char a = s.charAt(i);
			if(Character.isLetter(a)||(a=='\'')){
				if(Character.isUpperCase(a)){
					b=b+(Character.toLowerCase(a));
				}
				if(Character.isLowerCase(a)){
					b=b+a;
				}
			}
		}
		return b;
	}

}
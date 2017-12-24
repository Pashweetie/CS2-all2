//Justin Treece CS2 Blanche Cohen 12:00-2:00pm t/th
import java.util.*;
import java.io.*;

public class hw7{
	public static void main(String[] args) {
		ArrayList<String> s= createArrayList(importz());
		MyHash a = new MyHash(s);
		System.out.println("Unique words array size:"+s.size());
		System.out.println("Hashtable Lengths:");
		a.printSizes();
		a.printHash();
		Hashtable hash = a.setHash(s,14616);
		a.printHash(hash);

	}
	public static String importz(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter in text");
		return sc.next();
	}
	public static ArrayList<String> createArrayList(String file){
		Scanner sr =null;
		try{
			sr = new Scanner(new File(file));
		}catch(Exception e){
			System.out.println(e);
		}
		
		ArrayList<String> words = new ArrayList<String>();
		while(sr.hasNext()){
			String zz = sr.next();
			zz= remake(zz);
			if(!checkIfThere(words,zz))
				words.add(zz);

		}
		return words;
	}
	public static boolean checkIfThere(ArrayList<String> words, String zz){
		for (int i=0;i<words.size();i++) {
			if(words.get(i).equals(zz)){
				return true;
			}			
		}
		return false;
	}
	public static String remake(String s){
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

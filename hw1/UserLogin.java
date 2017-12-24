

/*

Justin Treece Section 1 CS 2050 9/4/2017-9/6/2017
This program is designed to take a users input, assess it based on whether it meets requirements and print to the system.out that it was valid, or that errors occured and which ones.
Typcially I write shorter programs like this without method oriented design so it was a bit strange for me however I do not like having to state static global variables anyways. I think I could have made this a lot shorter
however I think a lot of the lines of code were due to having to instantiate so many methods.
*/
import java.util.Scanner;
import java.lang.Character;
public class UserLogin{
		
	
	public static void main(String[] args) {
		String s = "";
		String input = "";
		input = greetUser();
		while(input.equals("yes")){//I thought about doing a do-while loop here but I wanted only the input to run at least once, because if the user said "no" in a do while loop the whole thing would still run once anyways.
		
		s=readUser();
		report(checkValidity(s),checkUpperCase(s),checkLowerCase(s),checkNumber(s),checkLength(s));
		input =greetUser();
		}
		
		
	}
	public static String greetUser(){
		System.out.println("\tHello, this program is designed to check to see if you login\n\t password meets our new necessary requirements\n\t please enter a number, lowercase and uppercase letters\n\t either a $#!@ and a number and is at least 5 characters long \n\twould you like to start?(yes/no)");
		Scanner determine = new Scanner(System.in);
		String s = determine.next();
		return s;
	}
	public static String readUser(){
		System.out.println("Please enter password:");
		Scanner read = new Scanner(System.in);
		String s = "";
		read.useDelimiter("\n");
		s=read.next();
		return s;
	}
	public static boolean checkUpperCase(String s){
		for (int i=0;i<s.length();i++) {
			if(Character.isLetter(s.charAt(i))&&Character.isUpperCase(s.charAt(i))){ 
				return true;
			}
		}
		return false;
	}
	public static boolean checkLowerCase(String s){
		for(int i=0;i<s.length();i++){
			if(Character.isLetter(s.charAt(i))&&Character.isLowerCase(s.charAt(i))){
				return true;
			}
		}
		return false;
	}
		
	public static boolean checkValidity(String s){
		boolean specialChar=false;

		for(int i=0;i<s.length();i++){ // for loop goes through process of elimation to determine that if its not a designated special character, a letter or a number that it is an invalid character(including spaces) and will return false.
			// this was a little tricky to approach on paper but I'm pretty proud of my solution. If the special char was instead a return true statement this would falsely assess some passwords as valid.
			
			if(s.substring(i,i+1).equals("!")||s.substring(i,i+1).equals("@")||s.substring(i,i+1).equals("#")||s.substring(i,i+1).equals("$")){
				specialChar=true;
			}
			else if(!Character.isLetter(s.charAt(i))&&!Character.isDigit(s.charAt(i))){
				return false;
			}
			
		}
		return specialChar;
	}
	public static boolean checkLength(String s){
		if(s.length()>5)
		{
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean checkNumber(String s){
		for(int i=0;i<s.length();i++){
			if(Character.isDigit(s.charAt(i))){
				return true;
			}
		}
		return false;
	}

	public static void report(boolean isValid, boolean hasUppercase, boolean hasLowercase, boolean hasDigit, boolean isLong){// Wish I could have found a shorter way to write this method.
		if(isValid&&hasUppercase&&hasLowercase&&hasDigit&&isLong){
			System.out.println("Valid input.");
		}else{
			System.out.println("Invalid input(s):");
		}
		if(!isValid){
			System.out.println("\tInvalid Character/ No special character");
		}
		if(!hasUppercase){
			System.out.println("\tNo uppercase");
		}
		if(!hasLowercase){
			System.out.println("\tNo lowercase");
		}
		if(!isLong){
			System.out.println("\tNot long enough");
		}
		if(!hasDigit){
			System.out.println("\tNo digit");
		}
	}

}
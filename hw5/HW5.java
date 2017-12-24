import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
public class HW5{
	public static void main(String[] args) {
		ArrayList<Word> words = new ArrayList<Word>();
		words = createArrayList(importz());
		// LinkedList<Word> wordz = createLinkedList("HW4.txt");
		// printArray(words);
		// System.out.println(words.size());

		printArray(bubbleSortArray(words));
	}
	public static String importz(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter in text");
		return sc.next();
	}

	public static ArrayList<Word> createArrayList(String file){
		Scanner sr =null;
		try{
			sr = new Scanner(new File(file));
		}catch(Exception e){
			System.out.println(e);
		}
		
		ArrayList<Word> words = new ArrayList<Word>();
		if(sr.hasNext()){
			words.add(new Word(sr.next()));
		}
		while(sr.hasNext()){
			String zz = sr.next();
			if(!checkIfThere(words,zz))
				words.add(new Word(zz));

		}
		return words;
	}
	public static LinkedList<Word> createLinkedList(String file){
		Scanner sr =null;
		try{
			sr = new Scanner(new File(file));
		}catch(Exception e){
			System.out.println(e);
		}
		LinkedList<Word> words = new LinkedList<Word>();
		while(sr.hasNext()){
			String zz = sr.next();
			// System.out.println(zz);
			for(int i =0;i<words.size();i++){
				Boolean b =words.get(i).addition(zz);
				if(!b){
					words.add(new Word(zz));
				}
			}
			
		}
		return words;
	}
	public static ArrayList<Word> bubbleSortArray(ArrayList<Word> arr){
        int n = arr.size();
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr.get(j).getWordLand().compareTo(arr.get(j+1).getWord()) >0){
                    Word temp = arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,temp);
                }
            }
        }
        return arr;
    }
    public static LinkedList<Word> bubbleSortLinked(LinkedList<Word> arr){
    	int n = arr.size();
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr.get(j).getWordLand().compareTo(arr.get(j+1).getWord()) >0)
                {
                    Word temp = arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,temp);
                }
            }
        }
        return arr;            
    }
    public static void printArray(ArrayList<Word> arr){
    	for(Word word: arr){
    		System.out.println(word.getWord());
    		System.out.println(word.getTimes());
    	}

    }
    public static void printLinked(LinkedList<Word> arr){
    	for(Word word: arr){
    		System.out.println(word.getWord());
    	}
    }
    public static boolean checkIfThere(ArrayList<Word> words,String word){
    	Boolean b = false;
    	for(int i=0;i<words.size();i++){
    		if(word.equals(words.get(i).getWord())){
    			b=words.get(i).addition(word);
    		}
    	}
    	return b;
    }

}
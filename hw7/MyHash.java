import java.util.*;
import java.io.*;
public class MyHash{
	private LinkedList<String>[] b = new LinkedList[183];
	public MyHash(ArrayList<String> s){
		for(int i=0;i<b.length;i++){
			b[i]=new LinkedList();
		}
		setHash(s);

	}
	public void setHash(ArrayList<String> s){
		for(int i=0;i<s.size();i++){
			int big = convertToInt(s.get(i));
			int index = big%183;
			// System.out.println(index);
			// System.out.println(s.get(i));
			this.b[index].add(s.get(i));
		}
	}
	public int convertToInt(String s){
		int sum =0;
		for(int i=0;i<s.length();i++){
			char a= s.charAt(i);
			sum = sum+(int)a;
		}
		return sum;
	}
	public void printHash(){
		PrintWriter writer =null;
		try{
			writer =new PrintWriter("hw7.out.txt","UTF-8");
		}catch(Exception e){
			System.out.println(e);
		}
		
		for(int i =0;i<5;i++){
			writer.println("index "+i+":");			 				
			for(int b=0;b<this.b[i].size();b++){
				writer.println("\t"+this.b[i].get(b));
			}
		}
		writer.close();
	}
	public void printHash(Hashtable hash){
		PrintWriter writer =null;
		// Enumeration keys=null;
		// String key;
		try{
			writer =new PrintWriter("hw7.hash.txt","UTF-8");
		}catch(Exception e){
			System.out.println(e);
		}
		Enumeration keys = hash.keys();
		for(int i=0;i<5;i++){
			Object key = keys.nextElement();
			writer.println(key+" value:"+hash.get(key));
		}
		// writer.println(hash.toString());
		// keys = hash.keys();
		// int i=0;
		// for(int i=0;i<5;i++){
		// 	int size =hash.entrySet().toArray().length;
		// 	String[] s = Arrays.copyOf(hash.entrySet().toArray(),hash.entrySet().toArray().length,String[].class);
		// 	writer.println("index "+i+":");
		// 	for(int b=0;b<size;b++){
		// 		writer.println(s[b]);
		// 	}
		// }
		// writer.println(hash.toString());
		// while(i<5){
		// 	key = hash.toString(keys.nextElement());
		// 	writer.println("Key:"+key+ "Value"+hash.get(key));
		// 	i++;
		// }
		// for(int i =0;i<5;i++){
		// 	writer.println("index "+i+":");

		// 	while(hash.get(i).hasMoreElements()){
		// 		writer.println(hash.keys().nextElement());
		// 	}		
		// }
		writer.close();
	}
	public Hashtable setHash(ArrayList<String>s,int size){
		Hashtable hash = new Hashtable(size);	
		for(int i=0;i<s.size();i++){
			int big = convertToInt(s.get(i));
			int index = big%size;
			// System.out.println(index);
			// System.out.println(s.get(i));
			hash.put(index,s.get(i));
		}
		return hash;

	}
	public void printSizes(){
		for(int i=0;i<b.length;i++){
			System.out.println(b[i].size());
		}
	}
}
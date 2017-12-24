import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.util.Collections;
public class HW4{
	public static void main(String[] args) {
		ArrayList<String> str =new ArrayList<String>(importz(greet()));
		long startTime1 = System.currentTimeMillis();
		long sysStart1= System.nanoTime();
		ArrayList<String> str1 = new ArrayList<String>(bubbleSort(str));
		long endTime1 = System.currentTimeMillis();
		long sysDiff1 = System.nanoTime()-sysStart1;
		long totalTime1= endTime1-startTime1;


		// System.out.println(toArray(str));
		// String[] str2 = new String[str.size()];
		// str2= toArray(str);
		// str2 = Arrays.sort(str2);
		// System.out.println();
		// System.out.println();
		// System.out.println();
		// System.out.println();
		// System.out.println();
		// System.out.println();
		// System.out.println();
		// System.out.println();
		// for (String a:str2 ) {
		// 	System.out.println(a);
		// }
		ArrayList<String> str3 = new ArrayList<String>();
		long startTime = System.currentTimeMillis();
		long sysStart = System.nanoTime();
		Collections.sort(str,(String r1, String r2)->
		r1.compareTo(r2));
		long endTime = System.currentTimeMillis();
		long sysDiff = System.nanoTime()-sysStart;
		long totalTime=endTime-startTime;

		System.out.println("Clock Time (Milliseconds):");
		System.out.println("\tBubble:"+totalTime1);
		System.out.println("\tQuickSort"+totalTime);
		System.out.println("CPU Time(Nanoseconds)");
		System.out.println("\tBubble:" + sysDiff1);
		System.out.println("\tQuickSort"+ sysDiff);

		// str3=Arrays.sort(str);
		// for (String a :str2 ) {
		// 	System.out.println(a);
		// }

	}
	public static String greet(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input file");
		return sc.next();
	}
	public static ArrayList<String> importz(String s){

		Scanner sc= null;
		try{
			sc = new Scanner(new File(s));
		}catch(Exception e){
			System.out.println(e);
		}
		ArrayList<String> str = new ArrayList<String>();
		while(sc.hasNext()){
			str.add(sc.next());

		}
		return str;

	}
	public static ArrayList<String> bubbleSort(ArrayList<String> str){
		for(int i=0;i<str.size()-1;i++){
			for (int z=0;z<str.size()-i-1;z++ ) {
				StringLand str1= new StringLand(str.get(z));
				if(str1.compareTo(str.get(z+1))>0){
					String s = str.get(z);
					str.set(z,str.get(z+1));
					str.set(z+1,s);
				}
			}	
		}
		return str;
	}	
	public static String[] toArray(ArrayList<String> str){
		String[] stringy= new String[str.size()];
		int count=0;
		for(String a: str){
			stringy[count]=a;
			count++;

		}
		return stringy;

	}	
		
}

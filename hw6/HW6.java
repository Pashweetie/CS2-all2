//Justin Treece HW6 10/20/2017-10/22/2017
import java.util.*;
public class HW6{

	public static void main(String[] args) {		
		Random randy= new Random();
		String[] response = greet();
		int size = Integer.parseInt(response[0]);
		int big = Integer.parseInt(response[1]);
		float sizeFloat = Float.parseFloat(response[0]);
		float bigFloat = Float.parseFloat(response[1]);
		Integer[] arr=null;
		String[] arr1=null;
		Float[] arr2 = null;
		if(size>0&&big>1){
			arr = new Integer[size];
			arr1=new String[size];
			//uncomment this for floating point numbers
			// arr2=new Float[size];
			for(int i=0;i<size;i++)
				arr[i]=randy.nextInt(big);
			//uncomment this for floating point numbers
			// for(int i=0;i<size;i++)
			// 	arr2[i]=randy.nextFloat(bigFLoat);
			
			for(int i=0;i<size;i++)
				arr1[i]=nextString();
			System.out.println("int:");
			run(arr);
			System.out.println("String:");
			run(arr1);
			System.out.println("Float:");
			//uncomment this for floating point numbers
			// run(arr2);

		}
		

	}
	public static void run(Comparable[] a){
		MergerSort sort =new MergerSort();
		long mergeClock1 = System.currentTimeMillis();
		long mergeNano1 = System.nanoTime();
		sort.mergeSort(a);
		long mergeClock = System.currentTimeMillis()-mergeClock1;
		long mergeNano= System.nanoTime()-mergeNano1;

		long javaClock1 = System.currentTimeMillis();
		long javaNano1 = System.nanoTime();
        Arrays.sort(a);
        long javaClock = System.currentTimeMillis()-javaClock1;
        long javaNano = System.nanoTime()-javaNano1;
        System.out.println("System time");
        System.out.println("\tJavaSort:"+javaNano);
        System.out.println("\tMergeSort:"+mergeNano);
        System.out.println("Clock time");
        System.out.println("\tJavaSort"+javaClock);
        System.out.println("\tMergeSort:"+mergeClock);	
	}
	public static String nextString(){
		Random randy = new Random();
		String result = "";
		for(int i=0;i<6;i++){
			int deciding = randy.nextInt(6);
			switch(deciding){
				case 0:
					result=result+"a";
					break;
				case 1:
				result=result+"e";
					break;
				case 2:
				result=result+"c";
					break;
				case 3:
				result=result+"t";
					break;
				case 4:
				result=result+"r";
					break;
				case 5:
					result=result+"1";
					break;
				case 6:
					result=result+"4";
					break;
				default:
					result=result+"7";

			}

		}
		return result;
	}
	public static String[] greet(){
		Scanner sc = new Scanner(System.in);
		String[] stringy = new String[2];
		System.out.println("What is the size of this array?");
		stringy[0]=sc.next();
		System.out.println("What is the biggest number in the array(range of values)");
		stringy[1]=sc.next();
		return stringy;
		
	}

}
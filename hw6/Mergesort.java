// import java.util.Scanner;
// public class Mergesort{

// 	public Mergesort(){

// 	}
// 	public int[] sort(int[] arr){
// 		int[] left,right,result,otherResult;
// 		left = new int[arr.length/2];
// 		if(arr.length<=1){
// 			return arr;
// 		}
// 		else{
// 			int beginning=0;
// 			int end =arr.length-1;
// 			int middle = arr.length/2;
// 			int sub1 = middle-beginning+1;
// 			int sub2 = end-middle;
// 			left= new int[sub1];
// 			right = new int[sub2];
// 			for(int i=0;i<sub1;i++)
// 				left[i]=arr[i];
			
// 			for(int j=0;j<sub2;j++)
// 				right[j]=arr[middle+1+j];
// 			left= sort(left);
// 			right = sort(right);
// 			int temp=beginning;
// 			if(left[left.length-1]<=right[0]){
// 				otherResult= new int[right.length+left.length];
// 				int b=0;
// 				for(;b<sub1;b++){
// 					otherResult[b]=left[b];
// 				}
// 				for(int j = 0;j<sub2;j++){
// 					otherResult[b+j]=right[j];
// 				}
// 				return otherResult;
// 			}
// 			result = merge(left,right);
// 			return result;

// 		}
// 	}
// 	public int[] merge(int[] left,int[] right){
// 		int[] result = new int[left.length+right.length-2];
// 		while(left.length>0&&right.length>0){
// 			if(left[0]<=right[0]){
// 				result =appendValue(result,left[0]);
// 				left = removeFirst(left);
// 			}else{
// 				result = appendValue(result,right[0]);
// 				right= removeFirst(right);
// 			}
// 		}
// 		if(left.length>0)
// 				result = appendArray(result,removeFirst(left));
// 		if(right.length>0)
// 				result = appendArray(result,removeFirst(right));
// 		return result;

// 	}
// 	private int[] removeFirst(int[] array){
// 		int[] result = new int[array.length-1];
// 		for(int i=1;i<array.length;i++){
// 			result[i-1]=array[i];
// 		}
// 		return result;
// 	}
// 	private int[] appendValue(int[] array, int x){
//     	int[] result = new int[array.length + 1];

//     	for(int i = 0; i < array.length; i++)
//     	    result[i] = array[i];

// 	    result[result.length - 1] = x;

//     	return result;
// 	}
// 	private int[] appendArray(int[] array,int[]array2){
// 		int[] result=new int[array.length+array2.length];
// 		for(int i=0;i<array2.length;i++){
// 			result =appendValue(array,array2[i]);
// 		}
// 		return result;

// 	}


// }
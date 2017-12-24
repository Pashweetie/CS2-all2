public class StringLand implements Comparable<String>{
	private String z;
	public StringLand(String a){
		z=a;
	}
	public String getString(){
		return z;
	}
	public int compareTo(String s){
		int b =0;
		for(int i=0;i<z.length();i++){
			b=b+z.charAt(i);
		}
		int g =0;
		for (int z=0;z<s.length();z++ ) {
			g=g+s.charAt(z);
		}
		return b-g;

	}

}
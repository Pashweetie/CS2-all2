import java.io.File;
import java.util.Scanner;


public class Borders {
   private String country = "";

    public Borders(){
        public String[][] fillArray(){
        Scanner read = null;
        String[] borderSet = null;
        String[][] borders = null;
        try{
            read = new Scanner(new File("borders.txt"));
        }catch(Exception e){
            System.out.println("exception e");
        }
        read.useDelimiter("_");
        for(int i = 0; i < 9; i++){
            int k = 0;
            borderSet[i] = read.next();
            String[] splitter = borderSet[i].split(" ");
            for(String bord : splitter){
                borders[i][k] = bord;
                k++;
            }
        }
//        read.useDelimiter(" ");
//        for(int j = 0; j < borderSet.length; j++){
//            for(int k = 0; k < splitter.length; k++) {
//                borders[j][k] = read.next();
//            }
//        }
//        for(String group : borderSet){
//            int j = 0;
//            for(int k = 0; k < 9; k++){
//                borders[j][k] = group.split(" ");
//            }
//            j++;
//        }
        
    }
    public String[][] getBords(){
        
    }

    //public Borders(String borderCountries){
       // borderList = borderCountries;
    //}
    
    }    
    public String getName(String country, String[][] borders){
        for(int k = 0; k < 9; k++){
            if(borders[k][0].equals(country)){
                this.country = country;
            }else
                System.out.println("This country isn't contained in the data.");
        }
        return this.country;
    }

}

// Developed by Jeff Cutcliffe and Justin Treece CS2 HW2 9/19/2017

import java.util.Scanner;
import java.io.File;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
public class Test{
	public static void main(String[] args) {
			// // LinkedList<Countries> country = returnCountries(importCount());
			// LinkedList<Countries> countriboi= returnCountries(populateCountryArray());
			// LinkedList<Countries> nearly = returnBoth(populateCountryArray(),importBord(),"Germany");
			// for(int i=0;i<nearly.size();i++){
			// 	// System.out.println(	countriboi.get(i).getName());
			// 	// System.out.println(	countriboi.get(i).getCountryPop());
			// 	System.out.println(	nearly.get(i).getName());
			// }

			// // returnBord(importBord(),"France").printBorders();
			// // returnCountries(importCount(),"Germany");
		LinkedList<Countries> countries = populateCountryArray("input.txt");
        String name =greet();
        String querie = greet1();
        LinkedList<Countries> setTo=null;
        // System.out.println(	querie);
        if(querie.equals("pop")){
            setTo=returnCountries(populateCountryArray());
            for(int i=0;i<setTo.size();i++){
                System.out.print(setTo.get(i).getName());
                System.out.println(	);
            }
        }
        if(querie.equals("bord")){
            Borders setToo=new Borders(returnBord(importBord("borders.txt"),name));
            System.out.println(	setToo);
            System.out.println(	returnBord(importBord(),name));
            // System.out.println(setToo.getBorderName());
            setToo.printBorders();
            System.out.println();
        }
        if(querie.equals("both")){
            setTo=returnBoth(populateCountryArray(),importBord("borders.txt"),name);
            for(int i=0;i<setTo.size();i++){
                System.out.print(setTo.get(i).getName());
            }
            System.out.println();
        }
    }
     public static Borders returnBord(LinkedList<Borders>jimbo, String theName){
        LinkedList<Borders> returnArray=new LinkedList<Borders>();
        Borders bord = new Borders();
        // System.out.println("happens");
        for(int i=0;i<jimbo.size();i++){
            if(jimbo.get(i).getBorderName().equals(theName)){
                System.out.println( "happens");
                return jimbo.get(i);
            }
        }
        return null;
    }
    public static LinkedList<Borders> importBord(String fileName){
        LinkedList<String> linesOfBords=new LinkedList<String>();
        LinkedList<Borders> bordering = new LinkedList<Borders>();
        Scanner sc = new Scanner(System.in);
        try{
            sc = new Scanner(new File(fileName));
        }catch(Exception e){
            System.out.println(e);
        }
        sc.useDelimiter("_");
        int counter=0;
        // System.out.println("didn't even do the first");
        
        while(sc.hasNext()){            
            linesOfBords.add(sc.next());            
            counter++;
        }
        counter=0;
        Scanner breaker = new Scanner(System.in);
        breaker.useDelimiter(" ");
        Borders borderly = new Borders();
        // System.out.println("1st loop complete");
        for(int k=0;k<9;k++){
            // System.out.println("hi");
            breaker=new Scanner(linesOfBords.get(k));
            int counters=0;
            // System.out.println(  k);
            borderly = new Borders();
            // System.out.println("Does for loop");
            while(breaker.hasNext()){
                // System.out.println(  counter);
                if(counters==0){
                    borderly.setBorderName(breaker.next());
                    counters++;// Oh my god i just tested this for hours not knowing what was wrong. You want to know? yeah this was originally named counter not counters....
                }else{
                // System.out.println(breaker.next());
                String s = breaker.next();
                borderly.addBorder(s);
                    counters++;
                }
                // System.out.println(borderly.getBorderName());
                // borderly.printBorders();
            }
             bordering.add(borderly);
        }
        return bordering;
	}
	 // public static LinkedList<Countries> importCount(){
  //       LinkedList<Countries> returnArray = new LinkedList<Countries>();
  //       for(int i=0;i<10;i++){
  //           returnArray.add(populateCountryArray());
  //       }
  //       return returnArray;
  //  }
    public static LinkedList<Countries> returnCountries(LinkedList<Countries> jimbo){
        LinkedList<Countries> returnArray = new LinkedList<Countries>();
        for (int i=0;i<jimbo.size();i++) {
            if(jimbo.get(i).getCountryPop()>35000000){
                returnArray.add(jimbo.get(i));                
            }
        }
        return returnArray;
    }
    public static LinkedList<Countries> returnBoth(LinkedList<Countries> jimbo,LinkedList<Borders> reee,String theName){
        LinkedList<Countries> countries =returnCountries(jimbo);
        Borders borders = returnBord(reee,theName);
        LinkedList<Countries> returnArray = new LinkedList<Countries>();
        for(int j=0;j<countries.size();j++){
        // System.out.println();            
            for(int i=0;i<borders.getBorders().size();i++){
                if(countries.get(j).getName().equals(borders.getBorders().get(i))){
                    returnArray.add(countries.get(j));
                    // System.out.println(	);
                    // System.out.println(	countries.get(j).getName());
                    // System.out.println(	borders.getBorders().get(i));
                    // System.out.println("well it added it...");
                }
                // System.out.println( "guess this is a thing");      
            }
        }
        return returnArray;
    }
        public static LinkedList<Countries> populateCountryArray(String fileName){
        LinkedList<Countries> returnArray = new LinkedList();
        File newFile =null;
        Scanner sc=null;
        
        try{
            newFile= new File(fileName);
            sc = new Scanner(newFile);
        }catch(Exception e){
            System.out.println(e);
        }
        for(int ib=0;ib<9;ib++){
        	Countries namedCountry = new Countries();
        	for(int i=0;i<7;i++){
            		switch(i){
                		case 0: namedCountry.setName(sc.next());
                		// System.out.println(namedCountry.getName());
                  		  break;
              		  	case 1: namedCountry.setLat(sc.next());
              		  	// System.out.println(namedCountry.getLat());
                    		break;
               			case 2: namedCountry.setLongi(sc.next());
               			// System.out.println(namedCountry.getLongi());
                    		 	break;
                		case 3: namedCountry.setCountryA(Integer.parseInt(sc.next()));
                		// System.out.println(namedCountry.getCountryA());
                   			break;
                		case 4: namedCountry.setCountryPop((Integer.parseInt(sc.next())));
                    //isPop==True&&country.getCountryPop()>100000000?System.out.println(country.getName());  Was going to try to do it without arrays as a challenge but it proved too much for the amount of time I have
                   			break;
               			case 5: namedCountry.setGDP((Double.parseDouble(sc.next())));
                    			break;
                		case 6: namedCountry.setYear((Integer.parseInt(sc.next())));
                   				break;
                		default:System.out.println("Broke");
                    		break;
           		}
        	}
       		 returnArray.add(namedCountry);
        }
        return returnArray;

        
    }
    	public static String greet(){
        String country = "";

        System.out.println("Hello there please do tell me the name of the country you'd like information on");
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        country=sc.next();
        return country;
    }
    public static String greet1(){
        Scanner sc = new Scanner(System.in);
        String whatToDo="";
        System.out.println("Please enter whether you'd like a list of countries with a population over 100,000,000, what borders these countries or both (pop/bord/both)");
        whatToDo=sc.next();
        return whatToDo;
    }

}
// import java.util.Scanner;
// import java.io.File;
// import java.io.File;
// import java.io.IOException;
// public class HW2{
// 	public static void main(String[] args) {
// 		Borders borderz = new Borders();
//         LinkedList<Borders> borders= importBord(borderz);
//         LinkedList<Countries> countries = importCount();
//         String name =greet();
//         String querie = greet1();
//         LinkedList<Countries> setTo=null;
//         Borders setToo = null;
//         if(querie.equals("pop")){
//             setTo=returnCountries(countries,name);
//             System.out.println(setTo.length());
//             for(int i=0;i<setTo.length();i++){
//                 System.out.print(setTo.get(i).getName());
//             }
//             System.out.println();
//         }
//         if(querie.equals("bord")){
//             setToo=returnBord(borders,name);
//             System.out.println(setToo.getBorderName());
//             setToo.printBorders();
//             System.out.println();
//         }
//         if(querie.equals("both")){
//             setTo=returnBoth(countries,borders,name);
//             for(int i=0;i<setTo.length();i++){
//                 System.out.print(setTo.get(i).getName());
//             }
//             System.out.println();
//         }
       
// 	}
// 	public static LinkedList<Borders> importBord(Borders border){
//         LinkedList<String> linesOfBords=new LinkedList<String>();
//         LinkedList<Borders> bordering = new LinkedList<Borders>();
//         Scanner sc = new Scanner(System.in);
//         try{
//             sc = new Scanner(new File("borders.txt"));
//         }catch(Exception e){
//             System.out.println(e);
//         }
//         sc.useDelimiter("_");
//         int counter=0;
//         // System.out.println("didn't even do the first");
        
//         while(sc.hasNext()){            
//             linesOfBords.add(sc.next());            
//             counter++;
//         }
//         counter=0;
//         Scanner breaker = new Scanner(System.in);
//         breaker.useDelimiter(" ");
//         Borders borderly = new Borders();
//         // System.out.println("1st loop complete");
//         for(int k=0;k<9;k++){
//             // System.out.println("hi");
//             breaker=new Scanner(linesOfBords.get(k));
//             int counters=0;
//             // System.out.println(  k);
//             borderly = new Borders();
//             // System.out.println("Does for loop");
//             while(breaker.hasNext()){
//                 // System.out.println(  counter);
//                 if(counters==0){
//                     borderly.setBorderName(breaker.next());
//                     counters++;// Oh my god i just tested this for hours not knowing what was wrong. You want to know? yeah this was originally named counter not counters....
//                 }else{
//                 // System.out.println(breaker.next());
//                 String s = breaker.next();
//                 borderly.addBorder(s);
//                     counters++;
//                 }
//                 // System.out.println(borderly.getBorderName());
//                 // borderly.printBorders();
//             }
//              bordering.add(borderly);
//         }
//         return bordering;
// 	}
//     public static LinkedList<Countries> importCount(){
//         LinkedList<Countries> returnArray = new LinkedList<Countries>();
//         for(int i=0;i<10;i++){
//             returnArray.add(populateCountryArray());
//         }
//         return returnArray;
//     }
// 	public static String greet(){
//         String country = "";

//         System.out.println("Hello there please do tell me the name of the country you'd like information on");
//         Scanner sc = new Scanner(System.in);
//         sc.useDelimiter("\n");
//         country=sc.next();
//         return country;
//     }
//     public static String greet1(){
//         Scanner sc = new Scanner(System.in);
//         String whatToDo="";
//         System.out.println("Please enter whether you'd like a list of countries with a population over 100,000,000, what borders these countries or both (pop/bord/both)");
//         whatToDo=sc.next();
//         return whatToDo;
//     }
//     public static Countries populateCountryArray(){
//         File newFile =null;
//         Scanner sc=null;
//         Countries namedCountry = new Countries();
//         try{
//             newFile= new File("input.txt");
//             sc = new Scanner(newFile);
//         }catch(Exception e){
//             System.out.println(e);
//         }


//         for(int i=0;i<7;i++){
//             switch(i){
//                 case 0: namedCountry.setName(sc.next());
//                     break;
//                 case 1: namedCountry.setLat(sc.next());
//                     break;
//                 case 2: namedCountry.setLongi(sc.next());
//                     break;
//                 case 3: namedCountry.setCountryA(Integer.parseInt(sc.next()));
//                     break;
//                 case 4: namedCountry.setCountryPop((Integer.parseInt(sc.next())));
//                     //isPop==True&&country.getCountryPop()>100000000?System.out.println(country.getName());  Was going to try to do it without arrays as a challenge but it proved too much for the amount of time I have
//                     break;
//                 case 5: namedCountry.setGDP((Double.parseDouble(sc.next())));
//                     break;
//                 case 6: namedCountry.setYear((Integer.parseInt(sc.next())));
//                     break;
//                 default:System.out.println("Broke");
//                     break;
//             }
//         }
//         return namedCountry;
//     }
//     public static Borders returnBord(LinkedList<Borders> jimbo, String a){
//         LinkedList<Borders> returnArray=new LinkedList<Borders>();
//         Borders bord = new Borders();
//         System.out.println("happens");
//         for(int i=0;i<jimbo.length();i++){
//           //  System.out.println("yeah");
//           //  System.out.println(jimbo.get(i).getBorderName()+"a");
//            // System.out.println((a)+"a");
//            // System.out.println( a.substring(1,2));
//             String  b = jimbo.get(i).getBorderName();
//             b.trim();
//             a.trim();
//             System.out.println( b);
//             System.out.println( b.compareTo(a));
//             if(b.compareTo(a)==0){
//                 System.out.println("yaeh?");
//                 return jimbo.get(i);
//             }
//         }
//         return null;
//     }
//     public static LinkedList<Countries> returnCountries(LinkedList<Countries> jimbo,String theName){
//         LinkedList<Countries> returnArray = new LinkedList<Countries>();
//         for (int i=0;i<jimbo.length();i++) {
//             if(jimbo.get(i).getCountryPop()>35000000){
//                 returnArray.add(jimbo.get(i));                
//             }
//         }
//         System.out.println(returnArray.get(2).getName());
//         return returnArray;
//     }
//     public static LinkedList<Countries> returnBoth(LinkedList<Countries> jimbo,LinkedList<Borders> reee,String theName){
//         LinkedList<Countries> countries =returnCountries(jimbo,theName);
//         Borders borders = returnBord(reee,theName);
//         LinkedList<Countries> returnArray = new LinkedList<Countries>();
//         for(int j=0;j<countries.length();j++){
//         System.out.println();            
//             for(int i=0;i<borders.getBorders().length();i++){
//                 if(countries.get(j).getName().equals(borders.getBorders().get(i))){
//                     returnArray.add(countries.get(j));
//                     System.out.println("well it added it...");
//                 }
//                 System.out.println( "guess this is a thing");      
//             }
//         }
//         return returnArray;
//     }

// }
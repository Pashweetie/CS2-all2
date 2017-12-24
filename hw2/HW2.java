//Developed by Justin Treece and Jeff Cutcliffe
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class HW2{
    private static String namedCountry = "";
    private static String whatToDo="";
    public static void main(String[] args) {
        int counter=0;
        Countries[] countries1 = new Countries[9];
        ArrayList<Countries> countries2 = new ArrayList<Countries>();
        ArrayList<Borders> borders1 = new ArrayList<Borders>();
        for(int i=0;i<9;i++){
            borders1.add(new Borders());
        }
		/*
		Countries germany = populateArray();
		Countries france = populateArray();
		Countries netherlands = populateArray();
		Countries belgium = populateArray();
		Countries luxemburg = populateArray();
		Countries poland = populateArray();
		Countries czechia = populateArray();  This is incredibly inefficent I simply couldn't bare to do this
		Countries austria = populateArray();
		Countries swiss = populateArray();
		*/
        for (int i=0;i<9;i++) {
            countries1[i]= populateCountryArray();
        }
        for(int i=0;i<9;i++){
            countries2.add(populateCountryArray());
        }
        greet();
        boolean pop;
        boolean bord;
        for(int i=0;i<countries1.length;i++){

            if(whatToDo.equals("pop")){
                pop=checkIfPop(countries2);
                if(pop==true){
                    System.out.print(countries2.get(i).getName());
                    try {
                        Files.write(Paths.get("./output.txt"), countries2.get(i).getName().getBytes(),StandardOpenOption.APPEND);
                    }catch(IOException e){
                        System.out.println(e);
                    }
                }

            }
            if(whatToDo.equals("bord")){
                bord=checkIfBord(borders1,namedCountry);
                if(bord==true){
                    System.out.print(borders1.get(i).getName());
                    try {
                        Files.write(Paths.get("./output.txt"), borders1.get(i).getName().getBytes(),StandardOpenOption.APPEND);
                    }catch(IOException e){
                        System.out.println(e);
                    }
                }
            }
            if(whatToDo.equals("both")){
                bord=checkIfBord(borders1);
                pop=checkIfPop(countries2);
                if(pop==true&&bord==true){
                    System.out.print(countries2.get(i).getName());
                    try {
                        Files.write(Paths.get("./output.txt"), countries2.get(i).getName().getBytes(), StandardOpenOption.APPEND);
                    }catch(IOException e){
                        System.out.println(e);
                    }
                }
            }
        }
    }



}

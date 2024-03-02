package students_manager;

import java.util.Scanner;

public class Inputter {
    public static Scanner in = new Scanner(System.in);
    public static int inputInt(String msg,int min,int max){
        if (min>max){
            int t = min; min = max; max = t;
        }
        int data = 0;
        do{
            System.out.println(msg);
            data = Integer.parseInt(in.nextLine());           
        }while (data<min || data>max); 
        return data;
    }
    
    public static String inputStr (String msg){
        System.out.println(msg);
        String data = in.nextLine().trim();
        return data;
        
    }
    
    public static String inputNonBlankString(String msg){
        String data;
        do{
            System.out.println(msg);
            data = in.nextLine().trim();
        }while (data.length()==0);
        return data;
    }
    
    public static String inputPattern(String msg, String pattern){
        String data;
        do{
            System.out.println(msg);
            data = in.nextLine().trim();
        } while(!data.matches(pattern));
        return data;
    }
    
    
}

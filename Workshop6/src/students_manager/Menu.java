package students_manager;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static int getChoice(ArrayList options){
        for (int i=0; i<options.size(); i++){
            System.out.print(i+1 + "-" + options.get(i));
        }
        System.out.println("Choose 1.." + options.size() + ":");
        Scanner in = new Scanner(System.in);
        return Integer.parseInt(in.nextLine());
    }
    
    public static int getChoice(Object[] options){
        for (int i=0; i<options.length; i++){
            System.out.println((i+1) + "-" + options[i]);
        }
        System.out.println("Choose 1.." + options.length + ": ");
        Scanner in = new Scanner(System.in);
        return Integer.parseInt(in.nextLine());
    }
        
    
}
package com.example;
import java.util.ArrayList;


public class Healer {
    String RESET = "\u001B[0m";
    String GREEN = "\u001B[32m";
    String YELLOW = "\u001B[33m";

    ArrayList <Helden> wartebank = new ArrayList <Helden>();
   


    public void wartebank_schlange(){
 
        if (wartebank.get(0).fight_count == 2) {
            wartebank.get(0).stats(wartebank.get(0));
            System.out.println(GREEN + wartebank.get(0).name + " has been heald!!" + RESET);
            wartebank.remove(0);
        }
        
        
    
    }

    public void resurrect(Helden Held){
 
        if (Held.fight_count == 4) {
            Held.stats(Held);
            System.out.println(YELLOW + Held.name + " has been resurrected!!" + RESET);
        }
        
        
    
    }
}

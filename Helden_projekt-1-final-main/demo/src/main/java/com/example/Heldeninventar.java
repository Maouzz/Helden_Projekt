package com.example;

import java.util.ArrayList;

public class Heldeninventar {
    
    int money;
    
    public ArrayList <waffen> Helden_waffen_inventar = new ArrayList <waffen>();

    public Heldeninventar(){
        System.out.println();
    }
    
    public void inventar_ausgabe(){
        
        for(int i = 0; i < Helden_waffen_inventar.size() ; i++){
            System.out.println(Helden_waffen_inventar.get(i).name);
        }
    }
    
    public String getwaffenName( int i, waffen waffe){
        
       return  waffe.getName(Helden_waffen_inventar.get(i));
    }

    public void getMoney(monster Gegner){

        switch (Gegner.typ) {
            
            case "Bat": 
                money = money + 20;
            break;
            
            case "Goblin": 
                money = money + 30;
            break;

            case "Skeleton": 
                money = money + 40;
            break;

            case "Wraith": 
                money = money + 50;
            break;

            case "Mimic_Chest": 
                money = money + 70;
            break;

            case "Animated_Armor": 
                money = money + 80;
            break;

            case "Ork": 
                money = money + 90;
            break;

            case "Evil_Wizard": 
                money = money + 100;
            break;

            default:
            break;
        }
    }
  
}

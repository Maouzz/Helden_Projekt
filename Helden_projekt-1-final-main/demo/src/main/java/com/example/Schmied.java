package com.example;

public class Schmied {

    public void repair(waffen waffe, Heldeninventar HI){

        if(HI.money >= 100){
            switch (waffe.Material) {
                
                case "Holz":
                    if (waffe.durability != 50) {
                        waffe.durability = 50;
                        HI.money = HI.money - 100;
                    }
                    else{
                        System.out.println("That weapon is not damaged!!");
                        System.out.println();
                    }
                break;
            
                case "Eisen":
                    if (waffe.durability != 100) {
                        waffe.durability = 100;
                        HI.money = HI.money - 100;
                    }
                    else{
                        System.out.println("That weapon is not damaged!!");
                        System.out.println();
                    }
                break;

                case "Dragonite":
                    if (waffe.durability != 150) {
                        waffe.durability = 150;
                        HI.money = HI.money - 100;
                    }
                    else{
                        System.out.println("That weapon is not damaged!!");
                        System.out.println();
                    }
                break;

                case "":
                    if (waffe.durability != 900) {
                        waffe.durability = 900;
                        HI.money = HI.money - 100;
                    }
                    else{
                        System.out.println("That weapon is not damaged!!");
                        System.out.println();
                    }
                break; 

                default:
                break;
            }
            
        }
        else{
            System.out.println("You dont have enough money to repair!!");
            System.out.println();
        }
        
    } 
}

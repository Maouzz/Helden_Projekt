package com.example;
import java.util.Arrays;
import java.util.Scanner;

public class Gameplay {
    boolean alleHelden_tod = false;
    String Area;



    public void Game(Alle_monster Am,monster Dragon,Helden Held1,Helden Held2,Helden Held3,Helden Held4,Heldeninventar HI,Healer Healer, Alle_waffen AW, Schmied Andre){
        Scanner s = new Scanner(System.in);
        Scanner r = new Scanner(System.in);
        System.out.println("Your goal is to slay the dragon!!");
        System.out.println();
        
        while (Dragon.tod == false && alleHelden_tod == false) {
            Area_Game(Dragon,Am, Held1, Held2, Held3, Held4, HI, Healer, AW);
            
            if (Dragon.tod == true) {
                System.out.println("You have won the Game!!");
                break;
            }
            if (alleHelden_tod == true) {
                System.out.println("You have lost the Game!!");
                break;
            }
            System.out.println();

            System.out.println("Do you want to go to the Healer??");
            System.out.println("1: Yes");
            System.out.println("2: No");
            int x = r.nextInt();
            System.out.println();

            if( x == 1){
                while(x == 1){
                   
                    System.out.println("Which Hero do you want to Heal?");
                    System.out.print("1: " + Held1.name); System.out.println(" || HP: " + Held1.lebenspunkte + "/50");
                    System.out.print("2: " + Held2.name); System.out.println(" || HP: " + Held2.lebenspunkte + "/40");
                    System.out.print("3: " + Held3.name); System.out.println(" || HP: " + Held3.lebenspunkte + "/30");
                    System.out.print("4: " + Held4.name); System.out.println(" || HP: " + Held4.lebenspunkte + "/60");
                    System.out.print("5: exit");
                    System.out.println();

                    
                    switch (s.nextInt()) {

                        case 1:
                            
                            if (Held1.inWarteschlange == false && Held1.tod == false) {
                                Healer.wartebank.add(Held1);
                                Held1.inWarteschlange = true;
                                
                            }
                            else{
                                System.out.println("That hero is already with the Healer!!");
                                System.out.println();
                                
                                
                            }
                            
                        break;

                        case 2:
                            if (Held2.inWarteschlange == false && Held2.tod == false) {
                                Healer.wartebank.add(Held2);
                                Held2.inWarteschlange = true;
                            }
                            else{
                                System.out.println("That hero is already with the Healer!!");
                                System.out.println();
                            }
                            
                        break;

                        case 3:
                            if (Held3.inWarteschlange == false && Held3.tod == false) {
                                Healer.wartebank.add(Held3);
                                Held3.inWarteschlange = true;
                            }
                            else{
                                System.out.println("That hero is already with the Healer!!");
                                System.out.println();
                            }
                            
                        break;

                        case 4:
                            if (Held4.inWarteschlange == false && Held4.tod == false) {
                                Healer.wartebank.add(Held4);
                                Held4.inWarteschlange = true;
                            }
                            else{
                                System.out.println("That hero is already with the Healer!!");
                                System.out.println();
                            }
                            
                        break;

                        case 5:
                            x = 2;
                        break;

                        default:
                        x = 2;
                        break;
                    }
                }
            }

            System.out.println("Do you want to go to the smith??");
            System.out.println("1: Yes");
            System.out.println("2: No");
            int g = r.nextInt();
            
            if (g == 1) {
                while (g == 1) {
                    System.out.println("Your money: " + HI.money);
                    System.out.println("Which weapon do you want to repair??");
                    System.out.println();

                    System.out.println("----------------------------");
                    for(int i = 0; i < HI.Helden_waffen_inventar.size(); i++ ){ 
                        System.out.println(i + ": " + HI.getwaffenName(i, HI.Helden_waffen_inventar.get(i)) + " || durability : " + HI.Helden_waffen_inventar.get(i).durability);
                    }
                    System.out.println(HI.Helden_waffen_inventar.size() + ": exit");
                    System.out.println("----------------------------");

                    int z = r.nextInt(); 
                    if (z < HI.Helden_waffen_inventar.size()) {
                        Andre.repair(HI.Helden_waffen_inventar.get(z), HI);
                    }
                    else{
                        g = 2;
                    }

                }
                

            }


        }
    }

    public void Area_Game(monster Dragon,Alle_monster Am,Helden Held1,Helden Held2,Helden Held3,Helden Held4,Heldeninventar HI,Healer Healer, Alle_waffen AW){
        Scanner e = new Scanner(System.in);
        System.out.println("To which area do you want to go??");
        System.out.println("1: Area 1");
        System.out.println("2: Area 2");
        System.out.println("3: Area 3");
        System.out.println("4: Boss");
        
        switch (e.nextInt()) {
            case 1:
                Area = "1";   
            break;
            
            case 2:
                Area = "2";   
            break;

            case 3:
                Area = "3";   
            break;

            case 4:
                Area = "4";
            break;
        
            default:
            break;
        }

        System.out.println("Do you want to fight in area " + Area + "??");
        System.out.println("1: Yes");
        System.out.println("2: No");
        int x = e.nextInt();
        System.out.println();

        while(x == 1){
            
            if (Area != "4") {
                for(int i = 0 ; i < 4 ; i++){
                    Am.newMonster(Area);
                }
            }
            else{
                for(int i = 0 ; i < 3 ; i++){
                    Am.newMonster("5");
                }
                Am.alle_monster.add(Dragon);
                Am.i = Am.i + 1;
            }
            
            
            
            kampf k1 = new kampf();
            k1.fight(Held1, Held2, Held3, Held4,Am.alle_monster.get(Am.i-1), Am.alle_monster.get(Am.i-2), Am.alle_monster.get(Am.i-3), Am.alle_monster.get(Am.i-4), HI, Healer, AW);
            
            if (Dragon.tod == true) {
                break;
            }
            if (alleHelden_tod == true) {
                break;
            }
            
            if (Held1.tod == true && Held2.tod == true && Held3.tod == true && Held4.tod == true) {
                alleHelden_tod = true;
                break;
            }
            if ((Held1.tod == true || Held1.inWarteschlange == true) && (Held2.tod == true || Held2.inWarteschlange == true) && (Held3.tod == true || Held3.inWarteschlange == true) && (Held4.tod == true || Held4.inWarteschlange == true)) {
                alleHelden_tod = true;
                break;
            }
            
            System.out.println("Do you want to fight in area " + Area + "??");
            System.out.println("1: Yes");
            System.out.println("2: No");
            x = e.nextInt();
            System.out.println();
            
            
        }





       
    } 
}


package com.example;
import java.util.Arrays;
import java.util.Scanner; 


 
public class kampf {
    boolean MTod = false;
    boolean HTod = false;
    int i = 0;
    int t = 0;
    boolean alleHelden_tod = false;
    boolean alleMonster_tod = false;
    wuerfel c1 = new wuerfel();
    Scanner s = new Scanner(System.in);

    String RESET = "\u001B[0m";
    String RED = "\u001B[31m";
    


    public void fight(Helden Held1,Helden Held2,Helden Held3,Helden Held4, monster Gegner1,monster Gegner2,monster Gegner3,monster Gegner4, Heldeninventar HI, Healer Healer, Alle_waffen AW){
        
        

        Helden Heldenreihe[] = {Held1,Held2,Held3,Held4};
        monster monstersreihe[] = {Gegner1,Gegner2,Gegner3,Gegner4};

        
        
        System.out.println("You are entering a fight!!");
        System.out.println("-----------------------------");
        System.out.println(Gegner1.name);
        System.out.println(Gegner2.name);
        System.out.println(Gegner3.name);
        System.out.println(Gegner4.name);
        System.out.println("-----------------------------");
        System.out.println();

        System.out.println("Your current weapons are: " );
        System.out.println("-----------------------------");
        System.out.println( Held1.name + " - " + Held1.aktuelleWeapon.name);
        System.out.println( Held2.name + " - " + Held2.aktuelleWeapon.name);
        System.out.println( Held3.name + " - " + Held3.aktuelleWeapon.name);
        System.out.println( Held4.name + " - " + Held4.aktuelleWeapon.name);
        System.out.println("-----------------------------");
        System.out.println();

        System.out.println("Do you want to change your weapons??");
        System.out.println("1: Yes");
        System.out.println("2: No");
    
        
        
        if (s.nextInt() == 1) {
            
            waffentausch_und_Ausgabe(HI, Held1);
            waffentausch_und_Ausgabe(HI, Held2);
            waffentausch_und_Ausgabe(HI, Held3);
            waffentausch_und_Ausgabe(HI, Held4);
        }    
       
        int angriffsreihe[] = {Held1.aktuelleWeapon.speed, Held2.aktuelleWeapon.speed, Held3.aktuelleWeapon.speed, Held4.aktuelleWeapon.speed, Gegner1.speed, Gegner2.speed, Gegner3.speed, Gegner4.speed};
        Arrays.sort(angriffsreihe);
    

        while (alleHelden_tod == false && alleMonster_tod == false) {
            
            boolean H1turn = true;
            boolean H2turn = true;
            boolean H3turn = true;
            boolean H4turn = true;
            boolean G1turn = true;
            boolean G2turn = true;
            boolean G3turn = true;
            boolean G4turn = true;
            
            
            for(int i = 0; i < angriffsreihe.length ; i++){
                
                //Hero1
               
               
                waffencheck(Held1, HI);
                if (Held1.aktuelleWeapon.speed == angriffsreihe[i] && Held1.tod == false && H1turn == true && Held1.inWarteschlange == false) {
                    H1turn = false;
                    //Monsterausgabe
                    System.out.println(Held1.name + " Which Monster do you want to attack?");
                    for(int u = 0; u <= monstersreihe.length - 1; u++){
                        System.out.println((u + 1) + ": " + monstersreihe[u].typ);
                    }
                        
                    t = s.nextInt() - 1;
                    while (monstersreihe[t].tod == true) {
                        System.out.println("The enemy at "+ (t + 1) + " is already dead!!");
                        System.out.println("");
                        System.out.println(Held1.name + " Which Monster do you want to attack?");
                        t = s.nextInt() - 1;
                        System.out.println("");
                    }

                    Heldattack(Held1,monstersreihe[t], t, AW, HI);
                    
                    //exit
                    if (Gegner1.tod == true && Gegner2.tod == true && Gegner3.tod == true && Gegner4.tod == true) {
                        alleMonster_tod = true;
                        break;
                    }

                }    
                
                //Hero2
                waffencheck(Held2, HI);
                if (Held2.aktuelleWeapon.speed == angriffsreihe[i] && Held2.tod == false && H2turn == true && Held2.inWarteschlange == false) {
                    H2turn = false;

                    //Monsterausgabe
                    System.out.println(Held2.name + " Which Monster do you want to attack?");
                    for(int u = 0; u <= monstersreihe.length - 1; u++){
                        System.out.println((u + 1) + ": " + monstersreihe[u].typ);
                    }
                        
                    t = s.nextInt() - 1;
                    while (monstersreihe[t].tod == true) {
                        System.out.println("The enemy at "+ (t + 1) + " is already dead!!");
                        System.out.println("");
                        System.out.println(Held2.name + " Which Monster do you want to attack?");
                        t = s.nextInt() - 1;
                        System.out.println("");
                    }

                    Heldattack(Held2,monstersreihe[t], t, AW, HI);
                    
                    //exit
                    if (Gegner1.tod == true && Gegner2.tod == true && Gegner3.tod == true && Gegner4.tod == true) {
                        alleMonster_tod = true;
                        break;
                    }
                    

                }

                    
            
                
                //Hero3
                waffencheck(Held3, HI);
                if (Held3.aktuelleWeapon.speed == angriffsreihe[i] && Held3.tod == false && H3turn == true && Held3.inWarteschlange == false) {
                    H3turn = false;

                    //Monsterausgabe
                    System.out.println(Held3.name + " Which Monster do you want to attack?");
                    for(int u = 0; u <= monstersreihe.length - 1; u++){
                        System.out.println((u + 1) + ": " + monstersreihe[u].typ);
                    }
                        
                    t = s.nextInt() - 1;
                    while (monstersreihe[t].tod == true) {
                        System.out.println("The enemy at "+ (t + 1) + " is already dead!!");
                        System.out.println("");
                        System.out.println(Held3.name + " Which Monster do you want to attack?");
                        t = s.nextInt() - 1;
                        System.out.println("");
                    }
                    
                    Heldattack(Held3,monstersreihe[t], t, AW, HI); 
                    
                    //exit
                    if (Gegner1.tod == true && Gegner2.tod == true && Gegner3.tod == true && Gegner4.tod == true) {
                        alleMonster_tod = true;
                        break;
                    }


                }

                    
            
                
                //Held4
                waffencheck(Held4, HI);
                if (Held4.aktuelleWeapon.speed == angriffsreihe[i] && Held4.tod == false && H4turn == true && Held4.inWarteschlange == false) {
                    H4turn = false;

                    //Monsterausgabe
                    System.out.println(Held4.name + " Which Monster do you want to attack?");
                    for(int u = 0; u <= monstersreihe.length - 1; u++){
                        System.out.println((u + 1) + ": " + monstersreihe[u].typ);
                    }
                        
                    t = s.nextInt() - 1;
                    while (monstersreihe[t].tod == true) {
                        System.out.println("The enemy at "+ (t + 1) + " is already dead!!");
                        System.out.println("");
                        System.out.println(Held4.name + " Which Monster do you want to attack?");
                        t = s.nextInt() - 1;
                        System.out.println("");
                    }

                    Heldattack(Held4,monstersreihe[t], t, AW, HI);
                    
                    //exit
                    if (Gegner1.tod == true && Gegner2.tod == true && Gegner3.tod == true && Gegner4.tod == true) {
                        alleMonster_tod = true;
                        break;
                    }


                }

                
                if ((Held1.tod == true || Held1.inWarteschlange == true) && (Held2.tod == true || Held2.inWarteschlange == true) && (Held3.tod == true || Held3.inWarteschlange == true) && (Held4.tod == true || Held4.inWarteschlange == true)) {
                    alleHelden_tod = true;
                    System.out.println("You have no heros left to fight!!");
                    break;
                }
                
                //Gegner 1
                if (Gegner1.speed == angriffsreihe[i] && Gegner1.tod == false && G1turn == true){
                    G1turn = false;

                    int c = c1.wuerfeln1(3) - 1;
                    while (Heldenreihe[c].tod == true || Heldenreihe[c].inWarteschlange == true) {
                        c = c1.wuerfeln1(3) - 1;
                    }
                    
                    Gegnerangriff(Gegner1, Heldenreihe[c]);
                    
                }
                if (Held1.tod == true && Held2.tod == true && Held3.tod == true && Held4.tod == true) {
                    alleHelden_tod = true;
                    System.out.println("All heros are dead!!");
                    break;
                }
                
                //Gegner 2
                if (Gegner2.speed == angriffsreihe[i] && Gegner2.tod == false && G2turn == true){
                    G2turn = false;
            
                    int c = c1.wuerfeln1(3) - 1;
                    while (Heldenreihe[c].tod == true || Heldenreihe[c].inWarteschlange == true) {
                        c = c1.wuerfeln1(3) - 1;
                    }
                    Gegnerangriff(Gegner2, Heldenreihe[c]);
                }
                if (Held1.tod == true && Held2.tod == true && Held3.tod == true && Held4.tod == true) {
                    alleHelden_tod = true;
                    System.out.println("All heros are dead!!");
                    break;
                }

               
                //Gegner 3
                if (Gegner3.speed == angriffsreihe[i] && Gegner3.tod == false && G3turn == true){
                    G3turn = false;
            
                    int c = c1.wuerfeln1(3) - 1;
                    while (Heldenreihe[c].tod == true || Heldenreihe[c].inWarteschlange == true) {
                        c = c1.wuerfeln1(3) - 1;
                    }
                    Gegnerangriff(Gegner3, Heldenreihe[c]);
                }
                if (Held1.tod == true && Held2.tod == true && Held3.tod == true && Held4.tod == true) {
                    alleHelden_tod = true;
                    System.out.println("All heros are dead!!");
                    break;
                }
                
                //Gegner 4
                if (Gegner4.speed == angriffsreihe[i] && Gegner4.tod == false && G4turn == true){
                    G4turn = false;
            
                    int c = c1.wuerfeln1(3) - 1;
                    while (Heldenreihe[c].tod == true || Heldenreihe[c].inWarteschlange == true) {
                        c = c1.wuerfeln1(3) - 1;
                    }
                    Gegnerangriff(Gegner4, Heldenreihe[c]);
                }
                if (Held1.tod == true && Held2.tod == true && Held3.tod == true && Held4.tod == true) {
                    alleHelden_tod = true;
                    System.out.println("All heros are dead!!");
                    break;
                }

                
                
            }
            
            
        }
        
        
        if(alleMonster_tod == true){
            System.out.println("all Enemys have been slain!!");
        }

        if (Held1.tod == true) {
            Held1.fight_count = Held1.fight_count + 1;
            Healer.resurrect(Held1);
        }
        if (Held2.tod == true) {
            Held2.fight_count = Held2.fight_count + 1;
            Healer.resurrect(Held2);
        }
        if (Held3.tod == true) {
            Held3.fight_count = Held3.fight_count + 1;
            Healer.resurrect(Held3);
        }
        if (Held4.tod == true) {
            Held4.fight_count = Held4.fight_count + 1;
            Healer.resurrect(Held4);
        }

        
        if (Healer.wartebank.size() > 0) {
            if (Held1 == Healer.wartebank.get(0)) {
                Held1.fight_count = Held1.fight_count + 1;
            }
            if (Held2 == Healer.wartebank.get(0)) {
                Held2.fight_count = Held2.fight_count + 1;
            }
            if (Held3 == Healer.wartebank.get(0)) {
                Held3.fight_count = Held3.fight_count + 1;
            }
            if (Held4 == Healer.wartebank.get(0)) {
                Held4.fight_count = Held4.fight_count + 1;
            }
            Healer.wartebank_schlange();
        }
        

       

        System.out.println("");

    }
       


    public void Heldattack(Helden Held, monster Gegner, int t, Alle_waffen AW, Heldeninventar HI){

        
        Held.angriff(Held);
        Gegner.verteidigen(Gegner);

        if (Held.Matk > Gegner.getVerteidigung()) {
            Gegner.lebenspunkte = Gegner.getLebenspunkte() - Held.Matk;
            
            if (Gegner.getLebenspunkte() <= 0) {
                System.out.println("The enemy " + Gegner.name + " has been slain!!");
                HI.getMoney(Gegner);
                System.out.println();
                System.out.println("You have " + HI.money + " money!!");

                Gegner.lebenspunkte = 0;
                Gegner.tod = true;
                Held.aktuelleWeapon.durability = Held.aktuelleWeapon.durability - 10;
                System.out.println(Held.name + "s " + Held.aktuelleWeapon.name + "  has " +  Held.aktuelleWeapon.durability + " durability left!!");
                AW.newWaffe(Gegner.wmulti);
                System.out.println();
                System.out.println("Your enemy dropped: " + AW.alle_waffen.get(AW.i - 1).name);
                System.out.println();
                System.out.println("Do you want to pick it up??");
                System.out.println("1: Yes");
                System.out.println("2: No");
                if (s.nextInt() == 1) {
                    HI.Helden_waffen_inventar.add(AW.alle_waffen.get(AW.i - 1));
                }
                System.out.println();
                

            }


            if (Gegner.tod == false) {
                System.out.println("you dealt " + (Held.Matk - Gegner.Mdef) + " damage!!");
                System.out.println("The "+ Gegner.typ + " has " + Gegner.getLebenspunkte() + " HP left!!");   
                
            }
            System.out.println("");
            System.out.println("");
        }
        else{
            System.out.println("The enemy has blocked all damage!!");
            System.out.println("");
        }
            
                    
    }


    public void waffentausch_und_Ausgabe(Heldeninventar HI, Helden Held){

        
        System.out.println("----------------------------");
        for(int i = 0; i < HI.Helden_waffen_inventar.size(); i++ ){ 
            System.out.println(i + ": " + HI.getwaffenName(i, HI.Helden_waffen_inventar.get(i)) + " || durability : " + HI.Helden_waffen_inventar.get(i).durability + " || used : " + HI.Helden_waffen_inventar.get(i).used);
        }
            System.out.println("----------------------------");
        int o = 0;
        while (o == 0) {
            System.out.println(Held.name + " which weapon do you want?");
            int c = Held.nextw;
            Held.nextw = s.nextInt();

            if (Held.nextw < HI.Helden_waffen_inventar.size() && (HI.Helden_waffen_inventar.get(Held.nextw).used == false || HI.Helden_waffen_inventar.get(Held.nextw) == Held.aktuelleWeapon)) { 
                if(HI.Helden_waffen_inventar.get(Held.nextw).durability > 1){
                    o = 1;
                    HI.Helden_waffen_inventar.get(c).used = false;
                }
                else{
                    System.out.println("That weapon ist broken!!");
                    System.out.println();
                }
            }
            
            else{
                System.out.println("The weapon is not there or in use!!");
                System.out.println("");
            }

        } 
        Held.waffentausch(Held, HI);
        System.out.println();
    }
    


    public void waffencheck(Helden Held, Heldeninventar HI){
        
        if(Held.aktuelleWeapon.durability < 1){
            System.out.println("Your curent weapon is broken!!");
            
            waffentausch_und_Ausgabe(HI, Held);
        }
    }



    public void Gegnerangriff(monster Gegner, Helden Held){
        
        Held.verteidigen(Held);
        Gegner.angriff(Gegner);
        
        if (Held.Mdef < Gegner.Matk) {
            Held.lebenspunkte = Held.lebenspunkte - Gegner.Matk + Held.Mdef;
            System.out.println("The enemy "+ Gegner.name + " delt " + Held.name + " " + Gegner.Matk + " damage!!");
            System.out.println("You defendet " + Held.Mdef + " damage!!");
            
            if (Held.lebenspunkte < 1) {
                Held.tod = true;
                System.out.println(RED + Held.name + " is dead!!" + RESET);
                
            }
            else{
                System.out.println(Held.name + " has " + Held.lebenspunkte + "HP left!!");
            }
        }
        else{
            System.out.println("The enemy " + Gegner.name +  " delt no damage!!");
        }
        System.out.println();
    }
    
}
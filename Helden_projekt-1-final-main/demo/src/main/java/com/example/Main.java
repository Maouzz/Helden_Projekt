package com.example;





public class Main {
    public static void main(String[] args) {
       
        
        //////////////// NPCs
        Healer Healer  = new Healer();
        Schmied Andre = new Schmied();

        //////////////// Objekte Waffen
        Alle_waffen AW = new Alle_waffen(0);

        waffen Fist = new waffen("","Fist","", 0.0, 0.0,0,0,false);
        Fist.Stats(Fist);
        

        //////////////// Objekte Helden
        Helden Paladin = new Helden("Faraway Paladin","Paladin",0,0,0,0,Fist,0,0,0,false,0, false);
        Paladin.stats(Paladin);
        Helden Thief = new Helden("Keef the Thief","Thief",0,0,0,0,Fist,0,0,0,false,0, false);
        Thief.stats(Thief);
        Helden Mage = new Helden("Ainz-Ooal-Gown","Mage",0,0,0,0,Fist,0,0,0,false,0, false);
        Mage.stats(Mage);
        Helden Babar = new Helden("Bödwar the slayer","Babar",0,0,0,0,Fist,0,0,0,false,0, false);
        Babar.stats(Babar);
        
        
        ///////////////// Helden waffen 
        Heldeninventar HI = new Heldeninventar();

        HI.Helden_waffen_inventar.add(Fist);
        
    
        ///////////////// Objekte monster
        Alle_monster Am = new Alle_monster(0);

        monster Dragon = new monster("","Dragon",0,0,0,0,0,0,0,false);
        Dragon.stats(Dragon);
        

        /////Game
        Gameplay g1 = new Gameplay();
        g1.Game(Am, Dragon, Paladin, Thief, Mage, Babar, HI, Healer, AW, Andre);

       
    }
   
 
}

package com.example;

public class wuerfel {
   double anzahlSeiten;
   

   public int wuerfeln1(double anzahlSeiten) {

      double k = Math.random() * anzahlSeiten + 1;
      Long x = Math.round(k);
      int l = Long.valueOf(x).intValue();
      return l; 
   }
   
   public double wuerfeln2(double anzahlSeiten) {
        
      double z1 = (double)(Math.random() * anzahlSeiten + 1);
      double d = Math.pow(10, 2);
      return Math.round(z1 *d)/ d;
   }
}

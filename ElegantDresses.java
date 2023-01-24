/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elegantdresses;

/**
 *
 * @author User
 */
public class ElegantDresses {
   
     public static  double [] Dresses(){
          
         double g []= {1000,2000,3000,4000};
         return g;
     }
     public static String [] TypesOfDresses ( ){
         System.out.println( " أنواع الفساتين:");
        String j []= new String [4];
        j[0]="فساتين السهره ";
        j[1]="فساتين الزواج ";
        j[2]="فساتين قصيره ";
        j[3]="فساتين طويله ";
        for (int y = 0; y < j.length; y++)
         System.out.println(j[y]);
        return  j ;
  }
          public static String [] Of ( ) {
             System.out.println(" مقاسات الفساتين:"); 
        String d [ ]= new String [4];
        d[0]="s";
        d[1]="M";
        d[2]="L ";
        d[3]="XL";
        for (int y = 0; y < d.length; y++)
         System.out.println(d[y]);
        return d;
  }
          public static double  Discount ( ) {
         double disc=10;
         return disc;
  } 
    public static void main(String[] args) {
        // TODO code application logic here
      TypesOfDresses ( );
       Of ();
     double [] g = Dresses();
    double xdis = Discount (); 
    
      for (int c = 0; c < g.length; c++){
         System.out.println("\nسعر الفساتين:"+g[c]);
         double dis=g[c]-(g[c]*xdis)/100;
         System.out.println("سعر الفساتين بعد خصم:"+dis);}
    }  
}

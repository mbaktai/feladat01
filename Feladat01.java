package feladat01;

public class Feladat01 {
          public int feladat01(String[] colors){
              int mixedColors = 0;
              for(int i = 2; i <= colors.length; i++){
                  mixedColors += combination(colors.length,i);
              }             
              return mixedColors;
          }
          
          //Faktorialis szamitasa
          int fact(int n){
              int fact = 1;
              for(int i = 2; i <= n; i++){
                  fact = fact *i;
              }
              return fact;
          }
          
          //Ismetles nelkuli kombinacio
          int combination(int n,int r){
              return fact(n)/(fact(n-r)*fact(r));
          }        
}

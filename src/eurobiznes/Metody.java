/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eurobiznes;

import java.util.Random;

/**
 *
 * @author Basian
 */
public class Metody {
    int Kostka1,Kostka2;
    Gracz gracz = new Gracz();
    
    
    
    public void rzutKostkami(){
        Random generator = new Random();
       
        this.Kostka1=generator.nextInt(6)+1;        
        this.Kostka2=generator.nextInt(6)+1;
        int sumaKostek=Kostka1+Kostka2;
        if(Kostka1==Kostka2){
          idzieszDoWiezienia();
        }
        else{
          gracz.setAktualnePole(gracz.getAktualnePole()+sumaKostek); 
        }
     
        //System.out.println(gracz.AktualnePole);
    }
    
    public void idzieszDoWiezienia(){
        gracz.setAktualnePole(11);
    }
    
    public void idzieszDoWiednia(){
        gracz.setAktualnePole(40);
    }
   
}

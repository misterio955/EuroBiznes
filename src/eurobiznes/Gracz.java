/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eurobiznes;

/**
 *
 * @author Basian
 */
public class Gracz {
    
    int AktualnePole;
    int budzet;
    int DniWiezienia;
    String nazwaGracza;

    public Gracz(String nazwaGracza) {
        AktualnePole=1;
        budzet=3000;
        DniWiezienia=0;
        this.nazwaGracza = nazwaGracza;
    }

   
    
    public int getAktualnePole() {
        return AktualnePole;
    }

    public void setAktualnePole(int AktualnePole) {
        this.AktualnePole = AktualnePole;
    }

    public String getNazwaGracza() {
        return nazwaGracza;
    }
  
}

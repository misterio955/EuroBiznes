/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eurobiznes;

import eurobiznes.plansza.Miasto;
import eurobiznes.plansza.Plansza;
import java.io.IOException;

/**
 *
 * @author Basian
 */
public class EuroBiznes {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Miasto mia = new Miasto();
        Gracz gracz = new Gracz("dzik");
        gracz.setAktualnePole(6);
        Plansza pla = new Plansza();
        pla.uzupelnieniePlanszy();
        pla.ustawWlasciciela(gracz.getAktualnePole(),gracz.getNazwaGracza());
        
        
    }
    
}

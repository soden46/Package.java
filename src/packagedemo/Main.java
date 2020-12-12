/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagedemo;
import pagi.MenuPagi;
import siang.MenuSiang;
import sore.MenuSore;
/**
 *
 * @author SYARIF
 */
public class Main {
    static MenuPagi menuPagi;
    static MenuSiang menuSiang;
    static MenuSore menuSore;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menuPagi = new MenuPagi();
        menuPagi.info();
        
        menuSiang = new MenuSiang();
        menuSiang.info();
        
        menuSore = new MenuSore();
        menuSore.info();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package loggertest;

import java.util.logging.*;

import loggertest.logar.Loga;
import loggertest.logamais.LogaMais;
import loggertest.logamenos.LogaMenos;

/**
 *
 * @author fabio
 */
public class LoggerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*** INICIO ***");
        Loga loga=new Loga();
        LogaMais logaMais=new LogaMais();
        LogaMenos logaMenos=new LogaMenos();
        System.out.println("======================== Loga");
        loga.escreverTodosNiveisLog("vai pro log");
        System.out.println("======================== LogaMais");
        logaMais.escreverTodosNiveisLog("vai pro log");
        System.out.println("======================== LogaMenos");
        logaMenos.escreverTodosNiveisLog("vai pro log");
        System.out.println("***   FIM  ***");
    }
    
}

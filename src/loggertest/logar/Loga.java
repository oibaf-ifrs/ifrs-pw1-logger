/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package loggertest.logar;

import java.util.logging.*;

/**
 *
 * @author fabio
 */
public class Loga {
    private final Logger logger=Logger.getLogger(this.getClass().getPackage().getName());
    
    public Loga() {
    }
    
    public void escreverTodosNiveisLog(String texto) {
        //There are convenience methods for tracing method entries (the "entering"
        //methods), method returns (the "exiting" methods) and throwing
        //exceptions (the "throwing" methods)
        
        logger.entering(this.getClass().toString(), "entrou em escreverTodosNiveisLog");
        
        //Finally, there are a set of convenience methods for use in the very simplest
        //cases, when a developer simply wants to log a simple string at a given log 
        //level. These methods are named after the standard Level names ("severe",
        //"warning", "info", etc.) and take a single argument, a message string. 
        logger.finest(texto);
        logger.finer(texto);
        logger.fine(texto);
        logger.config(texto);
        logger.info(texto);
        logger.warning(texto);
        logger.severe(texto);

        //There are a set of "logp" methods (for "log precise") that are like the "log"
        //methods, but also take an explicit source class name and method name. 
        logger.logp(Level.INFO, this.getClass().toString(), "escreverTodosNiveisLog", texto);

        //There are convenience methods for tracing method entries (the "entering"
        //methods), method returns (the "exiting" methods) and throwing
        //exceptions (the "throwing" methods)
        logger.exiting(this.getClass().toString(), "saiu de escreverTodosNiveisLog");
    }
    
    
}

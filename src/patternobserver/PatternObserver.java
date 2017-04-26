/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternobserver;

import java.util.Calendar;
import java.util.Date;
import observers.Assinante;
import subjects.EditoraAdulto;
import subjects.EditoraInfantil;

/**
 *
 * @author Emerson
 */
public class PatternObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EditoraAdulto adulto = new EditoraAdulto();
        
        EditoraInfantil infantil = new EditoraInfantil();
        
        adulto.addObserver(new Assinante());
        
        adulto.criarNovaEdicao();
        
        infantil.addObserver(new Assinante());
        
        infantil.criarNovaEdicao();
                
    }
    
}

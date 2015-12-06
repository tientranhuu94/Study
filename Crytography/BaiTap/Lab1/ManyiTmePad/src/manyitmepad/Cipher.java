/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manyitmepad;

/**
 *
 * @author macpc1
 */
public class Cipher {
//    defind variable
    private String sText;
    /**
     * @return the sText
     */
    
//    constructer

    /**
     *
     * @param t
     */
    public Cipher(String t) {
        this.sText = t;
    }

    Cipher() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getsText() {
        return sText;
    }

    /**
     * @param sText the sText to set
     */
    public void setsText(String sText) {
        this.sText = sText;
    }
    
}

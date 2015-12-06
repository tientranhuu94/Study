/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manyitmepad;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author macpc1
 */
public class Cipher {
//    defind variable

    private String sText;
    private char[] aText;
    private int[] indexSpace;

    /**
     * @return the sText
     */
//    constructer
    /**
     *
     * @param t
     */
    Cipher(String t) {
        this.sText = t;
        StringBuilder output = new StringBuilder();
        String str;
        int n = this.sText.length();
        for (int i = 0; i < n; i += 2) {
            str = this.sText.substring(i, i + 2);
            output.append((char) Integer.parseInt(str, 16));
        }
        this.aText = output.toString().toCharArray();
        this.indexSpace = new int[this.aText.length];
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


    public void Xor(ArrayList<Cipher> ciphers) {
        int myIndex = this.aText.length;
        int otherIndex;
        int len;
        int i, j;
        char tmp;
        System.out.println(ciphers.size());
        for (i = 0; i < 9; i++) {
            System.out.println(Arrays.toString(ciphers.get(i).aText));
            otherIndex = ciphers.get(i).aText.length;
            
           if(myIndex <= otherIndex) {
               len = myIndex;
           } else {
               len = otherIndex;
           }
            for (j = 0; j < len; j++) {
                tmp = (char) (this.aText[j] ^ ciphers.get(i).aText[j]);
                if((tmp>='a' && tmp <='z') || (tmp >='A' && tmp <='Z')) {
                    this.indexSpace[j] ++;
                }
            }
        }
        System.out.println(Arrays.toString(this.indexSpace));
    }
}

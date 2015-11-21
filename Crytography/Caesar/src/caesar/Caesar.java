/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesar;

import static java.lang.String.format;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Slinker
 */
public class Caesar {

    public static String binaryToHex(String bin) {
        return String.format("%21X", Long.parseLong(bin, 2));
    }

    public static void main(String[] args) {
        String str = "431ea9e45132c95b5e5c011ce9efe46d1b698f132801a7341cec50fe2c1e4045e18ec03723d30565ff7b4c2a5ec33013a928a25321b65138ca3146c0355693cd885c5f307a4d98a2bd9f247bc6659b126f8c42329a75920a6a099151428cdeeb37494e7649d07b27a92460245ed5c9096fd89f55f0e06080a8f90b6c715542d41632d924c82c9030746a2105622a2f0a712a339f580ef1990cb05270d77f2dcc6ed1e2465ccc0e6724ffb52dc52b88d5b6bf62a6c3404ce3acdeb0847c5afcba8d623f66ae";
        String Ao[] = new String[str.length()];
        String MangBinary[] = new String[str.length()];
        for (int i = 0, j = 0; i < str.length(); j++, i = i + 2) {
            Ao[j] = str.substring(i, i + 2);

        }
        System.out.println(Ao.length);
        for (int i = 0; i < str.length() / 2; i++) {
            int decimal = Integer.parseInt(Ao[i], 16);
            System.out.println("Binary: " + Ao[i] + "   " + Integer.toBinaryString(decimal));
            MangBinary[i] = Integer.toBinaryString(decimal);
        }
        System.out.println(MangBinary);
        for (int i = 0; i < str.length() / 2; i++) {
            if (MangBinary[i].length() < 8) {
                switch (MangBinary[i].length()) {
                    case 8:
                        break;
                    case 7:
                        MangBinary[i] = "0" + MangBinary[i];
                        break;
                    case 6:
                        MangBinary[i] = "00" + MangBinary[i];
                        break;
                    case 5:
                        MangBinary[i] = "000" + MangBinary[i];
                        break;
                    case 4:
                        MangBinary[i] = "0000" + MangBinary[i];
                        break;
                    case 3:
                        MangBinary[i] = "00000" + MangBinary[i];
                        break;
                    case 2:
                        MangBinary[i] = "000000" + MangBinary[i];
                        break;
                    case 1:
                        MangBinary[i] = "0000000" + MangBinary[i];
                        break;
                    case 0:
                        MangBinary[i] = "00000000" + MangBinary[i];
                        break;
                }
            }
        }
        for (int i = 0; i < str.length() / 2; i++) {
            System.out.println(MangBinary[i]);
        }

    }

}

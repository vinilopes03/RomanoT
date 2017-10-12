/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.romanonumb;

/**
 *
 * @author vinic
 */
public class Romano {

    public int convertRomano(String num) {
        int negativo = 0;
        int total = 0;
        int[] numb = new int[num.length()];

        for (int i = 0; i < num.length(); i++) {
            switch (num.charAt(i)) {
                case 'I':
                    numb[i] = 1;
                    break;
                case 'V':
                    numb[i] = 5;
                    break;
                case 'X':
                    numb[i] = 10;
                    break;
                case 'L':
                    numb[i] = 50;
                    break;
                case 'C':
                    numb[i] = 100;
                    break;
                case 'D':
                    numb[i] = 500;
                    break;
                case 'M':
                    numb[i] = 1000;
                    break;
                default:
                    break;
            }
        }
        if(num.length()>1){
            
            for (int i = 0; i < (num.length()-1); i++) {
                if (numb[i] < numb[i + 1]) {
                    negativo += -(numb[i] * 2);

                }
            }
        }
        
        for (int i = 0; i < num.length() ; i++) {
               total+=numb[i];
        }
        
        total+=negativo;
        
        return total;
    }
}

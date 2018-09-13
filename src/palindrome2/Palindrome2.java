/*
 * Blake Hadaway
 * September 13th, 2018
 * To see how many palindromes there are in a sentence.
 */

package palindrome2;
import javax.swing.*;
/**
 *
 * @author blhad3491
 */
public class Palindrome2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int spacePos, palCounter = 0;
        String palindromes = "";
        String word = JOptionPane.showInputDialog("If a word is the "
               + "same forward and backward, it is called a palindrome. \n"
       +"This program is made to detect if a word is a palindrome.\n \n"+ 
               "Please enter a sentence."+" "+"(Do not include punctiation)");
       String sentence = "";
       String backwardsWord = "";
        while(sentence.length()>0){
            spacePos = sentence.indexOf(" ");
            word = sentence.substring(0,spacePos);
            sentence = sentence.substring(spacePos + 1, sentence.length());
            
            for (int pos= word.length()-1; pos >=0; pos--){  
            backwardsWord += word.charAt(pos);
            
            }
            if (word.equalsIgnoreCase(backwardsWord)){
            palCounter += 1;
            palindromes += word + ", ";
            
            }
            else if(word != backwardsWord){
            
            }
        }
    }
}

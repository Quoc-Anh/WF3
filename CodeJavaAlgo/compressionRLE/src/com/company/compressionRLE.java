package com.company;

import java.util.Arrays;

public class compressionRLE {
        public static void main(String[] args) {
                String string = "DDDADAZDAZDASDDDDSSSSQQQ";
                System.out.println(string);
                System.out.println();
                String new_String = compresserChaine(string);

                System.out.println("compresser : " + new_String);
                System.out.println();
                System.out.println("décompresser : " + decompressChaine(new_String));

        }


        public static String compresserChaine(String string) {
                char charReader, oldCharReader;
                int nbOccurences = 0;
                String new_String = "";

                charReader = Character.MIN_VALUE;
                oldCharReader = string.charAt(0); // Character.MIN_VALUE;
                // On va parcourir la chaine
                // On stocke le nombre d'occurences
                // On stocke le caractère lu
                for(int i = 0 ; i < string.length() ; i++) {
                        charReader = string.charAt(i);

                        // Si le caractère en-cours de lecture est différent du caractère
                        // précédemment lu
                        if(charReader != oldCharReader) {
                                if(nbOccurences >= 2)
                                        new_String += String.valueOf(nbOccurences)  + oldCharReader;
                                else
                                        new_String += oldCharReader;
                                if(i == string.length()-1){new_String += charReader;};
                                oldCharReader = charReader;
                                nbOccurences = 1;
                        } // if(charReader != oldCharReader)
                        else {
                                nbOccurences++;

                                if(i == string.length() - 1)
                                        new_String += String.valueOf(nbOccurences) + oldCharReader;
                        }
                }

                return new_String;
        }

        public static String decompressChaine(String string){
                String new_String = "";

                //codeAscii transform to char so it's not string. Ex: number:[0-9] -> Ascii:[48-57]
                int codeAscii_0 = 48;
                int codeAscii_9 = 57;
                char charReader;



                int nb_Char = 0;
                for (int i = 0 ; i < string.length() ; i++){

                        charReader = string.charAt(i); //read char
                        int ascii_String = (int) charReader; //transform char to ascii

                        //check number or letter
                        if(ascii_String >= codeAscii_0 && ascii_String <= codeAscii_9){

                                if (nb_Char != 0){
                                        nb_Char = (nb_Char * 10) + (ascii_String - codeAscii_0);
                                }
                                else{
                                        nb_Char = ascii_String - codeAscii_0;
                                }

                        }else{
                                if (nb_Char > 0){
                                        for (int j = 0 ; j < nb_Char ; j++) {
                                                new_String += charReader;
                                        }
                                        nb_Char = 0;
                                }
                                else{
                                        new_String += charReader;
                                }
                        }
                }
                return new_String;
        }

}
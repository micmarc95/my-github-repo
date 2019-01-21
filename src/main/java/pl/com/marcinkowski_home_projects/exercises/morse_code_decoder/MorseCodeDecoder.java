package pl.com.marcinkowski_home_projects.exercises.morse_code_decoder;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class MorseCodeDecoder {

    private static final Map<String, Character> morseAlphabet  = new HashMap<>();

    static {
        morseAlphabet.put(".-", 'A');
        morseAlphabet.put("-...", 'B');
        morseAlphabet.put("-.-.", 'C');
        morseAlphabet.put("-..", 'D');
        morseAlphabet.put(".", 'E');
        morseAlphabet.put("..-.", 'F');
        morseAlphabet.put("--.", 'G');
        morseAlphabet.put("....", 'H');
        morseAlphabet.put("..", 'I');
        morseAlphabet.put(".---", 'J');
        morseAlphabet.put("-.-", 'K');
        morseAlphabet.put(".-..", 'L');
        morseAlphabet.put("--", 'M');
        morseAlphabet.put("-.", 'N');
        morseAlphabet.put("---", 'O');
        morseAlphabet.put(".--.", 'P');
        morseAlphabet.put("--.-", 'Q');
        morseAlphabet.put(".-.", 'R');
        morseAlphabet.put("...", 'S');
        morseAlphabet.put("-", 'T');
        morseAlphabet.put("..-", 'U');
        morseAlphabet.put("...-", 'V');
        morseAlphabet.put(".--", 'W');
        morseAlphabet.put("-..-", 'X');
        morseAlphabet.put("-.--", 'Y');
        morseAlphabet.put("--..", 'Z');
        morseAlphabet.put("-----", '0');
        morseAlphabet.put(".----", '1');
        morseAlphabet.put("..---", '2');
        morseAlphabet.put("...--", '3');
        morseAlphabet.put("....-", '4');
        morseAlphabet.put(".....", '5');
        morseAlphabet.put("-....", '6');
        morseAlphabet.put("--...", '7');
        morseAlphabet.put("---..", '8');
        morseAlphabet.put("----.", '9');
    }

    public static void main(String[] args) {
        decode();
    }

    public static void decode(){

        String input = JOptionPane.showInputDialog("Podaj treść w morsie (odstęp między literami - Spacja, odstęp między wyrazami - 3x Spacja)");
        StringBuilder result = new StringBuilder();

        while (input.contains(" ")){

            if (input.startsWith("  ")){
                result.append(" ");
                input = input.substring(2);
            } else {

                int letterIndex = input.indexOf(" ");
                String letter = input.substring(0,letterIndex);
                result.append(morseAlphabet.get(letter));
                input = input.substring(letterIndex + 1);}
        }

        result.append(morseAlphabet.get(input));
        JOptionPane.showMessageDialog(null, result);
    }
}
package sessions.session_04;

import sessions.Session;

public class MorseCode extends Session {
    private final String[] morseTable = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "/"};
    private final String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "K", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", " "};
    private final String[] code;

    public MorseCode() {
        this.code = getCode();
    }

    public String convertToAlphaNumeric() {
        StringBuilder morse = new StringBuilder();

        for (int i = 0; i < this.code.length; i++) {
            for (int j = 0; j < this.alphabet.length; j++) {
                if (this.alphabet[j].equals(this.code[i])) {
                    if(i != this.code.length - 1) {
                        morse.append(this.morseTable[j]).append(" ");
                    } else {
                        morse.append(this.morseTable[j]);
                    }
                }
            }
        }

        return morse.toString();
    }

    private String[] getCode() {
        this.getData("Código morse: ");
        if(!this.input.matches("[a-zA-Z0-9\\s]+")) {
            System.out.println("Invalid data");
            System.exit(1);
        }

        return this.input.toUpperCase().split("");
    }
}

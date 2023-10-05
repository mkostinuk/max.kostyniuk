package Crypt;

public class CaesarCipher {
private char[]  charMessage;
private int key;

    public CaesarCipher(char[] charMessage, int key) {
        this.charMessage = charMessage;
        this.key = key;
    }


    public char[] ENCRYPT() {
        char[] newCharMessage=charMessage;
        for (int i = 0; i < newCharMessage.length; i++) {
            if (Character.isLetter(newCharMessage[i])) {
                if (Character.isUpperCase(newCharMessage[i])) {
                    if (newCharMessage[i] >= 'A' && newCharMessage[i] <= 'Z') {
                        char letter = newCharMessage[i];
                        for (int j = 0; j < key; j++) {
                            letter++;
                            if (letter > 'Z') {
                                letter = 'A';
                            }
                        }
                        newCharMessage[i] = letter;
                    }
                    if (newCharMessage[i] >= 'А' && newCharMessage[i] <= 'Я') {
                        char letter = newCharMessage[i];
                        for (int j = 0; j < key; j++) {
                            letter++;
                            if (letter > 'Я') {
                                letter = 'А';
                            }
                        }
                        newCharMessage[i] = letter;
                    }

                } else if (Character.isLowerCase(newCharMessage[i])) {
                    if (newCharMessage[i] >= 'a' && newCharMessage[i] <= 'z') {
                        char letter = newCharMessage[i];
                        for (int j = 0; j < key; j++) {
                            letter++;
                            if (letter > 'z') {
                                letter = 'a';
                            }
                        }
                        newCharMessage[i] = letter;
                    }
                    if (newCharMessage[i] >= 'а' && newCharMessage[i] <= 'я') {
                        char letter = newCharMessage[i];
                        for (int j = 0; j < key; j++) {
                            letter++;
                            if (letter > 'я') {
                                letter = 'а';
                            }
                        }
                        newCharMessage[i] = letter;
                    }


                }
            }
        }

        return newCharMessage;
    }
    public char[] DECRYPT() {
        char[] newCharMessage=charMessage;
        for (int i = 0; i < newCharMessage.length; i++) {
            if (Character.isLetter(newCharMessage[i])) {
                if (Character.isUpperCase(newCharMessage[i])) {
                    if (newCharMessage[i] >= 'A' && newCharMessage[i] <= 'Z') {
                        char letter = newCharMessage[i];
                        for (int j = 0; j < key; j++) {
                            letter--;
                            if (letter < 'A') {
                                letter = 'Z';
                            }
                        }

                        newCharMessage[i] = letter;
                    }
                    if (newCharMessage[i] >= 'А' && newCharMessage[i] <= 'Я') {
                        char letter = newCharMessage[i];
                        for (int j = 0; j < key; j++) {
                            letter--;
                            if (letter < 'А') {
                                letter = 'Я';
                            }
                        }
                        newCharMessage[i] = letter;
                    }

                } else if (Character.isLowerCase(newCharMessage[i])) {
                    if(newCharMessage[i]>='a' && newCharMessage[i]<='z'){
                        char letter = newCharMessage[i];
                        for (int j = 0; j < key; j++) {
                            letter--;
                            if (letter < 'a') {
                                letter = 'z';
                            }
                        }
                        newCharMessage[i] = letter;
                    }
                    if (newCharMessage[i] >= 'а' && newCharMessage[i] <= 'я') {
                        char letter = newCharMessage[i];
                        for (int j = 0; j < key; j++) {
                            letter--;
                            if (letter < 'а') {
                                letter = 'я';
                            }
                        }
                        newCharMessage[i] = letter;
                    }
                }
            }
        }
        return newCharMessage;
    }





}

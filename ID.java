package project;

import java.util.Random;

public class ID {
    Random random = new Random();
    private String idString;

    public void setID() {
        String alphabet = "abcdefghijklmnopqrstuwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        int length = 64;
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        this.idString = sb.toString();
    }

    public void setID(String idString) {
        this.idString = idString;
    }

    public String getID() {
        return this.idString;
    }
}

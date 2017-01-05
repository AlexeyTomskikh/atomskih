package ru.job4j;

public class Paint {

    public String piramid(int h) {
        StringBuilder line1 = new StringBuilder();
        for (int i = 0; i < h; i++) {
            for (int j = i; j <= h; j++) {
                System.out.print(" ");
            }
            line1.append("^ ");
        }
        return line1.toString();
    }
}

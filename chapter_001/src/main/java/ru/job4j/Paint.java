package ru.job4j;

public class Paint {

    public String piramid(int h) {
        StringBuilder line1 = new StringBuilder();
        for (int i = 0; i < h; i++) {
            for (int j = i; j < h; j++) {
                line1.append(" ");
            }
            for (int k = 0; k <= i; k++) {
                line1.append("^");
                if (k < i) {
                    line1.append(" ");
                } else {
                    line1.append("\n");
                }
            }
        }
        return line1.toString();
    }
}

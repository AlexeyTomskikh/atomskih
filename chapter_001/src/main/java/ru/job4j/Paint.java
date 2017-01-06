package ru.job4j;

public class Paint {

    public String piramid(int h) {
        StringBuilder line1 = new StringBuilder();
        for (int i = 0; i < h; i++) {   // цикл считает строки
            for (int j = i; j < h; j++) { //цикл печатает пробелы перед пирамидкой
                line1.append("1");
            }
            for(int k = 0; k <= i; k++) { // цикл печатает ^ в строках
                line1.append("^");
                if (k < i){
                    line1.append("2");
                }else {
                    line1.append("\n");
                }
            }
        }
        return line1.toString();
    }
}

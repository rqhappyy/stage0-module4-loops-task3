package school.mjc.stage0.loops.task3;

import org.w3c.dom.ls.LSOutput;

public class AlphabetPrinter {
    public static void printAlphabet() {
        char a = 96;
        for (int i = 0; i<=25; i++){
            a++;
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        printAlphabet();
    }
}

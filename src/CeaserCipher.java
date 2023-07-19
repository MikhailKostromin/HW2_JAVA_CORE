import java.util.Scanner;

/**
 * Написать метод «Шифр Цезаря»,
 * с булевым параметром зашифрования и расшифро- вания и числовым ключом;
 */

public class CeaserCipher {
    private static final String alphabet = "абвгдеёжзиклмнопрстуфхцчшщъыьэя";

    private static char symbol_right_shift(char symbol, int shift) {
        if (alphabet.indexOf(symbol) != -1) {
            return alphabet.charAt((alphabet.indexOf(symbol) + shift) % alphabet.length());
        } else {
            return symbol;
        }
    }

    public static String reverse(String s) {
        if (s.length() == 1) return s;
        return "" + s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
    }

    private static char symbol_left_shift(char symbol, int shift) {
        if (reverse(alphabet).indexOf(symbol) != -1) {
            return reverse(alphabet).charAt((reverse(alphabet).indexOf(symbol) + shift) % reverse(alphabet).length());
        } else {
            return symbol;
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите текст, который хотите зашифровать:");
//        Scanner scan = new Scanner(System.in);
//        String text = scan.nextLine();
        String text = "Шифр для меня";
        text = text.toLowerCase();
        System.out.println("Введите ключевой сдвиг:");
//        Scanner keyInput = new Scanner(System.in);
//        int shift = keyInput.nextInt();
        int shift = 3;

        System.out.println("Зашифрованный текст:");
        for (int i = 0; i < text.length(); ++i) {
            System.out.print(symbol_right_shift(text.charAt(i), shift));
        }
        System.out.println();

        System.out.println("Введите текст, который хотите расшифровать:");
//        Scanner scan2 = new Scanner(System.in);
//        String text2 = scan2.nextLine();
        String text2 = "ымчу жов пзрв";
        text2 = text2.toLowerCase();
        System.out.println("Расшифрованный текст:");
        for (int i = 0; i < text2.length(); i++) {
            System.out.print(symbol_left_shift(text2.charAt(i), shift));
        }
    }
}
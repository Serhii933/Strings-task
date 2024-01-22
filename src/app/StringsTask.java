package app; import java.util.Scanner;

public class StringsTask {

    public static void main(String[] args) {

        String[] words1 = {"brange", "plum", "tomato", "onibn", "grape"};
        correctWordsAndPrint(words1);


        String[] words2 = {"orange", "plum", "tomato", "onion", "grape", "onion"};
        removeOnionAndPrint(words2);


        String[] names = {"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};
        searchAndPrintNameCount(names);
    }


    private static void correctWordsAndPrint(String[] words) {
        System.out.println("Завдання 1:");
        for (int i = 0; i < words.length; i++) {
            words[i] = correctWord(words[i]);
            System.out.println((i + 1) + ") " + words[i]);
        }
        System.out.println();
    }

    private static String correctWord(String word) {

        return word.replaceAll("brange", "orange").replaceAll("onibn", "onion");
    }


    private static void removeOnionAndPrint(String[] words) {
        System.out.println("Завдання 2:");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("onion")) {
                System.out.println((i + 1) + ") " + words[i]);
            }
        }
        System.out.println();
    }


    private static void searchAndPrintNameCount(String[] names) {
        System.out.println("Завдання 3:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ім'я для пошуку: ");
        String searchName = scanner.next();

        int count = countOccurrences(names, searchName);
        if (count > 0) {
            System.out.println("Знайдено ім'я '" + searchName + "' " + count + " раз(и).");
        } else {
            System.out.println("Ім'я '" + searchName + "' не знайдено в списку.");
        }
    }

    private static int countOccurrences(String[] arr, String target) {
        int count = 0;
        for (String element : arr) {
            if (element.equals(target)) {
                count++;
            }
        }
        return count;
    }
}
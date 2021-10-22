//forCheck
package HomeTaskOne;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords("Orange", "Banana", "Apple");

        int resultCheckSum = checkSumSign(1, -2);
        printCheckSumSign(resultCheckSum);
        System.out.println();

        int valueForColor = -5;
        printColor(valueForColor);
        System.out.println();

        int numOneForCompare = 1;
        int numSecondForCompare = 2;
        compareNumbers(numOneForCompare, numSecondForCompare);


    }

    public static void printThreeWords(String wordOne, String wordTwo, String wordThree) {
        System.out.println(wordOne + "\n" + wordTwo + "\n" + wordThree + "\n");
    }

    public static int checkSumSign(int numOne, int numSecond) {
        return numOne + numSecond;
    }

    public static void printCheckSumSign(int resultCheckSum) {
        if(resultCheckSum >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    public static void printColor(int valueForColor) {
        if(valueForColor > 0 && valueForColor <= 100) {
            System.out.println("Желтый");
        } else if(valueForColor > 100) {
            System.out.println("Зеленый");
        } else
            System.out.println("Красный");
    }

    public static void compareNumbers(int numOneForCompare, int numSecondForCompare) {
        if (numOneForCompare < numSecondForCompare) System.out.println("numOneForCompare < numSecondForCompare");
        else System.out.println("numOneForCompare >= numSecondForCompare");
    }

}

package main.java;

public class Exercises {

    public Exercises() {

    }

    // WARUNEK DLA SIZE < 0 APLIKUJEMY DO KAŻDEJ METODY
    // Metoda zwraca tablice int zawierającą same 0, jeśli podamy wartość size mniejszych od 0 to zwracamy tablice o wartości 0, dla size większych od 10 zwracamy 10.
    public int[] newZerosArray(int size) {
        if (size < 0) {
            return new int[0];
        } else if (size > 10) {
            return new int[10];
        } else {
            return new int[size];
        }
    }
    
    // Cel: size = 5 -> tablica wartości 0,1,2,3,4. Dla 3 -> 0,1,2 itp
    public int[] arrayFrom0ToSize(int size) {
        int[] array;
        if (size <= 0) {
            array = new int[0];
        } else if (size > 10) {
            array = new int[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = i;
            }
        } else {
            array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = i;
            }
        }
        return array;
    }

    // Cel: size: 3, multiply: 2 - 0, 2, 4 (jak element tablicy jest o indeksie 4 to robimy 4x2 itp.
    public int[] arrayWithMultipliedElements(int size, int multiply) {
        int[] array = new int[0];
        if (size < 0) {
            array = new int[0];
        } else if (size > 10) {
            array = new int[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = i * multiply;
            }
        } else {
            array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = i * multiply;
            }
        }
        return array;
    }

    //     Lecimy ciąg fibonnaciego: 0, 1, 1, 2, 3, 5, 8, 13 itd zależnie od size (czyli jak np dajemy size=6 to mamy 0, 1, 1, 2, 3, 5
    public int[] fibonacciArray(int size) {
        int[] array;
        if (size > 10) {
            array = fibonacii(10);
            }
         else if (size <= 0) {
            array = new int[0];
        } else if (size == 1) {
            array = new int[1];
        } else {
            array = fibonacii(size);
            }return array;
        }



    private int[] fibonacii(int size) {
        int[] array = new int[size];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < (array.length); i++) {
            array[i] = array[i - 1] + array[i - 2];
        }return array;
    }
}










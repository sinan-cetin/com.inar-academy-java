package Chapters.Chapter_07.Exercise_07;

import java.util.Scanner;

public class Exercise07_0512 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten integers");
        int[] list = new int[10];
        //initialize array
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        int[] distinctList = getDistinctList(list);


        System.out.println("The number of distinct number is" + distinctList.length);
        System.out.println("The distinct numbers are: ");
        for (int i = 0; i < distinctList.length; i++) {
            System.out.print(distinctList[i] + " ");
        }
    }

    public static int[] getDistinctList(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (isDistinct(array[i],i,array))
                count++;
        }
        int[] distinctList = createDistinctArray(array,count);
        return distinctList;
    }

    public static boolean isDistinct(int number, int index, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (index == i) continue;
            if (number == array[i])
                return false;
        }
        return true;
    }

    public static int[] createDistinctArray(int[] array, int length) {
        int[] distinctList = new int[length];
        int count = 0;
        for (int i = 0 ; i < array.length; i++) {
            if(isDistinct(array[i], i , array)){
                distinctList[count++] = array[i];

            }
        }
        return distinctList;
    }
}

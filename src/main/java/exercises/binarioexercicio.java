package exercises;

import java.util.Scanner;

public class binarioexercicio {
    static void main(String[] args) {
        Scanner enterScanner = new Scanner(System.in);




    }

    private static int binary(int[] num, int num2){
        int low = 0;
        int high = num.length - 1;

        while (low <= high)[
        int middlePosition = (low + high) / 2;
        int middleNumber = num[middlePosition];

        if (num2 == middleNumber){
            return middlePosition;
        }
        if (num2 < middleNumber){
            high = middlePosition - 1;
        }else{
            low = middlePosition + 1;
        }
    }



}

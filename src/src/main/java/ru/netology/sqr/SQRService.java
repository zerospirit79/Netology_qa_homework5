package ru.netology.sqr;

public class SQRService {

    public static int sqrtCount(int belowLimit, int topLimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if ( i * i >= belowLimit && i * i <= topLimit ) {
                counter++;
            }
        }
        return counter;
    }
}

package com.m2i.poe;

public class Main {

    public static void main(String[] args) {
        int[] tab = {2,-2,99,88,7,13,12,10,18,22};
        System.out.println(isPrime(7));
        System.out.println(isPrime(6));
        System.out.println(isPrime(0));
        System.out.println(isPrime(1001));
        int[] result = getPrimeNumbers(tab);
        for(int i:result) {
            System.out.println(i);
        }
    }

    /**
     *
     * @param n
     * @return trfgdfdgdfue if n is prime toto
     */
    public static boolean isPrime(int n) {
        boolean result = true;
        if(n < 2) {
            result = false;
        }
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static int[] getPrimeNumbers(int[] tab) {
        int[] result = new int[tab.length];
        int index = 0;
        for(int i : tab) {
            if(isPrime(i)) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }
}

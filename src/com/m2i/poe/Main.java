package com.m2i.poe;

public class Main {

    public static void main(String[] args) {
        int[] tab = {3,2,1};
        System.out.println(isPrime(7));
        System.out.println(isPrime(6));
        System.out.println(isPrime(0));
        System.out.println(isPrime(1001));
        int[] result = getPrimeNumbers(tab);
        for(int i:result) {
            System.out.println(i);
        }
        System.out.println(factorielle(5));
        System.out.println(multiplier_recursif(tab,tab.length));
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

    public static int factorielle(int n) {
        if (n==0 || n==1) {
            return 1;
        }
        else {
            int temp = n * factorielle(n - 1);
            return temp;
        }
    }

    public static int multiplier_classic(int[] tab) {
        int res = 1;
        for(int i:tab) {
            res *= i;
        }
        return res;
    }

    public static int multiplier_recursif(int[] tab, int n) {
        if (n == 1) {
            return tab[0];
        }
        else {
            return tab[n-1] * multiplier_recursif(tab, n-1);
        }
    }

    public int sum(int[] tab) {
        int res = 0;
        for(int i:tab) {
            res+=i;
        }
        return res;
    }

    public int max(int[] tab) {
        int res = tab[0];
        for(int i:tab) {
            if(i > res) {
                res = i;
            }
        }
        return res;
    }


}

package com.m2i.poe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        int[] tab = {3,2,1};
        int[] tab2 = new int[10]; // Array
        ArrayList<Integer> l = new ArrayList<Integer>(); // Collection
        l.add(2);
        l.add(4);
        l.add(7);
        l.add(8); // 2 4 7 8
        l.remove(1); // 2 7 8
        int elem = l.get(0); // 2
        elem = l.get(2); // 8
        int size = l.size(); // 3
        l.add(9); // 2 7 8 9
        l.add(2,0); // Insère 0 à l'indice 2 => 2 7 0 8 9
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(2,4,7,8));

        // TP
        // Methodes qui font : sum, min, max , average, getPrimeNumbers
        // TP moyen : inverse => 1,2,3,4 renvoie 4,3,2,1
        // TP difficile : refaire inverse sans créer une nouvelle lite cad en détruisant la liste originielle



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

    public int sum(ArrayList<Integer> l) {
        int res = 0;
        for(int i : l) {
            res+=i;
        }
        return res;
    }

    public int max(ArrayList<Integer> l) {
        int res = l.get(0);
        for(int i=1;i<l.size();i++) {
            if(l.get(i) > res) {
                res = l.get(i);
            }
        }
        return res;
    }

    public double average(ArrayList<Integer> l) {
        return (double)sum(l)/l.size();
    }

    public static ArrayList<Integer> getPrimeNumbers(ArrayList<Integer> tab) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i : tab) {
            if(isPrime(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static ArrayList<Integer> inverse(ArrayList<Integer> l) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = l.size() - 1; i>=0; i--) {
            int value = l.get(i);
            res.add(value); // res.add(l.get(i))
        }
        return res;
    }

    public static ArrayList<Integer> permut(ArrayList<Integer> l, int index1, int index2) {
        int temp = l.get(index1);
        l.set(index1, l.get(index2));
        l.set(index2, temp);
        return l;
    }

    public static ArrayList<Integer> inverse2(ArrayList<Integer> l) {
        for(int i =0; i < ((l.size() + 1 )/ 2); i++) {
            l = permut(l,i, l.size() - 1 - i);
        }
        return l;
    }
}

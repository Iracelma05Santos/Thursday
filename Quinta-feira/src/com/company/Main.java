package com.company;
import java.util.Scanner;
import java.util.Spliterator;        //Почему библиотека не работает?
import java.util.Collections;
//import org.apache.commons.lang3.ArrayUtils;      // И эта штука не работает!
import java.util.function.Consumer;
import java.sql.Array;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {


	public static void main(String[] args) {
        int n = 200;
        int k = 10;
        System.out.println("Количество элементов в массиве: "+n);
        System.out.println("Размер блока: "+k);
        int l = n/1;

                /*Arrays.spliterator(a);
            System.out.println(Arrays.toString(a));
            Spliterator<Integer> s1 = Arrays.spliterator(a);
            Spliterator<Integer> s2 = s1.trySplit();
            Spliterator<Integer> s3 = s1.trySplit();
                                                                                       СПЛИТЫ НЕ РАБОТАЮТ!!!!!!!
            s1.forEachRemaining(System.out::print);
            System.out.print("\n");
            s2.forEachRemaining(System.out::print);
            System.out.print("\n");
            s3.forEachRemaining(System.out::print);
            System.out.print("\n");*/

                String [] a = new String [] {"{0,1,2,3,4,5,6,7,8,9}","{10,11,12,13,14,15,16,17,18,19}","{20,21,22,23,24,25,26,27,28,29}",
                        "{30,31,32,33,34,35,36,37,38,39}","{40,41,42,43,44,45,46,47,48,49}","{50,51,52,53,54,55,56,57,58,59}",
                        "{60,61,62,63,64,65,66,67,68,69}","{70,71,72,73,74,75,76,78,79}","{80,81,82,83,84,85,86,87,88,89}",
                        "{90,91,92,93,94,95,96,97,98,99}","{100,101,102,103,104,105,106,107,108,109}","{110,111,112,113,114,115,116,117,118,119}",
                        "{120,121,122,123,124,125,126,127,128,129}","{130,131,132,133,134,135,136,137,138,139}","{140,141,142,143,144,145,146,147,148,149}",
                        "{150,151,152,153,154,155,156,157,158,159}","{160,161,162,163,164,165,166,167,168,169}","{170,171,172,173,174,175,176,177,178,179}",
                        "{180,181,182,183,184,185,186,187,188,189}","{190,191,192,193,194,195,196,197,198,199}"};
        System.out.println("Массив в обычном виде:");
        System.out.println(Arrays.asList(a));
        System.out.println("Массив после перемешивниния:");    // А вот так - работает!
        System.out.println("Количество перемешиваний: 20");
        Collections.shuffle(Arrays.asList(a));
        System.out.println(Arrays.asList(a));



                //int[][] newa = new int[30] [1];
                //int[] combinedIntArray = new int[]{1,2,3, 4, 5, 6, 7, 8, 9, 10,};


                //System.out.println(Arrays.toString(newa)); Иероглифы выводит!


           /*for(int c=0; c<20; c++) {
                int start = 0;
                c = start + 10;
                int s = c;                  РАБОТАЕТ, НО НЕ ТАК КАК ОЖИДАЛОСЬ.
        }
        for (int j = 0; j < 10; j++) {
        j= a[s + 1];
        System.out.print(a[j + 1] + "\t");
                int num=a[j + 1];
        }*/



    }
}


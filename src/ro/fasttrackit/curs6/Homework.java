package ro.fasttrackit.curs6;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Homework {
    public static void main(String[] args){
        int[] numbers={2,7,4,13,35,17};
        int numar = 11;
        int target=5000;
        int plafon=90000000;
        int numarDonatii=5;
        String phrase= "Ana are mere. Merele sunt de la piata. Piata e departe.";
        suma(numbers);
        impare(numbers);
        maiMari(numbers, numar);
        donations(target);
        donatii(plafon, numarDonatii);
        linieNoua(phrase);
    }

    static void suma(int[] numbers){
        int sum=0;
        for(int i=0;i<= numbers.length-1;i++){
            sum = sum+numbers[i];
        }
        System.out.println(sum);
    }

    static void impare(int[] numbers){
        int count=0;
        for(int i=0;i<=numbers.length-1;i++){
            if(numbers[i]%2!=0){
                count++;
            }
        }
        System.out.println(count);
    }
    static void maiMari(int[] numbers, int numar){
        for(int i=0;i<=numbers.length -1; i++){
            if(numbers[i]>numar){
                System.out.println(numbers[i]);
            }
        }
    }

    static void donations(int target){
        Random random = new Random();
        int donatie=0;

        do{
            int suma= random.nextInt();
            donatie=donatie +suma;
        }while(donatie<=target);

        if(donatie>=target){
            System.out.println("Ati atis suma dorita");
        }
    }

    static void donatii(int plafon, int numarDonatii){
        Random random = new Random();
        int donatie=0;
        int count=0;
        do{
            int suma= random.nextInt();
            donatie=donatie +suma;
            count++;
        }while(donatie<=plafon && count<=numarDonatii);

        if(donatie>=plafon && count<=numarDonatii) {
            System.out.println("Ati atis suma dorita");
        }else{
            System.out.println("Campania s-a incheiat");
        }
    }

    static void linieNoua(String phrase) {
         //
        //for(int i=0;i<=phrase.length()-1;i++) {
            String[] propozitii = phrase.trim().split(".");
            System.out.println(Arrays.toString(propozitii));
            System.out.println();
       // }
    }


}

package org.example.MyMvn;
public class Main {

    public static void main(String[] args){
        int income = 10000;
        int expenses = 3000;
        int treshold = 20000;

        Count service = new Count();
        int count = service.calculate(income,expenses,treshold);
        System.out.println(count);
    }
}
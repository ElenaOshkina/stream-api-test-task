package ru.oshkina;

public class Solution {

    public static void main(String[] args) {
        DataService dataService = new DataService();
        //1 - результат 191
        System.out.println(dataService.wordsAverageLength());
        //2 - сказал
        System.out.println(dataService.mostFrequentWord());
        //3 - покровительственный, распространявшийся, превосходительство...
        System.out.println(dataService.longestWords());
        //4 - Француженкою, пробившуюся, воображению...
        System.out.println(dataService.wordsWith5UniqueVowels());
    }
}

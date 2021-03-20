package ru.oshkina;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class DataService {

    private final StorageService storageService = new StorageService();

    //Определить среднюю длину строки в файле words.txt (результат округляем, пустые строки не считаем)
    public int wordsAverageLength() {
        throw new NotImplementedException();
    }

    //Найти 30 самых длинных слов
    public List<String> longestWords() {
        throw new NotImplementedException();
    }

    //Найти слово, которое встречается чаще всего и содержит больше 3 символов (ignore case = true)
    public String mostFrequentWord() {
        throw new NotImplementedException();
    }

    //Найти все слова в которых содержатся более 4 уникальных гласных в файле words.txt (выполнять параллельно)
    public List<String> wordsWith5UniqueVowels() {
        throw new NotImplementedException();
    }

}
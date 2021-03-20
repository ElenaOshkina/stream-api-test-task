package ru.oshkina;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class StorageService {

    //getter
    private final List<String> content = readFile();

    private List<String> readFile() {
        throw new NotImplementedException();
    }
}
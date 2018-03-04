package edu.knoldus;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Application {
  public static void main(String args[]) throws IOException {
    String pathToFile = "/home/knoldus/Desktop/Content.txt";
    Operations OperationsObject = new Operations();
    System.out.println("Prime Numbers Are: ");
    OperationsObject.FindPrimeUsingLamda().forEach(System.out::println);

    System.out.println("\nWordCount are: ");
    OperationsObject.wordCountReadFromFile(pathToFile);

    List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> list2 = Arrays.asList(2, 3, 4, 5, 6);
    OperationsObject.multiplicationOfList(list1, list2);


    OperationsObject.getCountOfWords("My name is Nitin Nitin is My name")
        .forEach((k, v) -> System.out.println(String.format("\nList[%s,%s], ", k, v.size())));
  }
}


package edu.knoldus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Operations {

  private Template checkPrimeOrNot = (int input) -> {

    for (int i = 2; i <= input / 2; i++) {
      if (input % i == 0) {
        return false;
      }
    }
    return true;
  };

  public static void multiplicationOfList(List<Integer> firstList, List<Integer> secondList) {

    List<Integer> resultOfMultiplication = new ArrayList<>();
    IntStream.range(0, firstList.size()).
        forEach(iterateOverIndex -> resultOfMultiplication.add(firstList.get(iterateOverIndex) * secondList.get(iterateOverIndex)));
    System.out.println("Result Of Multiplication is: " + resultOfMultiplication);

  }

  public IntStream FindPrimeUsingLamda() {
    return (IntStream.range(2, 100).filter(input -> checkPrimeOrNot.validate(input)));
  }


  public Map<String, Long> wordCountReadFromFile(String input) throws IOException {

    BufferedReader fetchInput = new BufferedReader(new FileReader(input));
    String NewFile;
    String FileData = " ";
    while ((NewFile = fetchInput.readLine()) != null) {

      FileData = FileData.concat(NewFile + " ");
    }
    try {
      Map<String, Long> countWords = Arrays.stream(FileData.split(" "))
          .map(word -> word.replaceAll("[^a-zA-z]", "").toLowerCase().trim())
          .filter(word -> word.length() > 0)
          .map(word -> new SimpleEntry<>(word, 1))
          .collect(groupingBy(SimpleEntry::getKey, counting()));
      countWords.forEach((k, v) -> System.out.println(String.format("%s => %d", k, v)));

      return countWords;
    } catch (Exception msg) {
      System.out.println(msg.getMessage());
    }
    return null;
  }


  public Map<String, List<WordsCounting>> getCountOfWords(String userInputString) {
    return Arrays.stream(userInputString.split(" "))
        .map(words -> new WordsCounting(words, 1))
        .collect(Collectors.groupingBy(countWordObj -> countWordObj.words));
  }
}

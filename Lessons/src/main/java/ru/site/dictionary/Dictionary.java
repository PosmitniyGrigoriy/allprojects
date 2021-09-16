package ru.site.dictionary;

import java.util.*;

public class Dictionary {

    public static void main(String[] args) {



//        1. Копировать полностью классы из документации в ТХТ
//        2. Затем удалять пустые строки в ТХТ
//        3. Заменить символы / * # ^ на !
//        4. Найти символ " и \ и удалить их.
//        5. Удалить в тхт пять пробелом и другие отступы в начале строки (табы и прочее)
//        6. Переносить все строки из ТХТ в ексель
//        7. В екселе через фильтр найти все строки, где есть символ ! и выделить фон ячеек зеленым
//        8. Остальные строки в екселе - это код. Его удалить.
//        9. Далее через фильтр в екселе найти записи просто со знаком ! и !! и !!! и другие короткие. И удалить их.
//        10. Выделять по 6000 строк в екселе и переносить строки на другую вкладку екселя, где будет создание строк
//        11. Перенести 6000 строк из екселя в ТХТ и там удалить пробелы и табы
//        12. Перенести из ТХТ готовые строки в IDE (в класс DictionaryText) и запустить программу
//        13. Раскомментировать строки в классе DictionaryCollection



        List<String> listTextsWithDuplicates = DictionaryCollection.addInCollectionTexts();
        int arraySize = 6000; // 6000 - работает, 7200 - уже слишком много строк текста - не работает
        String[] arrayTextsToLowerCase = new String[arraySize];
        for(int i = 0; i < listTextsWithDuplicates.size(); i++) {
            arrayTextsToLowerCase[i] = listTextsWithDuplicates.get(i).toLowerCase();
        }
        List<String> listOfWordsWithDuplicates = new ArrayList<>();
        for(int i = 0; i < arrayTextsToLowerCase.length; i++) {
            String text = arrayTextsToLowerCase[i];
            String[] arrayWords = text.split(" ");
            for(String word : arrayWords) {
                if(!word.isEmpty() && !word.equals("!")) {
                    listOfWordsWithDuplicates.add(word
                                                      .replace("0", "")
                                                      .replace("1", "")
                                                      .replace("2", "")
                                                      .replace("3", "")
                                                      .replace("4", "")
                                                      .replace("5", "")
                                                      .replace("6", "")
                                                      .replace("7", "")
                                                      .replace("8", "")
                                                      .replace("9", "")
                                                      .replace("(", "")
                                                      .replace(")", "")
                                                      .replace("<", "")
                                                      .replace(">", "")
                                                      .replace("{", "")
                                                      .replace("}", "")
                                                      .replace("[", "")
                                                      .replace("]", "")
                                                      .replace(".", "")
                                                      .replace("@", "")
                                                      .replace("=", "")
                                                      .replace(":", "")
                                                      .replace(",", "")
                                                      .replace("_", "")
                                                      .replace("|", "")
                                                      .replace("&", "")
                                                      .replace("%", "")
                                                      .replace("-", "")
                                                      .replace("+", "")
                                                      .replace("#", "")
                                                      .replace(";", "")
                                                      .replace("?", "")
                                                      .replace("^", "")
                                                      .replace("'", "")
                                                      .replace("!", "")
                                                      .replace("~", "")
                                                      .replace("$", "")
                                                      );
                }
            }
            arrayWords = null;
        }
        Collections.sort(listOfWordsWithDuplicates);
        Map<String, Integer> mapWords = new HashMap<>();
        for(int i = 0; i < listOfWordsWithDuplicates.size(); i++) {
            if(!mapWords.containsKey(listOfWordsWithDuplicates.get(i))) {
                mapWords.put(listOfWordsWithDuplicates.get(i), 1);
            } else {
                for (Map.Entry<String, Integer> entity : mapWords.entrySet()) {
                    if (entity.getKey().equals(listOfWordsWithDuplicates.get(i))) {
                        Integer value = entity.getValue();
                        entity.setValue(value += 1);
                    }
                }
            }
        }
        mapWords.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }

}

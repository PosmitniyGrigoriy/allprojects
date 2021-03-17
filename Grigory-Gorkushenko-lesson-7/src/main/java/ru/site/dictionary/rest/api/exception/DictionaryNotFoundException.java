package ru.site.dictionary.rest.api.exception;

public class DictionaryNotFoundException extends Exception {
   private long book_id;
   
   public DictionaryNotFoundException(long Dictionary_id) {
       super(String.format("Word is not found with id : '%s'", Dictionary_id));
   }
}
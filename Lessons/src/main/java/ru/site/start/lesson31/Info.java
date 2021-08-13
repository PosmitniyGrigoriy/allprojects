package ru.site.start.lesson31;

import java.util.ArrayList;

public class Info {

//    Урок 31. Generics (Дженерики).
//
//    Теория по этому уроку такая же, как и в джаве средний уровень.
//    Так как вначале проходил джаву средний уровень, то там записана теория.

    public static void main(String[] args) {

        Family<Integer> number = new Family<Integer>(5);
        Integer result = number.getValue();
        System.out.println(number);
        System.out.println(result);

        Family<String> lastname = new Family<String>("Пронин");
        String result2 = lastname.getValue();
        System.out.println(lastname);
        System.out.println(result2);

        ArrayList<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(5);
        listNumbers.add(77);
        listNumbers.add(43);
        listNumbers.add(-644);
        System.out.println(listNumbers);

        Integer result3 = Family.getValueIndexOne(listNumbers);
        System.out.println(result3);

    }
}

    class Family<T> {

        private T value;

        public Family(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "[ " + value + " ]";
        }

        public T getValue() {
            return value;
        }

        public static <T> T getValueIndexOne(ArrayList<T> listNumbers) {
            return listNumbers.get(1);
        }

    }

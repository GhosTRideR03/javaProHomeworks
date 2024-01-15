package javaProHomeworks.homework_08_01_24;

import java.util.Arrays;
import java.util.List;

public class OtherMethods {

    public static void main(String[] args) {

m9();
    }

    static void m1() {

        //Задание 1: Фильтрация списка целых чисел на нечетные числа
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers = numbers.stream()
                .filter(e -> e % 2 != 0)
                .toList();
    }

    static void m2() {

        //Задание 2: Преобразование списка строк в список чисел
        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> integerList = strings.stream()
                .map(Integer::parseInt)
                .toList();
    }

    static void m3() {

        //Задание 3: Суммирование списка чисел
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
                .reduce(Integer::sum);
    }

    static void m6() {

        //Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "cherry", "kiwi");
        words = words.stream()
                .distinct().filter(e -> e.length() > 4)
                .toList();
    }

    static void m7() {

        //Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту
        List<Person> people = Arrays.asList
                (new Person("John", 25), new Person("Alice", 22), new Person("Bob", 30));
        List<String> nameList = people.stream()
                .sorted()
                .map(Person::getName)
                .toList();
        System.out.println(nameList);
    }

    static void m8() {

        //Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .filter(e -> e % 3 == 0 && e % 5 == 0)
                .reduce(Integer::sum);
    }

    static void m9() {

        //Задание 9:Получение списка слов, содержащих только уникальные символы, из списка строк
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "grape");
        words = words.stream()
                .filter(e -> isStringHasUniqueChars(e))
                .toList();
        System.out.println(words);
    }

    static boolean isStringHasUniqueChars(String str) {
        return str.chars()
                .distinct()
                .count() == str.length();
    }

}

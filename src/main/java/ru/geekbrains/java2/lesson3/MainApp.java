package ru.geekbrains.java2.lesson3;
/*1. Создать массив с набором слов (10-20 слов, среди которых должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать,
сколько раз встречается каждое слово.
2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать
номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае
 однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять
еще дополнительные поля (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.).
 Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main(),
 прописывая add() и get().
Важно: в выбранной Вами коллекции не должно быть повторений имён

Неправильно:
911 - Тимофей
112 - Тимофей
03 - Тимофей*/


import java.util.TreeMap;

public class MainApp {

    public static void main(String[] args) {

        String[] word = new String[20];
        word[0] = "Men";
        word[1] = "Cat";
        word[2] = "Dog";
        word[3] = "qwer";
        word[4] = "Sniff";
        word[5] = "lol";
        word[6] = "3213";
        word[7] = "Boy";
        word[8] = "Boy";
        word[9] = "Cat";
        word[10] = "Men";
        word[11] = "Dad";
        word[12] = "Woman";
        word[13] = "pypy";
        word[14] = "Snack";
        word[15] = "Table";
        word[16] = "lol";
        word[17] = "men";
        word[18] = "qwery";
        word[19] = "Bob";


        uniqueWords(word);

        telephoneDirectory();

    }
    public static void uniqueWords(String[] word) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < word.length; i++) {
            if(treeMap.containsKey(word[i])){
                treeMap.put(word[i],treeMap.get(word[i])+1);
                } else {
                treeMap.put(word[i], 1);
            }
        }
        System.out.println(treeMap);

    }
    public static void telephoneDirectory(){
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();

        telephoneDirectory.add("Vasya", "9379992");
        telephoneDirectory.add("Bob", "9741262");
        telephoneDirectory.add("Tom", "93713654");
        telephoneDirectory.add("Bob", "9136542");
        telephoneDirectory.add("Any", "93778922");
        telephoneDirectory.add("Any", "9377792");
        telephoneDirectory.add("Vova", "9376324");
        telephoneDirectory.add("Any", "9374872");
        telephoneDirectory.add("Tom", "9379426");

        System.out.println(telephoneDirectory.get("Vasya"));
        System.out.println(telephoneDirectory.get("Bob"));
        System.out.println(telephoneDirectory.get("Any"));
        System.out.println(telephoneDirectory.get("Vova"));
        System.out.println(telephoneDirectory.get("Tom"));
    }
}

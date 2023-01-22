package hw9_3;

import java.util.ArrayList;
import java.util.HashMap;

/*
Завдання 3

Створіть клас MyDictionary.
Реалізуйте у найпростішому наближенні можливість використання його екземпляра.
Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати метод додавання пар елементів,
індексатор для отримання значення елемента за вказаним індексом
і властивість тільки для читання для отримання загальної кількості пар елементів.
 */



// Используеться обычный Еррейлист в котором лежат Елементы

public class MyDictionary<Key,Value> {

    ArrayList<Elem> elemsArr = new ArrayList<>();

 class Elem{
     public Key key;
     public Value value;

     public Elem(Key key, Value value) {
         this.key = key;
         this.value = value;
     }//Elem constructor

     @Override
     public String toString() {
         return "Elem{" +
                 "key=" + key +
                 ", value=" + value +
                 '}';
     }
 }  //Eem

    public void add(Key key,Value value){
        for (int i = 0; i < elemsArr.size(); i++){
            if (key.equals(elemsArr.get(i).key))
                System.out.println("Такий ключ вже існує, новий елент добавлено, але неможливо буде знайти по ключу");
            break;
        }
    Elem elem = new Elem(key,value);
    elemsArr.add(elem);
    }//add method

    public int getSize(){
     return elemsArr.size();
    }

    public String getElemValues(int index){
     String res;
     res= (String) elemsArr.get(index).key;
     res+=" - "+  elemsArr.get(index).value;
     return res;
    }

    public static void main(String[] args) {
        MyDictionary dc = new MyDictionary();
        dc.add("Молодець","Вова");
        dc.add("Забіяка","Саня");
        dc.add("Просто","Петя");
        System.out.println(dc.elemsArr.get(0).toString());
        System.out.println(dc.elemsArr.get(1).toString());
        System.out.println(dc.elemsArr.get(2).toString());
        System.out.println(dc.getElemValues(1));
        System.out.println(dc.getSize());
    }
}//MyDictionary

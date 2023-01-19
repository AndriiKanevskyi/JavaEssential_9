package hw9_2;
/*
Завдання 2

Створіть клас MyList.
Реалізуйте у найпростішому наближенні можливість використання його екземпляра аналогічно екземпляру класу List.
Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати метод додавання елемента,
індексатор для отримання значення елемента за вказаним індексом і властивість тільки для читання для отримання загальної кількості елементів.
 */

public class MyList <T>{
   private int size;
   private int length;
   private T[]array;

   private static final int DEFAULT_CAPACITY = 10;

   public MyList() {
      this.size = 0;
      this.length=DEFAULT_CAPACITY;
      this.array = (T[]) new Object[this.DEFAULT_CAPACITY];
   }//constructor

   public void add(T elem)throws ArrayIndexOutOfBoundsException{

      if (size<length){
         array[size]=elem;
         size++;
      }else {
         length+=5;
         T[] temp= (T[]) new Object[length];
         for (int i = 0; i <array.length ; i++) {
            temp[i]=array[i];
         }
         array=temp;
         add(elem);
      }

   }

   @Override
   public String toString() {
      String res="";
      for (int i = 0; i < this.size; i++) {
         System.out.print(array[i]+" ");
      }
      return res;
   }

   public T getElem(int index){
      return this.array[index];
   }

   public int getSize(){return this.size;}

   public static void main(String[] args) {
      MyList list = new MyList();

      list.add("String1");
      list.add("String2");
      list.add("String3");
      list.add("String4");
      list.add("String5");
      list.add("String6");
      list.add("String7");
      list.add("String8");
      list.add("String9");
      list.add("String10");
      list.add("String11");

      System.out.print("Зміст списку: ");
      System.out.println(list);

      System.out.print("Елемен під номером 5 :");
      System.out.println(list.getElem(5));

      System.out.print("Праця методу getSize() :");
      System.out.println(list.getSize());

   }//main
}//class

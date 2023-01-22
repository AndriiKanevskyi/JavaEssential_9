package hw9_5;

public class MyClass<T>{
    public   T factoryMethod(){
        T elem = (T)new Object();
        return elem;
    }

    public static void main(String[] args) {
        MyClass e = new MyClass();
        System.out.println(e.factoryMethod());
    }


}
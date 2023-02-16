package task7;
import java.util.Arrays;
public class Zoo {
    @Override
    public String toString() {
        return "Zoo: " + "[" + objects[0].toString() + ", " + objects[1].toString() + ", " + objects[2].toString() + "]";
    }

    Object[]  objects;
    public Zoo(){
        // в этой строке мы еще не создаем животных
        objects = new Object[3];
        // наполняем массив конкретными животными
        objects[0] = new Dog();
        objects[1] = new Cat();
        objects[2] = new Reptile();
    }
    public void print(){
        // Используем цикл!
        // Каждое животное выводится по-своему!
        for( Object a: objects){
            System.out.println(a);
        }
    }
    public void change(Animal a, int i){
        if (i >= 0 && i < objects.length)
            objects[i] = a;
    }
}


package task7;

public class Zoo extends Animal{
    Animal[] animals;
    public Zoo(){
        // в этой строке мы еще не создаем животных
        animals = new Animal[3];
        // наполняем массив конкретными животными
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Reptile();
    }
    public void print(){
        // Используем цикл!
        // Каждое животное выводится по-своему!
        for( Animal a: animals){
            a.print();
        }
    }
    public void change(Animal a, int i){
        if (i >= 0 && i < animals.length)
            animals[i] = a;
    }
}


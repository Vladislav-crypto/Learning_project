package task1123;

import java.util.ArrayDeque;
import java.util.Deque;


public class Main {
    public static void main(String[] args) {
        int numberOfTasks = 5;
        Deque toDoDeque = new ArrayDeque(numberOfTasks);// имплементация
        // остается прежней, ArrayDeque работает и как очередь, и как стек
        Boss boss = new Boss(toDoDeque);
        // создаем начальника с ссылкой на очередь
        Worker worker = new Worker(toDoDeque);
        // то же самое делаем с рабочим
        // в цикле начальник заполняет очередь заданиями
        for (int i = 1; i <= numberOfTasks; i++) {
            boss.giveTask("Задание " + i);
        }
        System.out.println("Начальник закончил давать задания");
        // в цикле говорим рабочему взять задание из очереди и выполнить его
        // скажем ему взять на одно задание больше, чем есть в очереди
        for (int i = 1; i <= numberOfTasks + 1; i++) {
            worker.takeTask();
        }
    }
}

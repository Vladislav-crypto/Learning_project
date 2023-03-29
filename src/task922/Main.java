package task922;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("src/answer.txt");
        int i;
        while ((i = fileInputStream.read()) != -1) {
            System.out.println((char) i);
        }
        fileInputStream.close();
        System.out.println();
/*
The file answer.txt is hidden in files directory
you have to read it.
The SECOND LINE of it is the CODE for the excercise

В строках 5-6 мы организуем цикл чтения. Условие цикла выглядит громоздко и немного непонятно. Это запись в стиле языка C (Си): мы одновременно читаем символ и проверяем результат на конец файла. Если «прочиталось», вернее вернулось -1  — файл закончен, и мы выходим из цикла.

Этот фрагмент можно написать более понятно:

int i = fis.read();
while (i != -1) {
      ...
      i = fis.read();
}
Но в этом случае операция чтения повторяется дважды, и поэтому обычно предпочитают первый вариант.

*/


    }
}

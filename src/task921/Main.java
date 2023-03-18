package task921;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*

Make byte InputStream OneZeroStream, which gives
1 0 1 0 .....

*/

        Scanner scanner = new Scanner(new OneZeroStream());
        for (int i = 0; i < 10; i++){
            System.out.print(scanner.nextInt());
        }

/*

The code above has to output

1010101010

*/
    }

}

/*
Подсказка (1 из 2): Нужно пронаследоваться от InputStream и переопределить метод int read().
Подсказка (2 из 2): Нужно выдавать не числа 0 и 1, а коды символов '0' и '1'. Можно использовать значения 48 и 49,
а можно и цифры в апострофах, из-за того, что цифры имеют коды в пределах типа byte, всё будет работать.
 */
// Метод Scanner.nextInt() - считывает только числа, пробелы он не читает (' ')
/**
 * Author Andrey Kamenev
 * Используется в : Kalkulator
 */

// Штука для ввода данных с клавиатуры
import java.util.Scanner;

 public class Kalkulator
    {
        public static void main(String[] args) {

            Scanner vinny = new Scanner(System.in);// Присуждаем переменной имя ,а так же System.in нужен для ввода данных с клавиатуры
            Double onenumber,twonumber,result;

            System.out.printf("Введите первое число:");
            onenumber = vinny.nextDouble();//ввод численного значения,присваиваем переменной число
            System.out.printf("Введите второе число:");
            twonumber = vinny.nextDouble();//ввод численного значения,присваиваем переменной число

            result = onenumber + twonumber;

            System.out.printf("Сумма чисел равна:"+ result); //вывод результата



        }
    }


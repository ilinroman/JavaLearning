package Day8;

/**
 * Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это одна
 * строка, полученная конкатенацией (“склеиванием”) чисел из диапазона через пробел
 * (0 + “ “ + 1 + “ “ + 2 + … + 20000).
 * После создания такой строки, вызов ​System.out.println()​на этой строке должен
 * вывести в консоль сразу все числа из диапазона.
 * Для того, чтобы почувствовать разницу в производительности между конкатенацией
 * обычных строк (класс ​String​ ) и использовании ​StringBuilder​ , реализуйте
 * описанную задачу этими двумя способами, замеряя время работы программы
 */
public class Task1 {
    public static void main(String[] args) {
        //Тест 1. Через конкатенацию
        String str = "";
        long begin, end;
        begin = System.nanoTime();
        for (int i = 0; i <= 20000; i++) {
            str += i;
        }
        end = System.nanoTime();
        System.out.printf("Test 1: %d \n %s \n", end - begin, str);

        //Тест 2. Черее билдер
        StringBuilder sb = new StringBuilder();
        begin = System.nanoTime();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i);
        }
        end = System.nanoTime();
        System.out.printf("Test 2: %d \n %s \n", end - begin, sb);
    }
}

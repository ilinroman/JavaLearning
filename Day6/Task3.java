package Day6;

/**
 * Создайте по 1 экземпляру каждого класса, у преподавателя вызовите метод оценки
 * студента, передав студента в качестве аргумента метода
 */
public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Рома");
        Teacher teacher = new Teacher("Олег", "Java");

        teacher.evaluate(student);
    }
}

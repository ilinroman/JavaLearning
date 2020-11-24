package Day9;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Roman", "First");
        Teacher teacher = new Teacher("Oleg", "Java");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }
}

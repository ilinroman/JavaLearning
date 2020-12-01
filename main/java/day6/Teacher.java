package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public void evaluate(Student student){
        Random r = new Random();

        System.out.printf(
            "Преподаватель %s оценил студента с именем %s по предмету \"%s\" на оценку \"%s\"",
                this.name,
                student.getName(),
                this.getSubject(),
                convertEvaluation(2 + r.nextInt(4)));
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    private String convertEvaluation(int eval){
        String result = "";
        switch(eval){
            case 2: result = "неудовлетворительно"; break;
            case 3: result = "удовлетворительно"; break;
            case 4: result = "хорошо"; break;
            case 5: result = "отлично"; break;
        }
        return result;
    }
}

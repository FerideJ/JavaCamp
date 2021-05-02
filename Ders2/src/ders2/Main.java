package ders2;

public class Main {

    public static void main(String[] args) {
        Courses courses = new Courses(1, "JAVA", "Engin Demirog",
                200, "kamp");

        Courses courses2 = new Courses(2, "C#", "Engin Demirog",
                200, "kamp");

        Courses courses3 = new Courses(3, "PHYTON", "Engin Demirog",
                200, "kamp");

        Courses[] features = {courses, courses2, courses3};

        for (Courses featureObj : features) {
            System.out.println(featureObj);
        }

        Lesson lesson1 = new Lesson(1, "Java", "Dersi tekrar izle");
        Lesson lesson2 = new Lesson(2, "C#", "Dersi tekrar et");
        Lesson[] lessons = {lesson1, lesson2};

        for (Lesson lesson : lessons) {
            System.out.println(lesson.lessonName);
        }

        Service service = new Service();
        service.basla(lesson1);
        service.bitirVeDevamEt(lesson1);
    }
}

package ders2;

public class Service {

    public void basla(Lesson lesson){
        System.out.println("Started  " + lesson.lessonName);
    }
    public void bitirVeDevamEt(Lesson lesson){
        System.out.println("Finished " + lesson.lessonName);

    }
}

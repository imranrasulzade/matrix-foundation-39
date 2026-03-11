import java.time.LocalDate;
import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {

        Student student = new Student();
        student.name = "Nargiz";
        student.surname = "Jafarzade";
        student.age = 18;
        student.classNumber = 39;
        student.grade = 93.6;



        student.printStData();

        String a = "Hello";


        Student student2 = new Student();
        student2.name = "Nurane";
        student2.surname = "Mirzaxanova";
        student2.patronymic = "Mirzaxan";
        student2.age = 19;
        student2.classNumber = 39;
        student2.birthDate = LocalDate.now();

        student2.printStData();


    }
}

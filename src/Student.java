import java.time.LocalDate;

public class Student {
    String name;
    String surname;
    String patronymic;
    int age;
    int classNumber;
    LocalDate birthDate;
    Double grade;

    public  void printStData() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("ClassNumber: " + classNumber);
    }

}

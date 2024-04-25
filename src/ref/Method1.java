package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
//        student1.name = "학생1";
//        student1.age = 15;
//        student1.grade = 90;
        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student();
//        student2.name = "학생2";
//        student2.age = 14;
//        student2.grade = 93;
        initStudent(student2, "학생2", 14, 93);

        printStudent(student1);
        printStudent(student2);

    }
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 점수: " + student.grade);
    }
}

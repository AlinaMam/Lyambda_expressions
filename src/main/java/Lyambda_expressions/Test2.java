/*
package Lesson30;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();
        Student1 st1 = new Student1("Ivan", 'm', 22, 3, 8.3);
        Student1 st2 = new Student1("Nikolay", 'm', 28, 2, 6.4);
        Student1 st3 = new Student1("Elena", 'f', 19, 1, 8.9);
        Student1 st4 = new Student1("Petr", 'm', 35, 4, 7.0);
        Student1 st5 = new Student1("Mariya", 'f', 23, 3, 9.1);
        Collections.addAll(list, st1, st2, st3, st4, st5);
        FindStudentsOverGrade fsog = new FindStudentsOverGrade();
        FindStudentsUnderGrade fsug = new FindStudentsUnderGrade();
        StudentInfo1 si = new StudentInfo1();
        si.testStudents(list, fsog);
        System.out.println("---");
        si.testStudents(list, fsug);

    }
}

class Student1 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student1(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo1 {
    void printStudent(Student1 st) {
        System.out.println("Imya studenta: " + st.name
                + ", pol: " + st.sex
                + ", vozrast: " + st.age
                + ", kurs: " + st.course
                + ", srednya ocenka: " + st.avgGrade);
    }

    void testStudents(ArrayList<Student1> aL, StudentChecks sc) {
        for (Student1 s : aL) {
            if (sc.testStudent(s)) {
                printStudent(s);
            }
        }
    }
}

interface StudentChecks {
    boolean testStudent(Student1 s);
}

class FindStudentsOverGrade implements StudentChecks {
    @Override
    public boolean testStudent(Student1 s) {
        return s.avgGrade > 8.5;
    }
}
class FindStudentsUnderGrade implements StudentChecks {
    @Override
    public boolean testStudent(Student1 s) {
        return s.avgGrade < 9.0;
    }
}
*/

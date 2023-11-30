//package Lesson30;

import java.util.ArrayList;
import java.util.Collections;

/*
public class Test1 {
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

class StudentInfo {
    void printStudent(Student1 st) {
        System.out.println("Imya studenta: " + st.name
                + ", pol: " + st.sex
                + ", vozrast: " + st.age
                + ", kurs: " + st.course
                + ", srednya ocenka: " + st.avgGrade);
    }

    void printStudentsOverGrade(ArrayList<Student1> aL, double avgGrade) {
        for (Student1 s : aL) {
            if (s.avgGrade > avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentsUnderGrade(ArrayList<Student1> aL, double avgGrade) {
        for (Student1 s : aL) {
            if (s.avgGrade < avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentsOverAge(ArrayList<Student1> aL, int age) {
        for (Student1 s : aL) {
            if (s.age > age) {
                printStudent(s);
            }
        }
    }

    void printStudentsUnderAge(ArrayList<Student1> aL, int age) {
        for (Student1 s : aL) {
            if (s.age < age) {
                printStudent(s);
            }
        }
    }

    void printStudentsBySex(ArrayList<Student1> aL, char sex) {
        for (Student1 s : aL) {
            if (s.sex == sex) {
                printStudent(s);
            }
        }
    }

    void printStudentsMixConditions(ArrayList<Student1> aL, double avgGrade, int age, char sex) {
        for (Student1 s : aL) {
            if (s.avgGrade > avgGrade && s.age < age && s.sex == sex) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();
        Student1 st1 = new Student1("Ivan", 'm', 22, 3, 8.3);
        Student1 st2 = new Student1("Nikolay", 'm', 28, 2, 6.4);
        Student1 st3 = new Student1("Elena", 'f', 19, 1, 8.9);
        Student1 st4 = new Student1("Petr", 'm', 35, 4, 7.0);
        Student1 st5 = new Student1("Mariya", 'f', 23, 3, 9.1);
        Collections.addAll(list, st1, st2, st3, st4, st5);
        StudentInfo si = new StudentInfo();
        si.printStudentsOverGrade(list, 8.5);
        System.out.println("---");
        si.printStudentsUnderGrade(list, 9);
        System.out.println("---");
        si.printStudentsOverAge(list, 25);
        System.out.println("---");
        si.printStudentsUnderAge(list, 27);
        System.out.println("---");
        si.printStudentsBySex(list, 'm');

    }
}
*/

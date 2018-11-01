package org.sopt;

import org.sopt.model.Department;
import org.sopt.model.Professor;
import org.sopt.model.Student;
import org.sopt.model.University;

import java.util.ArrayList;

public class Main {

    //2차세미나 static,final실습//////////////////////////////////

//    static int a;
//
//    private static void dfs(final int x){
//
//    }


    ////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        // write your code here

        final ArrayList<University> universityArrayList = new ArrayList<>();
        final ArrayList<Department> departmentArrayList = new ArrayList<>();
        final ArrayList<Professor> professorArrayList = new ArrayList<>();
        final ArrayList<Student> studentArrayList = new ArrayList<>();


        final Student student1 = new Student(1, "sookmyung", "02-123-456", "서울시 용산구 청파동",
                0, "IT공학", "02-777-7777", "공과대학",
                1610408, "최수정1", 3, "IT공학", "soochoi0325@gmail.com", "서울시 용산구 청파동1", 20, "재학");
        final Student student2 = new Student(1, "sookmyung", "02-123-456", "서울시 용산구 청파동",
                0, "IT공학", "02-777-7777", "공과대학",
                1620408, "최수정2", 3, "IT공학", "soochoi0325@gmail.com", "서울시 용산구 청파동2", 21, "휴학");
        final Student student3 = new Student(1, "sookmyung", "02-123-456", "서울시 용산구 청파동",
                0, "IT공학", "02-777-7777", "공과대학",
                1630408, "최수정3", 3, "IT공학", "soochoi0325@gmail.com", "서울시 용산구 청파동3", 22, "재학");

        final University university1 = new University(1, "sookmyung", "02-123-456", "서울시 용산구 청파동");
        final University university2 = new University(2, "yonsei", "02-223-456", "서울시 서대문구 신촌동");
        final University university3 = new University(3, "sogang", "02-323-456", "서울시 마포구 백범로 ");

        final Department department1 = new Department(1, "sookmyung", "02-123-456", "서울시 용산구 청파동",
                0, "IT공학", "02-777-7777", "공과대학");
        final Department department2 = new Department(3, "sogang", "02-323-456", "서울시 마포구 백범로",
                0, "컴퓨터공학", "02-377-7777", "공과대학");
        final Department department3 = new Department(2, "yonsei", "02-223-456", "서울시 서대문구 신촌동",
                0, "컴퓨터공학", "02-277-7777", "공과대학");

        final Professor professor1 = new Professor(1, "sookmyung", "02-123-456", "서울시 용산구 청파동",
                0, "IT공학", "02-777-7777", "공과대학",
                123, "김하나", "IT공학", "010-223-456", "인공지능");
        final Professor professor2 = new Professor(1, "sookmyung", "02-123-456", "서울시 용산구 청파동",
                0, "IT공학", "02-777-7777", "공과대학",
                123, "김둘", "IT공학", "010-323-456", "알고리즘");
        final Professor professor3 = new Professor(1, "sookmyung", "02-123-456", "서울시 용산구 청파동",
                0, "IT공학", "02-777-7777", "공과대학",
                123, "김셋", "IT공학", "010-123-456", "컴퓨터비전");

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        universityArrayList.add(university1);
        universityArrayList.add(university2);
        universityArrayList.add(university3);

        professorArrayList.add(professor1);
        professorArrayList.add(professor2);
        professorArrayList.add(professor3);

        departmentArrayList.add(department1);
        departmentArrayList.add(department2);
        departmentArrayList.add(department3);


        for (final Student s : studentArrayList) {
            System.out.println(s.toString());
        }
        for (final Department d : departmentArrayList) {
            System.out.println(d.toString());
        }
        for (final University u : universityArrayList) {
            System.out.println(u.toString());
        }
        for (final Professor p : professorArrayList) {
            System.out.println(p.toString());
        }
    }
}

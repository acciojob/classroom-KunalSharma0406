package com.driver;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Repository
public class StudentRepository {
    public HashMap<String,Student> Studentdb =new HashMap<>();
    public HashMap<String,Teacher> Teacherdb=new HashMap<>();
    public HashMap<String,String> Pairdb=new HashMap<>();

    public void addStudent(Student student) {
        String key=student.getName();
        Studentdb.put(key,student);
    }

    public void addTeacher(Teacher teacher) {
        String key=teacher.getName();
        Teacherdb.put(key,teacher);
    }

    public void addStudentTeacherPair(String student, String teacher) {
        String student1 = null;
        String teacher1 = null;
       for(Student s : Studentdb.values()){
           if(Objects.equals(student, s.getName())){
               student1=s.getName();
           }
       }
        for(Teacher t : Teacherdb.values()){
            if(Objects.equals(teacher, t.getName())){
                teacher1=t.getName();
            }
        }
        Pairdb.put(student1,teacher1);
    }

    public Student getStudentByName(String name) {
        Student student=null;
        for(Student s : Studentdb.values()){
            if(Objects.equals(name, s.getName())){
                student=s;
            }
        }
        return student;
    }

    public Teacher getTeacherByName(String name) {
        Teacher teacher=null;
        for(Teacher t : Teacherdb.values()){
            if(Objects.equals(name,t.getName())){
              teacher=t;
            }
        }
        return teacher;
    }

    public List<String> getStudentsByTeacherName(String teacher) {
        List<String> students = null;
        for(Map.Entry<String,String> entry: Pairdb.entrySet()){
                if(entry.getValue().equals(teacher)){
                    students.add(entry.getKey());
                }
        }
        return students;
    }

    public List<String> getAllStudents() {
        List<String> students = null;
        for(String s: Studentdb.keySet()){
            students.add(s);
        }
        return students;
    }

    public void deleteTeacherByName(String teacher) {
        for(String s: Teacherdb.keySet()){
            if(Objects.equals(s, teacher)){
                Teacherdb.remove(s);
            }
        }
    }

    public void deleteAllTeachers() {
        Teacherdb.clear();
    }
}

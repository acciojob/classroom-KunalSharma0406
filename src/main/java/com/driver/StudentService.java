package com.driver;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentService {

    StudentRepository studentRepository = new StudentRepository();
    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    public void addTeacher(Teacher teacher) {
        studentRepository.addTeacher(teacher);
    }

    public void addStudentTeacherPair(String student, String teacher) {
        studentRepository. addStudentTeacherPair(student,teacher);
    }

    public Student getStudentByName(String name) {
        Student student=null;
        return student=studentRepository.getStudentByName(name);
    }

    public Teacher getTeacherByName(String name) {
        Teacher teacher=null;
        return teacher=studentRepository.getTeacherByName(name);
    }

    public List<String> getStudentsByTeacherName(String teacher) {
        List<String> students = null;
        return students=studentRepository.getStudentsByTeacherName(teacher);
    }

    public List<String> getAllStudents() {
        List<String> students = null;
        return students=studentRepository. getAllStudents();
    }

    public void deleteTeacherByName(String teacher) {
        studentRepository.deleteTeacherByName(teacher);
    }

    public void deleteAllTeachers() {
        studentRepository.deleteAllTeachers();
    }
}

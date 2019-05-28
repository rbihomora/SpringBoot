package com.rbihomora.Service;
import com.rbihomora.Dao.StudentDao;
import com.rbihomora.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    @Qualifier("mongoData")
    private StudentDao StudentDao;

    public Collection<Student> getAllStudents() {
        return this.StudentDao.getAllStudents();
    }

    public Student getStudentById(int id) {
        return this.StudentDao.getStudentById(id);
    }
    public void removeStudentById(int id) {
        this.StudentDao.removeStudentById(id);
    }
    public void updateStudent(Student student) {
        this.StudentDao.updateStudent(student);
    }

    public void insertStudent(Student student) {
        this.StudentDao.insertStudentToDb(student);
    }

//    public Student getStudentByName(String name) {
//
//        return this.studentDao.getStudentByName(name);
//    }
//    public Student getStudentByCourse(String course) {
//
//        return this.studentDao.getStudentByCourse(course);
//    }
}

package com.rbihomora.Controller;

import com.rbihomora.Entity.Student;
import com.rbihomora.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentsId(@PathVariable ("id")int id) {
        return studentService.getStudentById(id);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable("id")int id ){
        studentService.removeStudentById(id);

    }


    @RequestMapping( method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudentById( @RequestBody Student student ) {
        studentService.insertStudent(student);
    }

    @RequestMapping( method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteStudentById( @RequestBody Student student ) {
        studentService.updateStudent(student);
    }


//    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
//    public Student getStudentsName(@PathVariable ("name")String name) {
//        return studentService.getStudentByName(name);
//    }
//
//    @RequestMapping(value = "/{course}", method = RequestMethod.GET)
//    public Student getStudentsCourse(@PathVariable ("course")String course) {
//        return studentService.getStudentByCourse(course);
//    }
}

package com.ajit.studentDemo.rest;

import com.ajit.studentDemo.entity.Student;
import com.ajit.studentDemo.service.StudentService;
import com.ajit.studentDemo.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService service;

    /*@Autowired
    public StudentController(StudentServiceImpl service) {
        this.service = service;
    }*/

    @GetMapping("/students")
    public String listStudents(Model model) {
        List<Student> students = service.findAll();

        model.addAttribute("students", students);

        return "students/students";
    }

    @GetMapping("/students/update")
    public  String updateStudentForm(@RequestParam("studentId") int id, Model model) {
        //get the student from the server
        Student student = service.findById(id).get();
        model.addAttribute("student", student);
        return "students/student-form";
    }

    @GetMapping("/students/form")
    public String addStudentForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "students/student-form";
    }

    @GetMapping("/students/delete")
    public String deleteStudent(@RequestParam("studentId") int id, Model model) {
        service.delete(id);
        return "redirect:/students";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
        service.save(student);
        return "redirect:/students";
    }
}

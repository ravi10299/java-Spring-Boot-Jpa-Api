package com.example.SpringCustumProject2.Controller;
import com.example.SpringCustumProject2.Dto.StudentDto;
import com.example.SpringCustumProject2.Entity.Student;
import com.example.SpringCustumProject2.Services.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentControl {
    @Autowired
    StudentService studentService;

    //get the all record....
    @GetMapping("api/Student")
    public List<Student> getStudent(){
        return studentService.getAllStudent();
    }
    // get by the single record....
    @GetMapping("api/Student/{id}")
    private Student getStudent1(@PathVariable int id){
        return studentService.getStudent1(id);
    }

    //insert the data......

    @PostMapping("api/Student")
    public Student addStudent(@RequestBody @Valid StudentDto studentDto){
        return studentService.addStudent(studentDto);
    }

    //Update the data....
    @PutMapping("api/Students/{id}")
    public Student putstudent(@RequestBody StudentDto studentDto,@PathVariable int id){
        return studentService.updateStudent(studentDto,id);
    }

    //Delete........
    @DeleteMapping("api/Student/{id}")
    public String deleteStudent(@PathVariable int id){
        return studentService.deleteStudentData(id);
    }
}

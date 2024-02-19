package com.example.SpringCustumProject2.Services;

import com.example.SpringCustumProject2.Dto.StudentDto;
import com.example.SpringCustumProject2.Entity.Student;
import com.example.SpringCustumProject2.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
    public Student getStudent1(int id) {
        return studentRepository.findById(id).get();
    }

    public Student addStudent(StudentDto studentDto) {
        Student s = new Student();
        s.setName(studentDto.getName());
        s.setMobileNo(studentDto.getMobileNo());
        s.setAge(studentDto.getAge());
        s.setCollege(studentDto.getCollege());
        s.setEmail(studentDto.getEmail());
        s.setAddress(studentDto.getAddress());
        s.setGender(studentDto.getGender());
        return studentRepository.save(s);
    }


    public Student updateStudent(StudentDto studentDto, int id) {
        Student s = studentRepository.findById(id).get();
//        Student s = new Student();
        s.setName(studentDto.getName());
        s.setAge(studentDto.getAge());
        s.setGender(studentDto.getGender());
        s.setEmail(studentDto.getEmail());
        s.setAddress(studentDto.getAddress());
        s.setCollege(studentDto.getCollege());
        return studentRepository.save(s);

    }

    public String deleteStudentData(int id) {
        studentRepository.deleteById(id);
        return "Student id "+ id+" is deleted...";
    }
}

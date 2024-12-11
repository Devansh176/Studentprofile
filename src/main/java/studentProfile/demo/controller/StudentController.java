package studentProfile.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import studentProfile.demo.entity.StudentEntity;
import studentProfile.demo.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("controller")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudents")
    public List<StudentEntity> getStudents()
    {
        return studentService.getStudents();
    }

    @GetMapping("/getStudents/id")
    public StudentEntity getStudentId(int studentId)
    {
        return studentService.getStudentId(studentId);
    }

    @GetMapping("/getStudents/name")
    public List<StudentEntity> getFirstname(String name)
    {
        return studentService.getFirstname(name);
    }

    @PostMapping("/postStudent")
    public void postStudent(@RequestBody StudentEntity student)
    {
        studentService.postStudent(student);
    }

    @PostMapping("/postStudent/V2")
    public void postStudentV2(@RequestParam("firstname") String firstname,@RequestParam("lastname") String lastname)
    {
        studentService.postStudentV2(firstname, lastname);
    }

    @DeleteMapping("/deleteStudent")
    public void deleteStudent(@RequestBody StudentEntity student){
        studentService.deleteStudent(student);
    }
}

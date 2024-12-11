package studentProfile.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studentProfile.demo.entity.StudentEntity;
import studentProfile.demo.repo.StudentRepo;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public List<StudentEntity> getStudents(){
        return studentRepo.findAll();
    }

    public StudentEntity getStudentId(int studentId)
    {
        return studentRepo.findByStudentId(studentId);
    }

    public List<StudentEntity> getFirstname(String name)
    {
        return studentRepo.findByFirstname(name);
    }

    public void postStudent(StudentEntity student)
    {
        studentRepo.save(student);
    }

    public void postStudentV2(String firstname, String lastname)
    {
        StudentEntity student1 = new StudentEntity();
        student1.setFirstname(firstname);
        student1.setLastname(lastname);

        studentRepo.save(student1);
    }

    public void deleteStudent(StudentEntity student){
        studentRepo.delete(student);
    }
}

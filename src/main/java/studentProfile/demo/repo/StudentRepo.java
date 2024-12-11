package studentProfile.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import studentProfile.demo.entity.StudentEntity;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,Integer>{
    StudentEntity findByStudentId(int studentId);

    //@Query("select * from demo where firstname = 'Devansh'")
    List<StudentEntity> findByFirstname(String name);
}

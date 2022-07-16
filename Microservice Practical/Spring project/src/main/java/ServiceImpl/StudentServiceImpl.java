package ServiceImpl;

import Model.Student;
import Repository.StudentRepository;
import Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    public StudentRepository studentRepository;

    public Student save(Student student) {
       return studentRepository.save(student);
    }
    public Student getstudent(int id){
       Optional<Student> student = studentRepository.findById(id);
       if (student.isPresent()){
           return student.get();
       }
       return null;
    }
}

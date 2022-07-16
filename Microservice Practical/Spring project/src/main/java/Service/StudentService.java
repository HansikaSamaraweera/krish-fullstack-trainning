package Service;

import Model.Student;
import org.springframework.beans.factory.annotation.Autowired;


public interface StudentService {
    @Autowired
    Student save(Student student);
    Student getstudent(int id);
}

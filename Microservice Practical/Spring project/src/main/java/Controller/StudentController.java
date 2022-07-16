package Controller;

import Model.Student;
import Service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@CrossOrigin
@RestController
@RequestMapping(value = "/studentController")
public class StudentController {

   public StudentService studentService;

    @RequestMapping(value = "/student",method = RequestMethod.POST)
    public Student save(@RequestBody Student student) throws IOException {
      return studentService.save(student);
    }

    @RequestMapping(value = "/getstudent",method = RequestMethod.GET)
    public ResponseEntity<Student> getstudent(@RequestBody int id){
        Student st = studentService.getstudent(id);
        if(st == null){
            ResponseEntity.notFound().build();
        }
            return ResponseEntity.ok().body(st);

    }
}

package cat.tecnocampus.application;

import cat.tecnocampus.domain.Classroom;
import cat.tecnocampus.persintence.ClassroomDAO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Controller {
    private ClassroomDAO classroomDAO;
    public List<Classroom> findAll() {
        return classroomDAO.findAll();
    }
    public List<Classroom> findCapacityLargerThan(int capacity) {
        return classroomDAO.findCapacityLargerThan(capacity);
    }
    public List<Classroom> findCapacityLowerThan(int capacity){
        return classroomDAO.findCapacityLowerThan(capacity);
    }
    public List<Classroom> findWithPlugs(){return classroomDAO.findWithPlugs();}
    public List<Classroom> findWithNoPlugs(){return classroomDAO.findWithNoPlugs();}
    public int insert(Classroom classroom){return classroomDAO.insert(classroom);}
    public int[] insertBatch(List<Classroom> classrooms){return classroomDAO.insertBatch(classrooms);}

}

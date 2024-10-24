import java.util.ArrayList;


public class Teacher extends Person {


    private ArrayList<String> currentCourses;
    private ArrayList<String> canTeach;

    public Teacher(String name, ArrayList<String> currentCourses, ArrayList<String> canTeach) {
        super(name);
        this.currentCourses = currentCourses;
        this.canTeach = canTeach;
    }
@Override
    public boolean addCourse(String course) {
        if(canTeach.contains(course)){
            currentCourses.add(course);
            System.out.println("Teacher" + course + " completet");
            return false;
        } else {
            System.out.println("Teacher" + course + " not completet");
            return true;
        }

}
public ArrayList<String> getCanTeach() {
        return canTeach;
}
public void setCanTeach(ArrayList<String> canTeach) {
        this.canTeach = canTeach;
}
public ArrayList<String> getCurrentCourses() {
        return currentCourses;
}
public void setCurrentCourses(ArrayList<String> currentCourses) {
            this.currentCourses = currentCourses;
    }
}

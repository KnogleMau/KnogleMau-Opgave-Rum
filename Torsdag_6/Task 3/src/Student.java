import java.util.ArrayList;


public class Student extends Person {

    private ArrayList<String> passedCourse;
    private ArrayList<String> currentCourses;

    public Student(String name, ArrayList<String> passedCourse , ArrayList<String> currentCourses) {
        super(name);
        this.passedCourse = passedCourse;
        this.currentCourses = currentCourses;
    }

    @Override
    public boolean addCourse(String course) {
        if (passedCourse.contains(course)) {
            // Course is already passed, return false
            System.out.println("Course '" + course + "' has already been passed.");
            return false;
        } else {
            // Course not passed, add to currentCourses
            currentCourses.add(course);
            System.out.println("Course '" + course + "' added to current courses.");
            return true;
        }
    }

    public ArrayList<String> getPassedCourses() {
        return passedCourse;
    }

    public void setPassedCourses(ArrayList<String> passedCourses) {
        this.passedCourse = passedCourses;
    }

    public ArrayList<String> getCurrentCourses() {
        return currentCourses;
    }

    public void setCurrentCourses(ArrayList<String> currentCourses) {
        this.currentCourses = currentCourses;
    }
}

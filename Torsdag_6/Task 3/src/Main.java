import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<String> student1PassedCourses = new ArrayList<>();
        student1PassedCourses.add("Math 101");
        student1PassedCourses.add("Java 1.0");

        ArrayList<String> student1CurrentCourses = new ArrayList<>();

        Student student1 = new Student("Alice", student1PassedCourses, student1CurrentCourses);

        ArrayList<String> student2PassedCourses = new ArrayList<>();
        student2PassedCourses.add("History 101");

        ArrayList<String> student2CurrentCourses = new ArrayList<>();

        Student student2 = new Student("Bob", student2PassedCourses, student2CurrentCourses);


        ArrayList<String> teacher1CanTeach = new ArrayList<>();
        teacher1CanTeach.add("Math 101");
        teacher1CanTeach.add("Java 1.0");

        ArrayList<String> teacher1CurrentCourses = new ArrayList<>();

        Teacher teacher1 = new Teacher("Dr. Smith", teacher1CanTeach, teacher1CurrentCourses);

        ArrayList<String> teacher2CanTeach = new ArrayList<>();
        teacher2CanTeach.add("Physics 101");

        ArrayList<String> teacher2CurrentCourses = new ArrayList<>();

        Teacher teacher2 = new Teacher("Dr. Johnson", teacher2CanTeach, teacher2CurrentCourses);


        ArrayList<Person> persons = new ArrayList<>();
        persons.add(student1);
        persons.add(student2);
        persons.add(teacher1);
        persons.add(teacher2);


        for (Person person : persons) {
            boolean courseAdded = person.addCourse("Java 1.0");

            if (!courseAdded) {
                // If the person is a Student
                if (person instanceof Student) {
                    System.out.println(person.getName() + " har allerede bestået dette kursus.");
                }
                // If the person is a Teacher
                else if (person instanceof Teacher) {
                    System.out.println(person.getName() + " kan ikke undervise i dette fag.");
                }
            }
        }
    }
}
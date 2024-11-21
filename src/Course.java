import java.util.Arrays;

public class Course {
    String courseName;
    String mentor;
    Student[] students;


    public Course(String courseName, String mentor, Student[] students) {
        if (courseName.length() <= 2) {
            System.out.println("error");
        } else {
            this.courseName = courseName;
        }
        this.mentor = mentor;
        setStudents(students);
    }


    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", mentor='" + mentor + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }



    public void setStudents (Student[] students) {
        Student[] newArr = new Student[1];
        int count = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i].age < 16) {
                System.out.println(students[i].studentsName + " не может учиться в курсе. ");
            } if (students[i].age > 16) {
                newArr = Arrays.copyOf(students, newArr.length +1 );
                newArr[count] = students[i];
                count++;
            }
        }
        this.students = newArr;
    }
}

public class Student {
    String studentsName ;
    int age ;
    int wordsInMinute;

    public Student(String studentsName, int age, int wordsInMinute) {
        this.studentsName = studentsName;
        this.age = age;
        this.wordsInMinute = wordsInMinute;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentsName='" + studentsName + '\'' +
                ", age=" + age +
                ", wordsInMinute=" + wordsInMinute +
                '}';
    }
}

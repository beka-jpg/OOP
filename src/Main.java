import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Cat cat1 = new Cat("Mushuk", 12, 5, 49);
//        Cat cat2 = new Cat("Mushuk1", 12, 4, 23);
//
//
//        Dog dog1 = new Dog("Овчарка", 19, 8, 89);
//        Dog dog2 = new Dog("Чихуаха", 3, 2, 89);
//
//
//        System.out.println(cat1);
//        System.out.println(cat2);
//
//        System.out.println(dog1);
//        System.out.println(dog2);


        Student[] students1 = {
                new Student("Aidana", 18, 190),
                new Student("Aisylyy", 14, 200),
                new Student("Nazik", 19, 300),
                new Student("Nurislam", 12, 200),
                new Student("Rinat", 29, 599),
        };



        Course course1 = new Course(
                "Math",
                "Ainazik",
                students1
        );


        System.out.println(course1);
//        System.out.println(Arrays.toString(students1));


//
//        Person person1 = new Person();
//        Person person2 = new Person("Nursuluu");
//        Person person3 = new Person(19,59);
//        Person person4 = new Person("Russian");
//
//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(person3);
//        System.out.println(person4);
    }
}




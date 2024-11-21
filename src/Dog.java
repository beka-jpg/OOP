public class Dog {
    String name ;
    int age;
    int weigth;
    int heigth;

    public Dog(String name,int age, int weigth, int heigth ) {
        this.name = name;
        this.age = age;
        this.weigth = weigth;
        this.heigth = heigth;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weigth=" + weigth +
                ", heigth=" + heigth +
                '}';
    }
}

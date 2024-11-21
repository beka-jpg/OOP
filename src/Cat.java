import javax.swing.text.html.parser.TagElement;

public class Cat {
    String name ;
    int age;
    int heigth;
    int weigth;

    public Cat(String name, int age, int heigth, int weigth) {
        this.name = name;
        this.age = age;
        this.heigth = heigth;
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", heigth=" + heigth +
                ", weigth=" + weigth +
                '}';
    }
}

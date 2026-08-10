package OOPs;


class Student{
    String name ;
    int age;


    void getInfo(String name , int age){
        this.name = name ;
        this.age = age;
        System.out.println(name);
        System.out.println(age);
    }
    public Student() {
        System.out.println("Student ");
    }
    Student(String name , int age){
        this.name = name;
        this.age = age;
    }

}

public class OOP {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "radha";
        s1.age = 19;

        //Student s2 = new Student("deni",20);

       s1.getInfo("Minaxi",50);

    }

}

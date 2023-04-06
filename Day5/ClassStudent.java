package Day5;

import java.util.Scanner;

public class ClassStudent {
    String name;
    int age;
    double math;
    double physics;
    double chemistry;

    public ClassStudent(String name, int age, double math, double physics, double chemistry) {
        this.name = name;
        this.age = age;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }

   static Scanner scanner = new Scanner(System.in);



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    @Override
    public String toString() {
        return "ClassStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", math=" + math +
                ", physics=" + physics +
                ", chemistry=" + chemistry +
                '}';
    }
//    public static ClassStudent students(){
//        String name = scanner.nextLine();
//        int age = scanner.nextInt();
//        double math = scanner.nextDouble();
//        double physics = scanner.nextDouble();
//        double chemistry = scanner.nextDouble();
//        return students();
//    }
}



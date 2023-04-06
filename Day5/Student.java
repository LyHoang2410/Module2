package Day5;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {


//         Với mảng cho sẵn
        ClassStudent [] students = new ClassStudent[3];
        students[0] = new ClassStudent("Ly", 29, 9.5, 8.5, 9.0);
        students[1] = new ClassStudent("Dung", 20, 8.5, 8.5, 9.5);
        students[2] = new ClassStudent("Lam", 28, 8.5, 9.0, 9.5);

        Double avgMax = (students[0].getMath() + students[0].getPhysics() + students[0].getChemistry()) / 3;
        int index = 0;

        for (int i = 0; i < students.length; i++) {
            if((students[i].getMath() + students[i].getPhysics() + students[i].getChemistry()) / 3 > avgMax){
                index = i;
                avgMax = (students[i].getMath() + students[i].getPhysics() + students[i].getChemistry()) / 3;
            }
        }
        System.out.println(students[index]);


    }
}

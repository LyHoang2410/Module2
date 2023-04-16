package Day_14_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class PeopleManager implements Manager<People> {
    ArrayList<People> peopleList;
    Scanner scanner;

    public PeopleManager() {
        scanner = new Scanner(System.in);
        peopleList = new ArrayList<>();
    }

    public int findIndexById(int id) {
        for (int i = 0; i < peopleList.size(); i++) {
            if (peopleList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void showPeople() {
        if (peopleList.isEmpty()) {
            System.out.println("Empty list!!");
        } else {
            for (People people : peopleList) {
                System.out.println(people);
            }
        }
    }

    @Override
    public void additionPeople() {
        System.out.println("Enter number of people to addition: ");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.println("Enter student's name: ");
            String name = scanner.nextLine();
            System.out.println("Enter the student's age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the student's GPA: ");
            double avgPoint = Double.parseDouble(scanner.nextLine());
            Students students = new Students(name, age, avgPoint);
            peopleList.add(students);
            System.out.println("Added successfully!!");
        }

    }

    @Override
    public void findPeople() {
        System.out.println("Enter the number you want to find: ");
        int id = Integer.parseInt(scanner.nextLine());
        int number = findIndexById(id);
        if (number == -1) {
            System.out.println("No IDs found");
        } else {
            System.out.println(peopleList.get(number));
        }
    }

    @Override
    public void deletePeople() {
        System.out.println("Enter the number you want to find: ");
        int id = Integer.parseInt(scanner.nextLine());
        int number = findIndexById(id);
        if (number == -1) {
            System.out.println("No IDs found");
        } else {
            peopleList.remove(number);
        }
    }

    @Override
    public void editPeople() {
        System.out.println("Enter the number you want to find: ");
        int id = Integer.parseInt(scanner.nextLine());
        int number = findIndexById(id);
        if (number == -1) {
            System.out.println("No IDs found");
        } else {
            System.out.println("Enter new name (leave blank to keep current name): ");
            String newName = scanner.nextLine();
            if (!newName.equals("")) {
                peopleList.get(number).setName(newName);
            }
            System.out.println("Enter new age (leave blank to keep current age): ");
            int age1 = Integer.parseInt(scanner.nextLine());
            peopleList.get(number).setAge(age1);

            System.out.println("Enter new student's GPA: ");
            double avgPoint1 = Double.parseDouble(scanner.nextLine());
            ((Students) peopleList.get(number)).setAvgPoint(avgPoint1);
        }
        System.out.println("Updated successfully!");
    }

    @Override
    public void SortUpAscending() {
        peopleList.sort(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                if (o1 instanceof Students && o2 instanceof Students) {
                    double avg1 = ((Students) o1).getAvgPoint();
                    double avg2 = ((Students) o2).getAvgPoint();
                    return Double.compare(avg1, avg2);
                } else {
                    return 0;
                }
            }
        });
    }

    @Override
    public  void sortDescending() {
        peopleList.sort(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                if (o1 instanceof Students && o2 instanceof Students) {
                    double avg1 = ((Students) o1).getAvgPoint();
                    double avg2 = ((Students) o2).getAvgPoint();
                    return Double.compare(avg1, avg2);
                } else {
                    return 0;
                }
            }
        }.reversed());
    }

    @Override
    public void totalAvg() {
        double total = 0;
        for (People people : peopleList) {
            if (people instanceof Students) {
                total += ((Students) people).getAvgPoint();
            }
        }
        System.out.println("The student's total point is: " + total);
    }

}

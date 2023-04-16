package Day_14_4;

import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PeopleManager peopleList = new PeopleManager();
        int choice;
        do {
            System.out.println("---MENU---");
            System.out.println("1. Show all Student");
            System.out.println("2. Addition new student to list");
            System.out.println("3. Find student on list by id");
            System.out.println("4. Delete student on list by id");
            System.out.println("5. Edit student on list by id");
            System.out.println("6. Sort the list by grade point average");
            System.out.println("7. Overall GPA");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    peopleList.showPeople();
                    break;
                case 2:
                    peopleList.additionPeople();
                    peopleList.showPeople();
                    break;
                case 3:
                    peopleList.findPeople();
                    peopleList.showPeople();
                    break;
                case 4:
                    peopleList.deletePeople();
                    peopleList.showPeople();
                    break;
                case 5:
                    peopleList.editPeople();
                    peopleList.showPeople();
                    break;
                case 6:
                    System.out.println("1. Sort points in ascending");
                    System.out.println("2. Sort points in descending");
                    System.out.println("Enter your choice");
                    int choice2 = Integer.parseInt(scanner.nextLine());
                    switch (choice2) {
                        case 1:
                            peopleList.SortUpAscending();
                            peopleList.showPeople();
                            break;
                        case 2:
                            peopleList.sortDescending();
                            peopleList.showPeople();
                            break;
                    }
                    break;
                case 7:
                    peopleList.totalAvg();
                    break;
                case 0:
                    System.exit(0);
//                default:
//                    System.out.println("no choice");
            }
        } while (true);
    }
}

package pages;

import java.util.ArrayList;
import java.util.Scanner;

import models.Task;
import utils.Utils;

public class Home extends Page {

    private  ArrayList<Task> tasks;

    Scanner sc = new Scanner(System.in);

    public Home(String title) {
        super(title);
    }

    @Override
    public void display() {
        Utils.ClearCLI();
        Utils.BlankLine(2);
        System.out.println("Welcome to the " + super.title + "page");
        Utils.BlankLine(1);
        Utils.HorizontalRule();
        todoListElement();
        Utils.BlankLine(4);
        Utils.HorizontalRule();
        inputMenu();
    }

    private void todoListElement() {
        if (tasks == null || tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("Todo List:");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println((i + 1) + ". " + task.toString());
        }
    }

    private void inputMenu() {
        System.out.println("Select an option:");
        System.out.println("\nTask Manager CLI");
        System.out.println("1. Add Task");
        System.out.println("2. Delete Task");
        System.out.println("3. Update Task");
        System.out.println("4. Save and Exit");
        System.out.println("5. Go back");

        Utils.InputComponent("choice");
        takeUserInput();
    }

    private void takeUserInput() {
        boolean goBack = false;
        while (!goBack) {
            try {
                int choice = Integer.parseInt(sc.nextLine());
                //TODO: implement these funtionalities 
                switch (choice) {
                    case 1:
                        System.out.println("Add");
                        break;
                    case 2:
                        System.out.println("Delete");
                        break;
                    case 3:
                        System.out.println("MOdify");
                        break;
                    case 4:
                        System.out.println("Saved and Exiting ...");
                        System.exit(0);
                        break;
                    case 5:
                        System.out.println("Returning to Home Page");
                        goBack = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose a valid option.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }

        }
    }

}

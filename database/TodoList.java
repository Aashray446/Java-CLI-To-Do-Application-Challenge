package database;

import java.io.*;
import java.util.ArrayList;
import models.Task;

public class TodoList {
    private static final String FILE_NAME = "tasks.dat";
    private static ArrayList<Task> taskList = new ArrayList<>();

    // Write the task list to a file
    public static void writeToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(taskList);
            System.out.println("Tasks saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }

    // Read the task list from a file
    @SuppressWarnings("unchecked")
    public static ArrayList<Task> readFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            taskList = (ArrayList<Task>) ois.readObject();
            System.out.println("Tasks loaded successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("No saved tasks found. Starting with an empty list.");
            taskList = new ArrayList<>(); 
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading tasks: " + e.getMessage());
            taskList = new ArrayList<>(); 
        }
        return taskList;
    }


    // Get the task list
    public static ArrayList<Task> getTaskList() {
        return taskList;
    }
}

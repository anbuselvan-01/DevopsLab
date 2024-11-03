package com.example.todo;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {
    private ArrayList<String> tasks = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TodoApp app = new TodoApp();
        app.run();
    }

    private void run() {
        while (true) {
            System.out.println("\n1. Add Task\n2. View Tasks\n3. Remove Task\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());
            
            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    removeTask();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void addTask() {
        System.out.print("Enter a task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added.");
    }

    private void viewTasks() {
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    private void removeTask() {
        System.out.print("Enter task number to remove: ");
        int taskNum = Integer.parseInt(scanner.nextLine()) - 1;
        if (taskNum >= 0 && taskNum < tasks.size()) {
            tasks.remove(taskNum);
            System.out.println("Task removed.");
        } else {
            System.out.println("Invalid task number.");
        }
    }
}

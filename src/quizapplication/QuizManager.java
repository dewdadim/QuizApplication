/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapplication;

import java.io.*;

/**
 *
 * @author dewda
 */
public class QuizManager {
    public static void createEmptyFile(String filePath) {
        try {
            File file = new File(filePath);
            boolean isCreated = file.createNewFile();

            if (isCreated) {
                System.out.println("Empty file created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }
    
    public static void saveObject(Object object, String fileName) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(object);
            System.out.println("Object saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving object: " + e.getMessage());
        }
    }

    public static Object loadObject(String fileName) {
        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Object object = objectInputStream.readObject();
            System.out.println("Object loaded successfully.");
            return object;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading object: " + e.getMessage());
            return null;
        }
    }
    
    public static void saveObject(Object[] objects, String fileName) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(objects);
            System.out.println("Objects saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving objects: " + e.getMessage());
        }
    }
    
    public static void clearTextFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("");
            System.out.println("Text file cleared successfully.");
        } catch (IOException e) {
            System.out.println("Error clearing text file: " + e.getMessage());
        }
    }
    
    public static boolean isFileEmpty(String filePath) {
        File file = new File(filePath);

        if (file.exists() && file.length() == 0) {
            return true; // File is empty
        } else {
            return false; // File is not empty or does not exist
        }
    }
}

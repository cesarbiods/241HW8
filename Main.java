/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc241hw08;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cesar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Welcome to Binary Tree Sorter");

        Scanner kb = new Scanner(System.in);
        boolean doneRunning = false;
        String userInput = new String();
        BinarySearchTree bst = new BinarySearchTree();

        while (!doneRunning) {
            System.out.println("Enter a command (i, c, in, pre, post, or q):");
            userInput = kb.nextLine();
            String parts[] = userInput.split(" ");

            if (userInput.equalsIgnoreCase("q")) {
                doneRunning = true;
            } else if (parts[0].equalsIgnoreCase("i")) {
                bst.insert(parts[1]);
            } else if (parts[0].equalsIgnoreCase("c")) {
                if (bst.contains(parts[1])) {
                    System.out.println(parts[1] + " is contained in the tree.");
                } else {
                    System.out.println(parts[1] + " is not in the tree.");
                }
            } else if (parts[0].equalsIgnoreCase("in")) {
                if (!bst.PrintInOrder().equals("")) {
                    System.out.println("In-order:");
                    System.out.println(bst.PrintInOrder());
                } else {
                    System.out.println("The tree has no nodes.");
                }
            } else if (parts[0].equalsIgnoreCase("pre")) {
                if (!bst.PrintPreOrder().equals("")) {
                    System.out.println("Pre-order:");
                    System.out.println(bst.PrintPreOrder());
                } else {
                    System.out.println("The tree has no nodes.");
                }
            } else if (parts[0].equalsIgnoreCase("post")) {
                if (!bst.PrintPostOrder().equals("")) {
                    System.out.println("Post-order:");
                    System.out.println(bst.PrintPostOrder());
                } else {
                    System.out.println("The tree has no nodes.");
                }
            } else {
                System.out.println("Invalid command -- " + parts[0]);
            }
        }
        System.out.println("Closing Binary Tree Sorter");
    }

}

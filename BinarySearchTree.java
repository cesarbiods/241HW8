/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc241hw08;

/**
 *
 * @author Cesar
 */
public class BinarySearchTree {
    
    private static Node root;
    
    public BinarySearchTree() {
        root = null;
    }
    
    public boolean isEmpty() {
        return root == null;
    }
    
    public void insert(String v) {
        if (this.isEmpty()) {
            root = new Node(v);
        } else {
            root.insert(v);
        }
    }
    
    public boolean contains(String v) {
        if (this.isEmpty()) {
            return false;
        } else {
            return root.contains(v);
        }
    }
    
    public String PrintInOrder() {
        String print ="";
        if (!this.isEmpty()) {
            print = root.printInOrder();
        }
        return print;
    }
    
    public String PrintPreOrder() {
        String print ="";
        if (!this.isEmpty()) {
            print = root.printPreOrder();
        }
        return print;
    }
    
    public String PrintPostOrder() {
        String print ="";
        if (!this.isEmpty()) {
            print = root.printPostOrder();
        }
        return print;
    }
    
}

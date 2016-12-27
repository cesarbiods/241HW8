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
public class Node {

    private String value;
    private Node right, left;

    public Node(String v) {
        value = v;
        right = null;
        left = null;
    }

    public Node insert(String v) {
        // TODO this return is correct?
        if (value.compareToIgnoreCase(v) >= 0) {
            if (left == null) {
                left = new Node(v);
                return left;
            } else {
                return left.insert(v);
            }
        } else {
            if (right == null) {
                right = new Node(v);
                return right;
            } else {
                return right.insert(v);
            }
        }
    }

    public boolean contains(String v) {
        boolean found = false;
        if (value.compareToIgnoreCase(v) == 0) {
            found = true;
        } else if (value.compareToIgnoreCase(v) > 0) {
            if (left != null) {
                found = left.contains(v);
            }
        } else if (value.compareToIgnoreCase(v) < 0) {
            if (right != null) {
                found = right.contains(v);
            }
        }
        return found;
    }

    public String printInOrder() {
        // go left
        String print = "";
        if (left != null) {
            print += left.printInOrder();
            //left.printInOrder();
        }
        // visit
        print += "[" + value + "]";
        //System.out.print("[" + value + "]");

        //go right
        if (right != null) {
            print += right.printInOrder();
            //right.printInOrder();
        }
        return print;
    }

    public String printPreOrder() {
        String print = "";
        // visit
        print += "[" + value + "]";

        // go left
        if (left != null) {
            print += left.printPreOrder();
        }

        //go right
        if (right != null) {
            print += right.printPreOrder();
        }
        return print;

    }

    public String printPostOrder() {
        String print = "";
        // go left
        if (left != null) {
            print += left.printPostOrder();
        }

        //go right
        if (right != null) {
            print += right.printPostOrder();
        }

        // visit
        print += "[" + value + "]";

        return print;
    }

}

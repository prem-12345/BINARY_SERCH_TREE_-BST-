package com.bridgelabz.binaryserchtree;

public class BinarySearchTreeMain {
    public static void main(String[] args) {

    // "Welcome to Binary Search Tree Program"

        BinarySearchTree bst = new BinarySearchTree();
        Node root = null;

        root = bst.insert(root, 56);
        root = bst.insert(root, 30);
        root = bst.insert(root, 70);

        bst.print(root);


    }
}
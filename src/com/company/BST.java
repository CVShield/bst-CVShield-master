package com.company;

public class BST {


    public void add(Object itemToAdd) {

    }

    public void remove(Object itemToRemove) {

    }


    public void preOrderTraversal(Node node)  {
            if (node == null)
                return;

            //first print root node first
            System.out.print(node.key + " ");
            // traverse left
            preOrderTraversal(node.left);
            // traverse right
            preOrderTraversal(node.right);
    }


    public Object find(Object objectToFind) {
    return null;
    }


    public void inOrderTraversal(Node node)  {
        if (node == null)
            return;
        //traverse left
        inOrderTraversal(node.left);

        //root
        System.out.print(node.key + " ");

        //traverse right
        inOrderTraversal(node.right);
    }


    public void postOrderTraversal(Node node) {
        if (node == null)
            return;

        // traverse left
        postOrderTraversal(node.left);

        // traverse right
        postOrderTraversal(node.right);

        // root
        System.out.print(node.key + " ");
    }

    public void breadthFirstSearch() {

    }

    public void clear() {

    }

    public int size() {
        return 0;
    }


//works
    public class Node {
        int key;
        Node left, right;
        public Node(int data) {
            key = data;
            left = right = null;
        }
    }


}

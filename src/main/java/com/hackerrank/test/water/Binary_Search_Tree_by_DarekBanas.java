package com.hackerrank.test.water;

/**
 * Created by jackalhan on 2/15/17.
 */

public class Binary_Search_Tree_by_DarekBanas {

    public static class BinaryTree {
        Node root;

        public void addNode(int value, String name) {
            Node newNode = new Node(value, name);
            if (root == null) {
                root = newNode;
            } else {
                Node focusNode = root;
                Node parent;
                while (true) {
                    parent = focusNode;
                    if (value > focusNode.value) {
                        focusNode = focusNode.rightChild;
                        if (focusNode == null) {
                            parent.rightChild = newNode;
                            return;
                        }
                    } else {
                        focusNode = focusNode.leftChild;
                        if (focusNode == null) {
                            parent.leftChild = newNode;
                            return;
                        }
                    }
                }
            }
        }

        // THREE TYPES OF TRAVERSER IN BINARY TREE

        // INORDER TRAVERSE : ASCENDING ORDER : Left Child, parent , Right Child
        // Result : 5, 15, 20.....
        public void inOrderTraverseTree(Node focusNode) {
            if (focusNode != null) {

                inOrderTraverseTree(focusNode.leftChild);
                System.out.println(focusNode); //Node has a toString method, it is auto called with System.out
                inOrderTraverseTree(focusNode.rightChild);
            }
        }

        //Pre Order : parent node, left child, right child
        // Result : 50 , 25 , 15
        public void preOrderTraverseTree(Node focusNode) {
            if (focusNode != null) {
                System.out.println(focusNode); //Node has a toString method, it is auto called with System.out
                preOrderTraverseTree(focusNode.leftChild);
                preOrderTraverseTree(focusNode.rightChild);
            }
        }

        //Post Order : left child, right child, parent
        // Result : 50 , 25 , 15
        public void postOrderTraverseTree(Node focusNode) {
            if (focusNode != null) {
                postOrderTraverseTree(focusNode.leftChild);
                postOrderTraverseTree(focusNode.rightChild);
                System.out.println(focusNode); //Node has a toString method, it is auto called with System.out
            }
        }

        public Node searchNode(int value) {
            Node focusNode = root;
            while (focusNode.value != value) {
                if (value > focusNode.value) {
                    focusNode = focusNode.rightChild;
                } else {
                    focusNode = focusNode.leftChild;
                }
                // for preventing endless loop
                if (focusNode == null) {
                    return null;
                }
            }

            return focusNode;
        }

        public boolean remove(int value) {
            Node focusedNode = root;
            Node parent = root;

            boolean isAtLeftChild = true;

            while (focusedNode.value != value) {
                parent = focusedNode;
                if (value > focusedNode.value) {
                    isAtLeftChild = false;
                    focusedNode = focusedNode.rightChild;
                } else {
                    isAtLeftChild = true;
                    focusedNode = focusedNode.leftChild;
                }

                if (focusedNode == null) {
                    return false;
                }
            }

            if (focusedNode.leftChild == null && focusedNode.rightChild == null) {
                if (root == focusedNode) {
                    root = null;
                } else if (isAtLeftChild) {
                    parent.leftChild = null;
                } else {
                    parent.rightChild = null;
                }
            } else if (focusedNode.leftChild == null) {
                if (root == focusedNode) {
                    root = focusedNode.rightChild;
                } else if (isAtLeftChild) {
                    parent.leftChild = focusedNode.rightChild;
                } else {
                    parent.rightChild = focusedNode.rightChild;
                }
            } else if (focusedNode.rightChild == null) {
                if (root == focusedNode) {
                    root = focusedNode.leftChild;
                } else if (isAtLeftChild) {
                    parent.leftChild = focusedNode.leftChild;
                } else {
                    parent.rightChild = focusedNode.leftChild;
                }
            } else {
                Node replacement = getReplacementNode(focusedNode);
                if (root == focusedNode) {
                    root = replacement;
                } else if (isAtLeftChild) {
                    parent.leftChild = replacement;
                } else {
                    parent.rightChild = replacement;
                }
                replacement.leftChild = focusedNode.leftChild;

            }
            return true;

        }

        private Node getReplacementNode(Node toBeDeleted) {
            Node replacementParentNode = toBeDeleted;
            Node replacement = toBeDeleted;
            Node focusNode = toBeDeleted.rightChild;
            while (focusNode != null) {
                replacementParentNode = replacement;
                replacement = focusNode;
                focusNode = focusNode.leftChild;
            }

            if (replacement != toBeDeleted.rightChild) {
                replacementParentNode.leftChild = replacement.rightChild;
                replacement.rightChild = toBeDeleted.leftChild;
            }
            return replacement;
        }

    }

    public static class Node {
        int value;
        String name;

        Node leftChild;
        Node rightChild;

        public Node(int value, String name) {
            this.value = value;
            this.name = name;
        }

        public String toString() {
            return name + " has a value of " + value;
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addNode(50, "Boss");
        binaryTree.addNode(25, "VP");
        binaryTree.addNode(15, "OM");
        binaryTree.addNode(30, "S");
        binaryTree.addNode(75, "SM");
        binaryTree.addNode(70, "S1");

        System.out.println("***************************************");
        System.out.println("In Order Traverse");
        binaryTree.inOrderTraverseTree(binaryTree.root);

        System.out.println("***************************************");
        System.out.println("Pre Order Traverse");
        binaryTree.preOrderTraverseTree(binaryTree.root);

        System.out.println("***************************************");
        System.out.println("Post Order Traverse");
        binaryTree.postOrderTraverseTree(binaryTree.root);


        System.out.println("***************************************");
        System.out.println("Searching value : 30");
        System.out.println(binaryTree.searchNode(30));

        System.out.println("***************************************");
        System.out.println("Remove Key 25");
        binaryTree.remove(25);

        System.out.println("***************************************");
        System.out.println("Searching value : 25");
        System.out.println(binaryTree.searchNode(25));


    }

}

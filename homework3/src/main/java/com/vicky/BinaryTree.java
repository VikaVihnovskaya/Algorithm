package com.vicky;

import java.util.ArrayList;

public class BinaryTree {
    private TreeNode head;

    private class TreeNode {
        Integer value;
        private TreeNode left;
        private TreeNode right;
        private Color color;
    }

    private enum Color {
        RED, BLACK
    }

    public boolean find(int value) {
        TreeNode currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) return true;
            else if (value > currentNode.value) {
                currentNode = currentNode.right;
            } else {
                currentNode = currentNode.left;
            }
        }
        return false;
    }

    public boolean add(int value) {
        if (head != null) {
            boolean result = addNode(head, value);
            head = rebalance(head);
            head.color = Color.BLACK;
            return result;
        } else {
            head = new TreeNode();
            head.color = Color.BLACK;
            head.value = value;
            return true;
        }
    }

    private boolean addNode(TreeNode node, Integer value) {
        if (node.value==value) {
            return false;
        } else {
            if (node.value.compareTo(value)>0) {
                if (node.left != null) {
                    boolean result = addNode(node.left, value);
                    node.left = rebalance(node.left);
                    return result;
                } else {
                    node.left = new TreeNode();
                    node.left.color = Color.RED;
                    node.left.value = value;
                    return true;
                }
            } else {
                if (node.right != null) {
                    boolean result = addNode(node.right, value);
                    node.right = rebalance(node.right);
                    return result;
                } else {
                    node.right = new TreeNode();
                    node.right.color = Color.RED;
                    node.right.value = value;
                    return true;
                }
            }
        }
    }

    private TreeNode rebalance(TreeNode node) {
        TreeNode result = node;
        boolean needRebalance;
        do {
            needRebalance = false;
            if (result.right != null && result.right.color == Color.RED &&
                    (result.left == null || result.left.color == Color.BLACK)) {
                needRebalance = true;
                result = rightSwap(result);
            }
            if (result.left != null && result.left.color == Color.RED &&
                    result.left.left != null && result.left.left.color == Color.RED) {
                needRebalance = true;
                result = leftSwap(result);
            }
            if (result.left != null && result.left.color == Color.RED &&
                    result.right != null && result.right.color == Color.RED) {
                needRebalance = true;
                colorSwap(result);
            }
        }
        while (needRebalance);
        return result;
    }

    private TreeNode rightSwap(TreeNode node) {
        TreeNode rightChild = node.right;
        TreeNode betweenChild = rightChild.left;
        rightChild.left = node;
        node.right = betweenChild;
        rightChild.color = node.color;
        node.color = Color.RED;
        return rightChild;
    }

    private TreeNode leftSwap(TreeNode node) {
        TreeNode leftChild = node.left;
        TreeNode betweenChild = leftChild.right;
        leftChild.right = node;
        node.left = betweenChild;
        leftChild.color = node.color;
        node.color = Color.RED;
        return leftChild;
    }

    private void colorSwap(TreeNode node) {
        node.right.color = Color.BLACK;
        node.left.color = Color.BLACK;
        node.color = Color.RED;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(1);
        binaryTree.add(6);
        binaryTree.add(8);
        binaryTree.add(11);
        binaryTree.add(13);
        binaryTree.add(15);
        binaryTree.add(17);
        binaryTree.add(22);
        binaryTree.add(25);
        binaryTree.add(27);

    }

}



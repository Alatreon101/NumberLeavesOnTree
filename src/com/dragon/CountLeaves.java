package src.com.dragon;

import java.util.Scanner;

public class CountLeaves {
    public static void main(String[] args) {
        try {
            System.out.print("Введите число (корень дерева): ");
            Scanner sc = new Scanner(System.in);
            int root = sc.nextInt();
            BinaryTree binaryTree = new BinaryTree(root);
            System.out.print("Введите количество узлов (числа узла будут подбираться случайно): ");
            int node = sc.nextInt();
            for (int i = 0; i < node; i++) {
                binaryTree.addNode((int) (Math.random() * 100));
            }
            binaryTree.countLeafs();
        } catch (Exception ex) {
            System.err.print("Введено не числовое значение!");
        }
    }
}

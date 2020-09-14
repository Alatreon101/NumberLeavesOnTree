package src.com.dragon;

public class BinaryTree {
    private Node root;
    private int countOfLeaves;

    public BinaryTree(int id) {
        root = new Node(id);
    }

    public void addNode(int nodeId) {
        addNode(root, new Node(nodeId));
    }

    private void addNode(Node current, Node newNode) {
        if (current.getId() < newNode.getId()) {
            if (current.getRightChild() == null) {
                current.setRightChild(newNode);
            } else {
                addNode(current.getRightChild(), newNode);
            }
        } else {
            if (current.getLeftChild() == null) {
                current.setLeftChild(newNode);
            } else {
                addNode(current.getLeftChild(), newNode);
            }
        }
    }

    public void countLeafs() {
        countLeafs(root);
        System.out.println("Число листьев = " + countOfLeaves);
    }

    private void countLeafs(Node currentNode) {
        if (currentNode != null) {

            if (!currentNode.isLeaf()) {
                countLeafs(currentNode.getLeftChild());
                countLeafs(currentNode.getRightChild());
            } else {
                countOfLeaves++;
                System.out.print("leaves - ");
            }
            System.out.println(currentNode.getId());
        }
    }
}

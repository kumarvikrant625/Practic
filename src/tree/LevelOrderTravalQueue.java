package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTravalQueue {

    Node root;

    public void levelOrderTraversalUtils(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.print(temp.data + " ");
            if(temp.left != null)
                queue.add(temp.left);
            if(temp.right != null)
                queue.add(temp.right);
        }
    }


    public static void main(String args[])
    {
        LevelOrderTraversal tree = new LevelOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Level order traversal of"
                + "binary tree is ");
        tree.printLevelOrder();
    }
}

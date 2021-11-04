import java.io.*;
import java.util.*;

public class Main {
    static int n;
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        Tree tree = new Tree();
        for(int i=0;i<n;i++)
        {
            st = new StringTokenizer(br.readLine(), " ");
            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);
            tree.createNode(root, left, right);
        }
        
        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
    }
}

class Node{
    char data;
    Node left;
    Node right;
    Node(char data)
    {
        this.data = data;
    }
}

class Tree{
    Node root;
    
    void createNode(char data, char leftData, char rightData)
    {
        if(root == null)
        {
            root = new Node(data);
            root.left = leftData != '.' ? new Node(leftData) : null;
            root.right = rightData != '.' ? new Node(rightData) : null;
        }
        else
        {
            searchNode(root, data, leftData, rightData);
        }
    }
    
    void searchNode(Node root, char data, char leftData, char rightData)
    {
        if(root == null) return;
        
        if(root.data == data)
        {
            root.left = leftData != '.' ? new Node(leftData) : null;
            root.right = rightData != '.' ? new Node(rightData) : null;
        }
        else
        {
            searchNode(root.left, data, leftData, rightData);
            searchNode(root.right, data, leftData, rightData);
        }
    }
    
    void preOrder(Node node)
    {
        if(node != null)
        {
            System.out.print(node.data);
            if(node.left != null) preOrder(node.left);
            if(node.right != null) preOrder(node.right);
        }
    }
    
    void inOrder(Node node)
    {
        if(node != null)
        {
            if(node.left != null) inOrder(node.left);
            System.out.print(node.data);
            if(node.right != null) inOrder(node.right);
        }
    }
    
    void postOrder(Node node)
    {
        if(node != null)
        {
            if(node.left != null) postOrder(node.left);
            if(node.right != null) postOrder(node.right);
            System.out.print(node.data);
        }
    }
}
class Node 
{  
    int key; 
    Node left, right; 
  
    public Node(int item) 
    { 
        key = item; 
        left = right = null; 
    } 
} 
  
class BinaryTree 
{ 
    // Root of Binary Tree 
    Node root; 
  
    BinaryTree() 
    { 
        root = null; 
    } 
    
    /* recursive inorder*/
    void recursiveInorder(Node node) 
    { 
        if (node == null) 
            return; 
  
        /* first recur on left child */
        recursiveInorder(node.left); 
  
        /* then print the data of node */
        System.out.print(node.key + " "); 
  
        /* now recur on right child */
        recursiveInorder(node.right); 
    }
    
    /* iterative inorder */
    void iterativeInorder(Node root) 
    { 
        if (root == null) 
            return; 
            
        Stack<Node> s = new Stack<Node>(); 
        Node curr = root; 
 
        while (curr != null || s.size() > 0) 
        { 

            while (curr !=  null) 
            { 
                s.push(curr); 
                curr = curr.left; 
            } 
 
            curr = s.pop(); 
  
            System.out.print(curr.key + " "); 
            curr = curr.right; 
        } 
    } 
    
    public static void main(String[] args) 
    { 
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
  
        System.out.println("\nInorder traversal of binary tree using recursive method is "); 
        tree.recursiveInorder(tree.root); 
  
        System.out.println("\nInorder traversal using iterative method is "); 
        tree.iterativeInorder(tree.root);  
    } 
} 

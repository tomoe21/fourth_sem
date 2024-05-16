public class q6 {
	Node root;
	boolean isBST() {
		return isBSTUntil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	boolean isBSTUntil(Node node,int min,int max) {
		if(node==null) return true;
		if(node.value<min || node.value>max) return false;
		return (isBSTUntil(node.left,min,node.value-1) && isBSTUntil(node.right,node.value+1,max));
	}
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(3);
        tree.root.left = new Node(2);
        tree.root.right = new Node(4);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(2);

        if(tree.isBST()) System.out.println("Given binary tree is a BST.");
        else System.out.println("Given binary tree is not a BST.");    
	}
}
public class Node{
	int value;
	Node left,right;
	Node(int value){
		this.value=value;
		left=right=null;
	}
}

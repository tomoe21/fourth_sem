public class Node{
	int info;
	Node left,right;
	Node(int info){
		this.info=info;
		left=right=null;
	}
}
public class BinarySearchTree {
	Node root;
	BinarySearchTree(){
		root=null;
	}

	void insert(int key) {
		root=insertRec(root,key);
	}
	Node insertRec(Node root,int key) {
		if(root==null) {
			root=new Node(key);
			return root;
		}
		if(key<root.info) root.left=insertRec(root.left,key);
		else if(key>root.info) root.right=insertRec(root.right,key);
		return root;
	}

	void delete(int key) {
		deleteRec(root,key);
	}
	Node deleteRec(Node root,int key) {
		if(root==null) return root;
		if(key<root.info) root.left=deleteRec(root.left,key);
		else if(key>root.info) root.right=deleteRec(root.right,key);
		else {
			if(root.left==null) return root.right;
			else if(root.right==null) return root.left;

			root.info=minValue(root.right);
			root.right=deleteRec(root.right,root.info);
		}
		return root;
	}

	int minValue(Node root) {
		int min=root.info;
		while(root.left!=null) {
			min=root.left.info;
			root=root.left;
		}
		return min;
	}
	void inorder() {
		inorderRec(root);
	}

	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.info + " ");
			inorderRec(root.right);
		}
	}
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();

        bst.insert(150);
        bst.insert(130);
        bst.insert(120);
        bst.insert(140);
        bst.insert(170);
        bst.insert(160);
        bst.insert(180);

        System.out.println("Inorder traversal before deletion:");
        bst.inorder();
        System.out.println();

        bst.delete(150);

        System.out.println("Inorder traversal after deletion:");
        bst.inorder();
	}
}


public class BSTNode {
	int info;
	BSTNode left,right;
	BSTNode(int info){
		this.info=info;
		this.left=this.right=null;
	}
}
public class BinarySearchTree{
	BSTNode root;
	
	BinarySearchTree(){
		this.root=null;
	}
	
	void insert(int key) {
		root=insertRec(root,key);
	}
	
	BSTNode insertRec(BSTNode root,int key) {
		if(root==null) {
			root=new BSTNode(key);
			return root;
		}
		if(key<root.info) root.left=insertRec(root.left,key);
		else if(key>root.info) root.right=insertRec(root.right,key);
		
		return root;
	}
	
	void inorderTraversal() {
		System.out.print("In-Order traversal: ");
		inorder(root);
		System.out.println();
	}
	void inorder(BSTNode root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.info+" ");
			inorder(root.right);
		}
	}
	
	
	void preorderTraversal() {
		System.out.print("Pre-Order traversal: ");
		preorder(root);
		System.out.println();
	}
	void preorder(BSTNode root){
		if(root!=null) {
			System.out.print(root.info+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	
	void postorderTraversal() {
		System.out.print("Post-Order traversal: ");
		postorder(root);
		System.out.println();
	}
	void postorder(BSTNode root) {
		if(root!=null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.info+" ");
		}
	}
}
public class q2 {
	public static void main(String[] args) {
		
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(50);
		bst.insert(20);
		bst.insert(40);
		bst.insert(10);
		bst.insert(70);
		bst.insert(30);
		bst.insert(50);
		
		bst.inorderTraversal();
		bst.preorderTraversal();
		bst.postorderTraversal();
	}
}

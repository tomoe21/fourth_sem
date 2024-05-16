public class BSTNode {
	int info;
	BSTNode left,right;
	BSTNode(int info){
		this.info=info;
		left=right=null;
	}
}
public class BinarySearchTree {
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
}
public class q1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(50);
		bst.insert(20);
		bst.insert(40);
		bst.insert(10);
		bst.insert(70);
		bst.insert(30);
		bst.insert(50);
		
		System.out.println(bst.root.info);
		System.out.println(bst.root.left.info);
		System.out.println(bst.root.right.info);
		System.out.println(bst.root.left.left.info);
		System.out.println(bst.root.left.right.info);
	}
}

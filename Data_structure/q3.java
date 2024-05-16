public class BNode {
	Country info;
	BNode left,right;
	BNode(Country info) {
		this.info=info;
		left=right=null;
	}
}
public class BST {
	BNode root;
	
	BST(){
		this.root=null;
	}
	
	void insert(Country country) {
		root=insertRec(root,country);
	}
	
	BNode insertRec(BNode root,Country country) {
		if(root==null) {
			root=new BNode(country);
			return root;
		}
		
		if(country.name.compareTo(root.info.name)<0) root.left=insertRec(root.left,country);
		else if(country.name.compareTo(root.info.name)>0) root.right=insertRec(root.right,country);
		
		return root;
	}
}
public class Country {
	String name;
	int population;
	
	Country(String name, int population){
		this.name=name;
		this.population=population;
	}
}
public class q3 {
	public static void main(String[] args) {
		BST bst=new BST();
		bst.insert(new Country("India",140));
		bst.insert(new Country("China",139));
		bst.insert(new Country("Pakistan",25));
		bst.insert(new Country("USA",35));
		bst.insert(new Country("Indonesia",20));
	}
}

/*
    class Node
    	int data;
    	Node left;
    	Node right;
	*/
public static Node lca(Node root, int v1, int v2) {
        Node current=root;
        Node result=root;
        while (current.right!=null&&current.left!=null){
        if(current.right.data<v1&&current.right.data<v2){
        current=current.right;
        result=current;
        }else if(current.left.data>v1&&current.left.data>v2){
        current=current.left;
        result=current;
        }else
        break;
        }
        return result;
        }
import java.util.Scanner;

public class BinaryTreeUse {

    public static void printTreeDetailed(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }

        System.out.print(root.data+ ":");
        if(root.left!=null){
            System.out.print("L"+ root.left.data + ",");
        }
        if(root.right!=null){
            System.out.print("R"+ root.right.data );
        }
        System.err.println();
        printTreeDetailed (root.left);
        printTreeDetailed (root.right);
    }

    public static void printTree(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }

        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
    }

    public static int NoOfNodes(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }

        
       int left= NoOfNodes(root.left);
        int right=NoOfNodes(root.right);
        return 1+left+ right;
    }

    public static BinaryTreeNode<Integer> takeInput(){
        System.out.println("Enter root data");
        Scanner s=new Scanner(System.in);
        int rootData=s.nextInt();

        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild=takeInput();
        BinaryTreeNode<Integer> rightChild=takeInput();
        root.left=leftChild;
        root.right=rightChild;
        return root;
       
    }
    public static void main(String[] args) {
        // BinaryTreeNode<Integer> root=new BinaryTreeNode<>(1);
        // BinaryTreeNode<Integer> node1=new BinaryTreeNode<>(2);
        // BinaryTreeNode<Integer> node2=new BinaryTreeNode<>(3);
        // BinaryTreeNode<Integer> node3=new BinaryTreeNode<>(4);
        // BinaryTreeNode<Integer> node4=new BinaryTreeNode<>(5);

        // root.left=node1;
        // root.right=node2;
        // node1.right=node3;
        // node2.left=node4;

        BinaryTreeNode<Integer> root=takeInput();

        printTreeDetailed(root);
        System.out.println(NoOfNodes(root));
    }
}

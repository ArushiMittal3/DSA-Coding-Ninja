import java.util.Scanner;

public class TreeUse {
    public static TreeNode<Integer> takeInput(){
        int n;
        Scanner s=new Scanner(System.in);
        System.err.println("Enter data");
        n=s.nextInt();
        TreeNode<Integer> root=new TreeNode<Integer>(n);
        System.out.println("Enter number of childen for " + n);

        int childCount=s.nextInt();
        for(int i=0;i<childCount;i++){
            TreeNode<Integer> child=takeInput();
            root.children.add(child);
        }
        return root;
    }

    public static int numNodes(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int count=1;
        for(int i=0;i<root.children.size();i++){
            count+=numNodes(root.children.get(i));
        }
        return count;
    }

    public static void printTree(TreeNode<Integer> root){
        String s=root.data +":";
        for(int i=0;i<root.children.size();i++){
            s=s+ root.children.get(i).data +",";
        }

        System.out.println(s);

        for(int i=0;i<root.children.size();i++){
            printTree(root.children.get(i));;
        }
    }
    public static void main(String[] args) {
        TreeNode<Integer> root=takeInput();
        // TreeNode<Integer> node1=new TreeNode<Integer>(2);
        // TreeNode<Integer> node2=new TreeNode<Integer>(3);
        // TreeNode<Integer> node3=new TreeNode<Integer>(4);
        // TreeNode<Integer> node4=new TreeNode<Integer>(5);


        // root.children.add(node1);
        // root.children.add(node2);
        // root.children.add(node3);
        // node2.children.add(node4);

        printTree(root);
        System.out.println(numNodes(root));
    }
}
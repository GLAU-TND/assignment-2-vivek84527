/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
import problem1.node.TreeNode;;
// to implement BinarySearchTree
public class MyBinarySearchTree {
    TreeNode root;

    public TreeNode getRoot() {
        return root;
    }
    public void insert(int data){
        TreeNode node = new TreeNode(data);
        if(root == null){
            root=node;
        }
        else{
            TreeNode temp=root;
            TreeNode parent = null;
            while(temp!=null){
                parent=temp;
                if(node.getData()<=temp.getData()){
                    temp=temp.getLeft();
                }
                else{
                    temp=temp.getRight();
                }
            }
            if (node.getData()<=parent.getData()){
                parent.setLeft(node);
            }
            else{
                parent.setRight(node);
            }
        }


    }
    public void traverse(TreeNode node)
    {
        int c=0;
        if (node == null)
        { return;
        }
        if (node.getLeft() == null && node.getRight() == null)
        { System.out.printf("%d ", node.getData());
        }
        traverse(node.getLeft());
        if(node.getLeft()==null){
            c++;
        }
        System.out.println("the number of node doesn't have left child is-"+c);

    }
    // Traverse(pre - order)
    public void traversePreOrder(TreeNode node){
        if(node!=null){
            System.out.print(node.getData() + ", ");
            traversePreOrder(node.getLeft());
            traversePreOrder(node.getRight());
        }
    }

    // Traverse(in - order)         (increasing sequence)

    public void traverseInOrder(TreeNode node){
        if(node!=null){
            traverseInOrder(node.getLeft());
            System.out.print(node.getData()+", ");
            traverseInOrder(node.getRight());
        }

    }

    // Traverse(post - order)

    public void traversePostOrder(TreeNode node){
        if(node!=null){

            traversePostOrder(node.getLeft());
            traversePostOrder(node.getRight());
            System.out.print(node.getData()+" ,");
        }


    }

}


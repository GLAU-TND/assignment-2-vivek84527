/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj=new MyBinarySearchTree();
        obj.insert(115);
        obj.insert(32);
        obj.insert(42);
        obj.insert(9);
        obj.insert(244);

        System.out.println("tree root= "+obj.getRoot().getData());
        obj.traversePreOrder(obj.getRoot());

        //after execution of the program, we see that in preOrder traverse, root is first element


        System.out.println();
        obj.traversePostOrder(obj.getRoot());

    }


}

/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem1.mybst.MyBinarySearchTree;

// executable class
// use problem5.student.Student class to create object of student
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

        //after execution of the program, we see that in postOrder traverse, root is last element



        /* Problem 2 (b)
        but in both traverse(pre,post) mid point is different.
         */

    }





}

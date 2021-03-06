/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;




public class App {
    public String getGreeting() {
        return "Hello World!";
    }



    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        //----------------------ch-15-----------------//

        BinarySearchTree<Integer> test = new BinarySearchTree<>(5);
        test.root.leftChild=new Node<>(8);
        test.root.rightChild=new Node<>(10);
        test.root.leftChild.leftChild=new Node<>(1);
        test.root.leftChild.rightChild=new Node<>(3);

        test.add(1);

//        System.out.println(test.contains(3,test.root));
//        System.out.println(test.inOrder(test.root).toString());



        //----------------------ch-16-----------------//
        BinarySearchTree<Integer> maxTest = new BinarySearchTree<>(5);
        maxTest.root.leftChild=new Node<>(8);
        maxTest.root.rightChild=new Node<>(10);
        maxTest.root.leftChild.leftChild=new Node<>(1);
        maxTest.root.leftChild.rightChild=new Node<>(3);

//        System.out.println(maxTest.maximum());

//----------------------ch17-----------------------------------------------//

//        BinarySearchTree<Integer> breadthTest = new BinarySearchTree<>(5);
//        breadthTest.root.leftChild=new Node<>(8);
//        breadthTest.root.rightChild=new Node<>(10);
//        breadthTest.root.leftChild.leftChild=new Node<>(1);
//        breadthTest.root.leftChild.rightChild=new Node<>(3);
//
//        System.out.println(breadthTest.breadthFirst(breadthTest));





        //------------------------ch18-----------------------//

        KaryTree<Integer> KaryTreeTest = new KaryTree<>(6);
        KaryTreeTest.add(3);
        KaryTreeTest.add(5);
        KaryTreeTest.add(6);

        System.out.println(fizzBuzzTree(KaryTreeTest).root.value);

    }




    //------------------------ch18-----------------------//


    public static KaryTree<String> fizzBuzzTree(KaryTree<Integer> tree){
        KaryTree<String> newTree = new KaryTree<>(tree.K);
        Queue<Knode<Integer>> queue = new LinkedList<>();
        if(tree.root != null){
            queue.add(tree.root);
            while(!queue.isEmpty()){

                Knode<Integer> current = queue.poll();
                String currentToString;
                if(current.value % 3 == 0 && current.value % 5 == 0)
                    currentToString = "FizzBuzz";
                else if((int)current.value % 3 == 0){
                    currentToString="Fizz";
                }
                else if((int)current.value % 5 == 0){
                    currentToString="Buzz";
                }
                else{
                    currentToString=current.value.toString();
                }
                newTree.add(currentToString);
                if(! current.allChildren.isEmpty()){
                    queue.addAll(current.allChildren);
                }
            }
        }
        return newTree;
    }








}


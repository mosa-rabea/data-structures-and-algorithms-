/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }



    @Test void BinaryTreeTest(){

        BinaryTree<Integer> binary1 = new BinaryTree<>();
        assertNull(binary1.root);



        BinaryTree<Integer> binary2 = new BinaryTree<>(1);
        assertEquals(1,binary2.root.value);


        binary2.root.leftChild = new Node<>(2);
        binary2.root.rightChild = new Node<>(3);
        assertEquals(2,binary2.root.leftChild.value);
        assertEquals(3,binary2.root.rightChild.value);



        assertEquals("[1, 2, 3]",binary2.preOrder(binary2.root).toString());



        assertEquals("[2, 1, 3]",binary2.inOrder(binary2.root).toString());



        assertEquals("[2, 3, 1]",binary2.postOrder(binary2.root).toString());









    }

    // -----------------ch16-------------//
@Test void maximumTest(){
    BinaryTree<Integer> binary1 = new BinaryTree<>();
    assertNull(binary1.root);



    BinaryTree<Integer> binary2 = new BinaryTree<>(1);
    assertEquals(1,binary2.root.value);


    binary2.root.leftChild = new Node<>(2);
    binary2.root.rightChild = new Node<>(3);
    //  binary tree
    assertEquals(3,binary2.maximum());


    // empty tree
    assertEquals(0,binary1.maximum());

}



    //-----------------------ch17---------------------//
    @Test void breadthFirstTest(){
        BinaryTree<Integer> binary2 = new BinaryTree<>(1);
        assertEquals(1,binary2.root.value);


        binary2.root.leftChild = new Node<>(2);
        binary2.root.rightChild = new Node<>(3);


        assertEquals("[1, 2, 3]",App.breadthFirst(binary2).toString());
    }



}
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");




//        Adding a key/value to your hashtable results in the value being in the data structure
        HashTable test = new HashTable<>(10);


        test.add("test","testing adding");
        assertEquals(true ,test.contains("test"));




//        Retrieving based on a key returns the value stored
        assertEquals("test adding",test.get("hi"));



//    returns null for a key that does not exist in the hashtable
        assertEquals(" Wrong Key",test.get("hello"));


//     collision within the hashtable
        test.add("a","this is the first");
        test.add(97,"this is the second");

        assertEquals("this is the first",test.arrayOfNodes[7].value);
        assertEquals("this is the second",test.arrayOfNodes[7].next.value);


//       retrieve a value from a bucket within the hashtable that has a collision
        assertEquals("this is the first",test.get("a"));



//       hash a key to an in-range value
        assertEquals(9,test.hash("hi"));
    }
}
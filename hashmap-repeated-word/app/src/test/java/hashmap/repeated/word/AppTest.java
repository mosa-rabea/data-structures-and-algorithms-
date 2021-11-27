/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashmap.repeated.word;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {

        //  repeatedWord

        String repeatedWordTest = "Once upon a time, there was a brave princess who...";
        assertEquals("a",App.repeatedWord(repeatedWordTest));



        //  didn't have a repeated words

        String NonRepeatedWordTest = "I wish that my death will make more cents than ma life";
        assertNull(App.repeatedWord(NonRepeatedWordTest));


    }
}